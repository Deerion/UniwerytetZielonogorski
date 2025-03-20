package Lab_02.Zad_01;

public class Space3D extends Space2D {
    private double z;

    public Space3D() {
        super();
        this.z = 0;
    }
    public Space3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getX() {
        return super.getX();
    }
    public double getY() {
        return super.getY();
    }
    public double getZ() {
        return z;
    }

    public void setX(double x) {
        super.setX(x);
    }
    public void setY(double y) {
        super.setY(y);
    }
    public void setZ(double z) {
        this.z = z;
    }

    public void wyswietl() {
        System.out.println("x = " + getX() + ", y = " + getY() + ", z = " + getZ());
    }

    public double odleglosc3p(Space3D drugi) {
        return Math.sqrt(Math.pow(drugi.getX() - getX(), 2) + Math.pow(drugi.getY() - getY(), 2) + Math.pow(drugi.getZ() - z, 2));
    }

    public double odleglosc3Zero() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }
    public String toString() {
        return "x= " + getX() + ", y= " + getY() + ", z= " + z;
    }
    
}
