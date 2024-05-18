package Practice1_to_10;

import Day10.Cars;
import Day10.Employees;
import Day10.Showroom;

import java.util.Scanner;

interface utility
{
    public void get_details();
    public void set_details();
}

public class main {

    static void main_menu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO OUR FAIMILY *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD PERSON \t\t\t 2].ADD STUDENT \t\t\t 3].ADD FAIMILY");
        System.out.println();
        System.out.println("4].GET PERSON \t\t\t 5].GET STUDENT \t\t\t 6].GET FAIMILY");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person[] = new Person[50];
        Student student[] = new Student[50];
        Faimily faimily[] = new Faimily[50];
        int person_counter = 0;
        int student_counter = 0;
        int faimily_counter = 0;
        int choice = 100;


        while(choice!=0){

            main_menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                       person[person_counter] = new Person();
                        person[person_counter].set_details();
                       person_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW PERSON");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                       student[student_counter] = new Student();
                        student[student_counter].set_details();
                       student_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW STUDENT");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        faimily[faimily_counter] = new Faimily();
                        faimily[faimily_counter].set_details();
                        faimily_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW faimily");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < person_counter; i++) {
                            person[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i <student_counter; i++) {
                            student[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < faimily_counter; i++) {
                            faimily[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }


    }
}
