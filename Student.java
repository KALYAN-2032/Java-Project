import java.util.Scanner;

class Student {
    private String studentName;
    private int rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;

    public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public boolean checkEligibility() {
        return this.marks >= 50;
    }

    public double calculateFee() {
        return this.courseCredits * 1500;
    }

    public double calculateScholarship() {
        double totalFee = calculateFee();
        if (this.marks >= 85) {
            return 0.20 * totalFee;
        } else if (this.marks >= 70 && this.marks <= 84) {
            return 0.10 * totalFee;
        } else {
            return 0.0;
        }
    }

    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    public void displayDetails() {
        System.out.println("\n========================================");
        System.out.println("      STUDENT REGISTRATION DETAILS      ");
        System.out.println("========================================");
        System.out.println("Student Name        : " + studentName);
        System.out.println("Roll Number         : " + rollNumber);
        System.out.println("Marks Obtained      : " + marks);
        System.out.println("Course Name         : " + courseName);
        System.out.println("Course Credits      : " + courseCredits);
        System.out.println("Eligibility Status  : Eligible");
        System.out.println("----------------------------------------");
        System.out.println("Base Course Fee     : Rs. " + calculateFee());
        System.out.println("Scholarship Allowed : Rs. " + calculateScholarship());
        System.out.println("Final Fee to Pay    : Rs. " + calculateFinalFee());
        System.out.println("========================================");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();
        
        System.out.print("Enter Course Credits: ");
        int credits = scanner.nextInt();

        Student student = new Student(name, rollNo, marks, course, credits);

        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nRegistration Failed: Student is not eligible due to low marks.");
        }

        scanner.close();
    }
}
