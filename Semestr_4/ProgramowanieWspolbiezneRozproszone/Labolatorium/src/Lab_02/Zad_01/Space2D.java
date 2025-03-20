package Lab_02.Zad_01;

public class Space2D {
    private double x;
    private double y;

    public Space2D() {
        this.x = 0;
        this.y = 0;
    }
    public Space2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void wyswietl(){
        System.out.println("x = " + x + ", y = " + y);
    }

    public double odleglosc2p(Space2D drugi) {
        return Math.sqrt(Math.pow(drugi.x - this.x, 2) + Math.pow(drugi.y - this.y, 2));
    }

    public double odleglosc2Zero() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public String toString(){
        return "x= " + x + ", y= " + y;
    }

    public double obwodTrojkata(Space2D p2, Space2D p3) {
        return this.odleglosc2p(p2) + p2.odleglosc2p(p3) + p3.odleglosc2p(this);
    }

    public double poleTrojkata(Space2D p2, Space2D p3) {
        double a = this.odleglosc2p(p2);
        double b = p2.odleglosc2p(p3);
        double c = p3.odleglosc2p(this);
        double p = (a + b + c) / 2;                 // Połowa obwodu trójkąta

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}
