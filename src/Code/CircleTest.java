package Code;

//import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    public static void main(String[] args) {
        Shape[] circle = new Circle[3];
        circle[0] = new Circle(3);
        circle[1] = new Circle(2);
        circle[2] = new Circle(4);


        for (Shape circles:circle){ // dung for each in ra cac phan tu trong mang shape.
            ((Circle)circles).resize((Math.random()*50)); // Ep kieu tham chieu ve kieu thuc te la Circle.
            System.out.println(((Circle) circles).getArea());
        }

        System.out.println("-----------------------------");
        Shape[] rectangle = new Rectangle[2];
        rectangle[0] = new Rectangle(2.0, 3.0);
        rectangle[1] = new Rectangle(5.0, 6.0);
        for (Shape rectangles: rectangle){
            ((Rectangle)rectangles).resize(50);
            System.out.println(((Rectangle)rectangles).getArea());
        }

        System.out.println("-----------------------------");
        Shape[] square = new Square[2];
        square[0] = new Square(2.0, 3.0, 6.0);
        square[1] = new Square(5.0, 6.0, 8.0);
        for (Shape squares: square){
            ((Square)squares).resize(50);
            System.out.println(((Square)squares).getPerimeter());
        }
    }
}