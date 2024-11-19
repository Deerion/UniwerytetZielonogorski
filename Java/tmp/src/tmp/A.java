package tmp;

public class A {
    public int x;
    public int y;


    public A(int x,int y){
        this.x=x;
        this.y=y;
    }


    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public void wyswietl(){
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
    }
}
