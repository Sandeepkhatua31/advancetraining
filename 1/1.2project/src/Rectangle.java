

import java.util.Scanner;

class Rectangle {
    int length; 
    int breadth; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle to find : ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle to find : ");
        breadth = in.nextInt();
    }
//
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle is to find = " + area);
        System.out.println("Perimeter of Rectangle is to find = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}