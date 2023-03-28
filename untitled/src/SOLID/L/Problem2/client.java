package SOLID.L.Problem2;

public class client {
    public static void main(String[] args) {
        int w = 2, h = 4;
        Rectangle rect = new Rectangle(w, h);
        System.out.println(rect.CalculateArea());

        //Rectangle square = new Square(w, w);
        //System.out.println(square.CalculateArea());
    }
}
