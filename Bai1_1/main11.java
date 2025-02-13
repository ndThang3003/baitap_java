package Bai1_1;

public class main11 {
    public static void main(String[] args) {
        Circle11 c1 = new Circle11();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        Circle11 c2 = new Circle11(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
    }
}