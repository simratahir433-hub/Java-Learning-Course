import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String studentId;
    String studentName;
    int studentAge;
    String studentGrade;

    Student(String studentId, String studentName, int studentAge, String studentGrade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }
}

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    //Checking if a student ID already exists
    private boolean idExists(String id) {
        for (Student s : students) {
            if (s.studentId.equalsIgnoreCase(id)) {  // ignore case
                return true;
            }
        }
        return false;
    }

    //Adding new student with validation and unique ID
    public void addStudent(Scanner scr) {
        System.out.print("Enter Student ID: ");
        String id = scr.nextLine().trim();

        // checking duplicate
        if (idExists(id)) {
            System.out.println("A student with this ID already exists. Try again.\n");
            return;
        }

        if (id.isEmpty()) {
            System.out.println("ID cannot be empty.\n");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = scr.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.\n");
            return;
        }

        int age;
        while (true) {
            System.out.print("Enter Student Age: ");
            if (scr.hasNextInt()) {
                age = scr.nextInt();
                scr.nextLine();
                if (age > 0) break;
                else System.out.println("Age must be greater than 0.");
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scr.nextLine();
            }
        }

        System.out.print("Enter Student Grade: ");
        String grade = scr.nextLine().trim();
        if (grade.isEmpty()) {
            System.out.println("Grade cannot be empty.\n");
            return;
        }

        students.add(new Student(id, name, age, grade));
        System.out.println("\n Student added successfully!\n");
    }

    //Viewing all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
        } else {
            System.out.println("_______ All Students _______");
            for (Student s : students) {
                System.out.println("Student ID: " + s.studentId);
                System.out.println("Name: " + s.studentName);
                System.out.println("Age: " + s.studentAge);
                System.out.println("Grade: " + s.studentGrade);
                System.out.println("-----------------------------");
            }
            System.out.println("_____________________________\n");
        }
    }

    //Removing student with confirmation
    public void removeStudent(Scanner scr) {
        if (students.isEmpty()) {
            System.out.println("No students found to remove.\n");
            return;
        }

        System.out.print("Enter Student ID to remove: ");
        String id = scr.nextLine().trim();
        boolean removed = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).studentId.equalsIgnoreCase(id)) {
                Student s = students.get(i);
                System.out.println("\nStudent Found: " + s.studentName + " (" + s.studentId + ")");
                System.out.print("Are you sure you want to delete this student? (Y/N): ");
                String confirm = scr.nextLine().trim();
                if (confirm.equalsIgnoreCase("Y")) {
                    students.remove(i);
                    System.out.println("Student removed successfully.\n");
                } else {
                    System.out.println("Deletion cancelled.\n");
                }
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Student not found.\n");
        }
    }

    //Searching student (partial + case-insensitive)
    public void searchStudent(Scanner scr) {
        if (students.isEmpty()) {
            System.out.println("No students available to search.\n");
            return;
        }

        System.out.print("Enter Student ID or Name to search: ");
        String keyword = scr.nextLine().trim().toLowerCase();
        boolean found = false;

        for (Student s : students) {
            if (s.studentId.toLowerCase().contains(keyword) || s.studentName.toLowerCase().contains(keyword)) {
                System.out.println("\n Student Found!");
                System.out.println("Student ID: " + s.studentId);
                System.out.println("Name: " + s.studentName);
                System.out.println("Age: " + s.studentAge);
                System.out.println("Grade: " + s.studentGrade);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("\n No matching student found.\n");
        }
    }

    //Updating student details
    public void updateStudent(Scanner scr) {
        if (students.isEmpty()) {
            System.out.println("No students available to update.\n");
            return;
        }

        System.out.print("Enter Student ID to update: ");
        String id = scr.nextLine().trim();
        Student studentToUpdate = null;

        for (Student s : students) {
            if (s.studentId.equalsIgnoreCase(id)) {
                studentToUpdate = s;
                break;
            }
        }

        if (studentToUpdate == null) {
            System.out.println("Student not found.\n");
            return;
        }

        System.out.println("\nCurrent details:");
        System.out.println("Name: " + studentToUpdate.studentName);
        System.out.println("Age: " + studentToUpdate.studentAge);
        System.out.println("Grade: " + studentToUpdate.studentGrade);
        System.out.println("---------------------");

        System.out.print("Enter new name (or press Enter to keep same): ");
        String newName = scr.nextLine().trim();
        if (!newName.isEmpty()) {
            studentToUpdate.studentName = newName;
        }

        System.out.print("Enter new age (or press Enter to keep same): ");
        String ageInput = scr.nextLine().trim();
        if (!ageInput.isEmpty()) {
            try {
                int newAge = Integer.parseInt(ageInput);
                if (newAge > 0) {
                    studentToUpdate.studentAge = newAge;
                } else {
                    System.out.println("Invalid age. Keeping old value.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Keeping old value.");
            }
        }

        System.out.print("Enter new grade (or press Enter to keep same): ");
        String newGrade = scr.nextLine().trim();
        if (!newGrade.isEmpty()) {
            studentToUpdate.studentGrade = newGrade;
        }

        System.out.println("\n Student updated successfully.\n");
    }

    //Main menu with new option
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();
        int choice = 0;

        do {
            System.out.println("____ Student Management System ____");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            if (scr.hasNextInt()) {
                choice = scr.nextInt();
                scr.nextLine();
            } else {
                System.out.println("Invalid input! Please enter a number.\n");
                scr.nextLine();
                continue;
            }

            System.out.println("");

            switch (choice) {
                case 1:
                    system.addStudent(scr);
                    break;
                case 2:
                    system.viewStudents();
                    break;
                case 3:
                    system.removeStudent(scr);
                    break;
                case 4:
                    system.searchStudent(scr);
                    break;
                case 5:
                    system.updateStudent(scr);
                    break;
                case 6:
                    System.out.println("Thank you for using Student Management System! \nExiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.\n");
            }
        } while (choice != 6);

        scr.close();
    }
}
