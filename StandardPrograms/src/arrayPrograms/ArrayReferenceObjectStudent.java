package arrayPrograms;

import java.util.Scanner;

public class ArrayReferenceObjectStudent 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);


        int num = sc.nextInt(); // 
        Student[] studentArr = new Student[num];

        for(int i=0; i<num; i++)
        {
            int marks[] = new int[4];
            int rollNo = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();

            for(int p=0; p<marks.length; p++)
            {
                marks[p] = sc.nextInt();
            }

            // Student s1 = new Student(rollNo,name,marks); // 100x
            // studentArr[i] =  s1;
            studentArr[i] =  new Student(rollNo,name,marks);
            // [100x,null,null]
        }

        double maxAvg = 0.0;
        int index = 0;
        IO.println("All Students:");
        for(int i=0; i < studentArr.length; i++)
        {
            double sum = 0;
            int arr[] = new int[4];

            arr = studentArr[i].marks;
            
            for(int e: arr)
            {
                sum = sum + e;
            }

            double avg = sum / arr.length;

            if(avg > maxAvg)
            {
                maxAvg = avg;
                index = i;
            }

            studentArr[i].printDetails(avg);

        }

        IO.println();
        IO.println("Topper (Overall Average):");
        Student.overallAverage(maxAvg,index,studentArr);
        
    }
}
class Student
{
    public int rollNo;
    public String name;
    int marks[];

    
    public Student(int rollNo,String name, int arr[])
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = arr;
    }
    public static void overallAverage(double maxAvg , int index, Student studentArr[])
    {
        for(int i=0; i<studentArr.length; i++)
        {
            if(i==index)
            {
                IO.print(studentArr[i].rollNo+" "+studentArr[i].name+" ");
                int arr[] =  new int[4];

                arr = studentArr[i].marks;
                for(int e: arr)
                {
                    IO.print(e+" ");
                }

             System.out.printf("(Avg: %.2f)", maxAvg);
             System.out.printf("\nOverall Average: %.2f", maxAvg);
        
            }
        }
    }

    public void printDetails(double avg)
    {
        System.out.print(rollNo+" "+name+" ");

        for(int e: marks)
        {
            System.out.print(e+" ");
        }

        System.out.printf("(Avg: %.2f)", avg);
        IO.println();
    }
}
/*
3
101
John
85 90 78 92
102
Alice
95 88 91 87
103
Bob
70 85 80 75
All Students:
101 John 85 90 78 92 (Avg: 86.25)
102 Alice 95 88 91 87 (Avg: 90.25)
103 Bob 70 85 80 75 (Avg: 77.50)

Topper (Overall Average):
102 Alice 95 88 91 87 (Avg: 90.25)
Overall Average: 90.25
*/