package classAndObject;

import java.util.Scanner;

public class Qsn03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and followed by three subject marks...!!!");

        String name = sc.nextLine();

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        Student s1 = new Student(name, mark1, mark2, mark3);

        s1.displayResult();
    }
}
class Student {

    public String name;
    public int mark1, mark2, mark3;

    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public void displayResult() {
        System.out.println("Name : " + name);
        System.out.println("Mark 1 : " + mark1);
        System.out.println("Mark 2 : " + mark2);
        System.out.println("Mark 3 : " + mark3);
        System.out.println("Total marks : " + calculateTotal());
        System.out.println("Average : " + calculateAverage());
    }
}