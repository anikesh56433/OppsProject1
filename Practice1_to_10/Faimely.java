package Practice1_to_10;


import java.util.Scanner;
import java.util.UUID;
class Faimily implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_gender;

    String emp_address;

    int emp_mobaile;
    String emp_work;
    int emp_pincode;

    String emp_email;




    @Override
    public void get_details() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Gender: "+emp_gender);
        System.out.println("Address"+emp_address);
        System.out.println("Mobaile: "+emp_mobaile);
        System.out.println("Work"+emp_work);
        System.out.println("Pincode: "+emp_pincode);
        System.out.println("Email: "+emp_email);


    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("PERSON NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("PERSON AGE: "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print(":PERSON GENDER: ");
        emp_gender = sc.nextLine();
        System.out.print("PERSEON ADDRESS: ");
        emp_address=sc.nextLine();
        System.out.print(("PERSON PINCODE: "));
        emp_pincode = sc.nextInt();
        sc.nextLine();
        System.out.print(":PERSON WORK: ");
        emp_work = sc.nextLine();
        System.out.print("PERSEON MOBAILE: ");
        emp_mobaile = sc.nextInt();
        sc.nextLine();
        System.out.print(":PERSON EMAIL ADDRESS: ");
        emp_email = sc.nextLine();



    }
}
