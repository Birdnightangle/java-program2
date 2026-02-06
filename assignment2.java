 import java.util.Scanner;
class Area {
    int length;
    int breadth;
    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }
    int getArea() {
        return length * breadth;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        Area rect = new Area();
        rect.setDim(length, breadth);
        System.out.println("Area of rectangle = " + rect.getArea());
        sc.close();
    }
}