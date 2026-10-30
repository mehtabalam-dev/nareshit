package inheritancePrograms;

 import java.util.Scanner;

public class CoderideQsn05 {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details...");
        String name = sc.nextLine();
        int id = sc.nextInt();
        int marks = sc.nextInt();
        int attendence = sc.nextInt();

        Result obj = new Result(name,id,marks,attendence);
        obj.calculateGrade();
        obj.calculateResult();
        obj.displayDetails();
        
    }
}
class Student{
    public String name;
    public int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }

}
class Marks extends Student{
    public int marks;

    public Marks(String name, int id, int marks){
        super(name,id);
        this.marks = marks;
    }

    public String calculateGrade(){
        if(marks >= 80){
           return "A";
        }else if(marks >= 60){
          return "B";
        }else{
            return "C";
        }
    }
    
    public void displayDetails() {
    		super.displayDetails();
    		System.out.println("Marks: "+calculateGrade());
    }
}
class Result extends Marks{
    public int attendence;

    public Result(String name, int id, int marks, int attendence){
        super(name,id,marks);
        this.attendence = attendence;
    }

    public String calculateResult(){
        if(attendence>=75){
            return "Pass";
        }else{
            return "Fail";
        }
    }
    
    public void displayDetails() {
    		super.displayDetails();
    		System.out.println("Attendence: "+calculateResult());
    }
}

