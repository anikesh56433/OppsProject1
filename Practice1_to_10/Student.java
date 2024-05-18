package Practice1_to_10;


import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;
public class Student  implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_gender;

    String emp_address;

    long emp_mobaile;
    String  emp_Degree;
    int emp_pincode;

    String emp_email;

    String emp_Inrollment_number;

    String emp_father;
    String emp_mother;
    int emp_faimelyMembers;

    long emp_fatherMobaileNumber;
    long emp_motherMobaileNumber;
    String emp_fatherEmail;
    String emp_collageName;
    String emp_year;
    String  emp_DateOfBirth;




    @Override
    public void get_details() {
        System.out.println(" STUDENT ID: "+emp_id);
        System.out.println(" STUDENT NAME: "+emp_name);
        System.out.println(" STUDENT AGE: "+emp_age);
        System.out.println(" STUDENT GENDER: "+emp_gender);
        System.out.println("STUDENT ADDRESS :"+emp_address);
        System.out.println(" STUDENT MOBAILE: "+emp_mobaile);
        System.out.println(" PINCODE: "+emp_pincode);
        System.out.println("STUDENT EMAIL: "+emp_email);
        System.out.println("COLLAGE NAME: "+emp_collageName);
        System.out.println("COLLAGE YEAR: "+emp_year);
        System.out.println("STUDENT FATHER NAME: "+emp_father);
        System.out.println(" STUDENT FATHER MOBAILE NUMBER: "+emp_fatherMobaileNumber);
        System.out.println(" STUDENT FATHER EMAIL:"+emp_fatherEmail);
        System.out.println(" STUDENT MOTHER NAME: "+emp_mother);
        System.out.println(" STUDENT MOTHER MOBAILE NUMBER:"+emp_motherMobaileNumber);
        System.out.println("STUDENT DATE OF BIRTH:"+emp_DateOfBirth);
        System.out.println("STUDENT ENROLLMENT NUMBER:"+emp_Inrollment_number);




    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("STUDENT NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("STUDENT AGE: "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("STUDENT GENDER: ");
        emp_gender = sc.nextLine();
        System.out.print("STUDENT ADDRESS: ");
        emp_address=sc.nextLine();
        System.out.print(("STUDENT PINCODE: "));
        emp_pincode = sc.nextInt();
        sc.nextLine();
        System.out.print("STUDENT WORK: ");
        emp_Degree = sc.nextLine();
        System.out.print("STUDENT MOBAILE: ");
        emp_mobaile = sc.nextLong();
        sc.nextLine();
        System.out.print("STUDENT EMAIL ADDRESS: ");
        emp_email = sc.nextLine();

        System.out.print("STUDENT FATHER NAME: ");
        emp_father= sc.nextLine();
        System.out.print(("STUDENT MOTHER NAME: "));
        emp_mother = sc.nextLine();

        System.out.print("FATHER MOBAILE NUMBER: ");
        emp_fatherMobaileNumber = sc.nextLong();
        sc.nextLine();
        System.out.print("FATHER EMAIL : ");
        emp_fatherEmail=sc.nextLine();
        System.out.print(("MOTHER MOBAILE NUMBER: "));
        emp_motherMobaileNumber = sc.nextLong();
        System.out.print("STUDENT DATE OF BIRTH");
        emp_DateOfBirth = sc.nextLine();
        sc.nextLine();
        System.out.print("STUDENT FAIMILY MEMBERS: ");
        emp_faimelyMembers = sc.nextInt();
        System.out.print("STUDENT YEAR : ");
        emp_year = sc.nextLine();
        sc.nextLine();
        System.out.print("STUDENT COLLAGE NAME : ");
        emp_collageName = sc.nextLine();
        System.out.print("STUDENT ENROLLMENT NUMBER : ");
        emp_Inrollment_number = sc.nextLine();




    }
}
