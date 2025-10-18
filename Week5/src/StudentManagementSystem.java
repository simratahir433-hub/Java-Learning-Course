// "Project of Week 5"

import java.util.Scanner;

public class StudentManagementSystem {
    private String studentId;
    private String studentName;
    private int studentAge;
    private String studentGrade;

    // Adding new student
    public void addStudent(Scanner scr) {
        System.out.print("Enter Student ID: ");
        studentId = scr.nextLine();
        System.out.print("Enter Student Name: ");
        studentName = scr.nextLine();
        System.out.print("Enter Student Age: ");
        studentAge = scr.nextInt();
        scr.nextLine();
        System.out.print("Enter Student Grade: ");
        studentGrade = scr.nextLine();
        System.out.println("\nStudent added successfully!\n");
    }

    // Viewing student details
    public void viewStudent() {
        if (studentId == null || studentId.isEmpty()) {
            System.out.println("No student found.\n");
        } else {
            System.out.println("_______ Student Details _______");
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + studentName);
            System.out.println("Age: " + studentAge);
            System.out.println("Grade: " + studentGrade);
            System.out.println("_______________________________\n");
        }
    }

    // Removing student
    public void removeStudent() {
        if (studentId == null || studentId.isEmpty()) {
            System.out.println("No student found to remove.\n");
        } else {
            studentId = null;
            studentName = null;
            studentGrade = null;
            studentAge = 0;
            System.out.println("Student removed successfully.\n");
        }
    }

    // Searching student by ID
    public void searchStudent(Scanner scr) {
        if (studentId == null || studentId.isEmpty()) {
            System.out.println("No student available to search.\n");
            return;
        }
        System.out.print("Enter Student ID to search: ");
        String searchId = scr.nextLine();
        if (searchId.equals(studentId)) {
            System.out.println("\nStudent Found!\n");
            viewStudent();
        } else {
            System.out.println("\nStudent not found.\n");
        }
    }

    // Main menu
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();
        int choice;

        do {
            System.out.println("____ Student Management System ____");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scr.nextInt();
            scr.nextLine();
            System.out.println("");

            switch (choice) {
                case 1:
                    system.addStudent(scr);
                    break;
                case 2:
                    system.viewStudent();
                    break;
                case 3:
                    system.removeStudent();
                    break;
                case 4:
                    system.searchStudent(scr);
                    break;
                case 5:
                    System.out.println("Thank you for using Student Management System! \nExiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.\n");
            }
        } while (choice != 5);

        scr.close();
    }
}
