import java.util.*;
interface department{
    void printAttributes();
}
class HOSTEL{
    String hostelName,hostelLocation;
    int roomno;
    void printAttributes(){
        System.out.println("Hostel Name = "+hostelName);
        System.out.println("Hostel Location = "+hostelLocation);
        System.out.println("Number of rooms = "+roomno);
    }
}
class STUDENT extends HOSTEL implements department{
    String studentName,regsno,subject;
    double avgMarks;
    public STUDENT(String hostelName,String hostelLocation,int roomno,String studentName,String regsno,String subject,double avgMarks){
        super.hostelName=hostelName;
        super.hostelLocation=hostelLocation;
        super.roomno=roomno;
        this.studentName=studentName;
        this.regsno=regsno;
        this.subject=subject;
        this.avgMarks=avgMarks;
    }
    public void printData(){
        printAttributes();
        System.out.println("Student Name = "+studentName);
        System.out.println("Registration number = "+regsno);
        System.out.println("Elective subject = "+subject);
        System.out.println("Average marks = "+avgMarks);
    }
    public void printAttributes(){
        System.out.println("Department: CSE");
        System.out.println("Department head: xyz");
    }
}
public class Main {
    public static void main(String[] args) {
        Map<String, STUDENT> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Admit new Student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display student details");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    admitNewStudent(sc, studentMap);
                case 2:
                    migrateStudent(sc, studentMap);
                case 3:
                    displayStudentDetails(sc, studentMap);
                case 4:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    private static void admitNewStudent(Scanner sc,Map<String,STUDENT> studentMap){
        System.out.println("Enter hostel name:");
        String hostelName=sc.nextLine();
        System.out.println("Enter hostel location:");
        String hostelLocation=sc.nextLine();
        System.out.println("Enter number of rooms");
        int roomno=sc.nextInt();
        System.out.println("Enter student name");
        String studentName=sc.nextLine();
        System.out.println("Enter registration number");
        String regsno=sc.nextLine();
        System.out.println("Enter elective subject");
        String subject=sc.nextLine();
        System.out.println("Enter average marks");
        double avgMarks=sc.nextDouble();

        STUDENT newStudent=new STUDENT(hostelName,hostelLocation,roomno,studentName,regsno,subject,avgMarks);
        studentMap.put(regsno,newStudent);
        System.out.println("Student admitted succesfully");
    }
}