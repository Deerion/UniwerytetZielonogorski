package Lab_04.Zad_02;

public class TestPriorytetuWatkow
{
    public static void main(String arg[])
    {
        DzialajacyZiemniak2 dZ = new DzialajacyZiemniak2();

        Thread t1 = new Thread(dZ,"Pierwszy ziemniak");
        Thread t2 = new Thread(dZ,"Drugi ziemniak");
        Thread t3 = new Thread(dZ,"Trzeci ziemniak");


        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
