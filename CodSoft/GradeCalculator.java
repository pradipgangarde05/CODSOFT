import java.security.spec.ECFieldF2m;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
    static void grade(int nos, float totalMarks) {
        try {
            float per = totalMarks / nos;
            String grades = "fail";
            if (per >= 80) {
                grades = "first class with Distinction";
            } else if (per >= 70) {
                grades = "Fisrt Class";
            } else if (per >= 60) {
                grades = "Second Class";
            } else if (per >= 50) {
                grades = "Third Class";
            }
            display(totalMarks, per, grades);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero exception");

        }

    }

    static void calculate() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of subject");
            int nos = sc.nextInt();

            float totalMarks = 0;
            for (int i = 1; i <= nos; i++) {
                System.out.println("Enter the marks of Sub" + i);
                totalMarks += sc.nextFloat();
            }
            // float percentage = totalMarks / nos;
            grade(nos, totalMarks);

        } catch (InputMismatchException e) {
            System.out.println("Enter numeric value");

        }

    }

    static void display(float tm, float per, String grade) {
        System.out.println("Result :");
        System.out.println("Total Marks : " + tm);
        System.out.println("Percentage : " + per);
        System.out.println("Grade : " + grade);

    };

    public static void main(String[] args) {
        GradeCalculator.calculate();

    }
}
