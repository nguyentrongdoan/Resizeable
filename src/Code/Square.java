package Code;

public class Square extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Square() {
    }
    public Square(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Square(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "A Square with"
                + getSide1()
                + "and"
                + getSide2()
                + "and"
                + getSide3()
                + "which is a: "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side1 = this.side1 * ( 1 + percent / 100);
        this.side2 += this.side2 * percent/100;
        this.side3 += this.side3 * percent/100;
    }
}
