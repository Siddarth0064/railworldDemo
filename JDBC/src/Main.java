import java.sql.SQLException;
import java.util.Scanner;

import static com.service.JDBCService.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1) Show all students");
            System.out.println("2) Show student by ID");
            System.out.println("3) Delete student by ID");
            System.out.println("4) Insert Student");
            System.out.println("5) Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    getAllStudents();
                    System.out.println("======================");
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int id = scan.nextInt();
                    getStudentByID(id);
                    System.out.println("======================");
                    break;
                case 3:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scan.nextInt();
                    deleteStudentByID(deleteId);
                    System.out.println("======================");
                    break;
                case 4:
                    System.out.print("Insert Student Enter ID, Name, Col_ID, Course_ID");
                    int std_id = scan.nextInt();
                    String name = scan.nextLine();
                    int col_id = scan.nextInt();
                    int course_id = scan.nextInt();
                    insertStudnet(std_id,name,col_id,course_id);
                    System.out.println("======================");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scan.close();
    }
}