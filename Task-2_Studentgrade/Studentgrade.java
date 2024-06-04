import java.util.*;

public class Studentgrade {
    public static void main(String[] args) {
        int Totalmarks = 0;
        int python, java, c, Html;
        Scanner sc = new Scanner(System.in);
        python = sc.nextInt();
        System.out.println("Enter the Marks in Python : " + python + " / 100");
        java = sc.nextInt();
        System.out.println("Enter the Marks in Java : " + java + " / 100");
        c = sc.nextInt();
        System.out.println("Enter the Marks in C: " + c + " / 100");
        Html = sc.nextInt();
        System.out.println("Enter the Marks in HTML : " + Html + " / 100");
        sc.close();
        Totalmarks = python + java + c + Html;
        System.out.println("Total marks you got is : " + Totalmarks + " / 100");
        int AvgMarks = (Totalmarks * 100) / 500;
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