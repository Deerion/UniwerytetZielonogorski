package Lab_11;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.Console;
import java.util.Properties;
import java.util.Scanner;

public class Zad_04 {
    public static void main(String[] args) {
        Console console = System.console();
        Scanner scanner = new Scanner(System.in);

        if (console == null) {
            System.out.println("Brak dostępu do konsoli. Spróbuj uruchomić program z terminala.");
            return;
        }

        System.out.print("Podaj login (Jest to numer twojego indeksu): ");
        String login = scanner.nextLine();

        char[] passwordArray = console.readPassword("Podaj haslo: ");
        String password = new String(passwordArray);

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "poczta.stud.uz.zgora.pl");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.ssl.checkserveridentity", true);
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(login + "@stud.uz.zgora.pl", password);
            }
        });
        try {
            System.out.print("Podaj adres odbiorcy: (Pełny [Nr indeksu]@stud.uz.zgora.pl): ");
            String recipient = scanner.nextLine();
            System.out.print("Podaj temat wiadomosci: ");
            String subject = scanner.nextLine();
            System.out.print("Podaj tresc wiadomosci: ");
            String body = scanner.nextLine();

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(login + "@stud.uz.zgora.pl"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
            System.out.println("Wiadomość została wysłana do odbiorcy! Mam nadzieje że dijdzie pomyślnie.");

        } catch (MessagingException e) {
            System.err.println("Wystąpil blad podczas wysylania wiadomosci, odbiorca nie otrzyma wiadomości: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
