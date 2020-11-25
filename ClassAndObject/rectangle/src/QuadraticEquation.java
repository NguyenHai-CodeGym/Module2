public class QuadraticEquation {
    private double  a,b,c;

    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double getDiscriminant(){
        return (this.b * this.b) - (4*this.a*this.c);
    }



}
