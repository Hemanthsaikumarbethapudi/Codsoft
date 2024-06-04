import java.util.*;

public class Studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numsubject = sc.nextInt();
        System.out.println("Enter the Number of subjects : " + numsubject);
        int Totalmarks = 0;
        for (int i = 1; i <= numsubject; i++) {
            System.out.println("Enter the marks you obtained: " + i + ": ");
            int marks = sc.nextInt();
            Totalmarks += marks;
        }
        System.out.println("Total marks you got is : " + Totalmarks);
        double AvgMarks = (double) Totalmarks / (numsubject * 100) * 100;
        System.out.println("Average percentage of the student : " + AvgMarks);

        char grade;
        if (AvgMarks >= 90) {
            grade = 'A';
            System.out.print("Student Achevied the grade : " + grade);
        } else if (AvgMarks >= 80) {
            grade = 'B';
            System.out.print("Student Achevied the grade : " + grade);
        } else if (AvgMarks >= 70) {
            grade = 'C';
            System.out.print("Student Achevied the grade : " + grade);
        } else if (AvgMarks >= 60) {
            grade = 'D';
            System.out.print("Student Achevied the grade : " + grade);
        } else if (AvgMarks >= 50) {
            grade = 'E';
            System.out.print("Student Achevied the grade : " + grade);
        } else {
            System.out.print("Fail");
        }
    }
}