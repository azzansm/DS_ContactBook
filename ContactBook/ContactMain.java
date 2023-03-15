package ContactBook;
import java.util.*;
public class ContactMain{
    public static void main(String[] args){
        ContactDetails dcontact = new ContactDetails();
        Contacts cont;
        Scanner input = new Scanner(System.in);
        String menu;
        boolean quit = false;

        do{
            menu();
            menu = input.nextLine().toUpperCase();
            switch (menu) {
                case "A" -> {
                    System.out.println("Name: ");
                    String a_name = input.nextLine();
                    System.out.println("Email: ");
                    String a_email = input.nextLine();
                    System.out.println("Phone number: ");
                    String a_phone = input.nextLine();
                    cont = new Contacts(a_name, a_email, a_phone);
                    dcontact.addContact(cont);
                    System.out.println(cont);
                }
                case "D" -> {
                    System.out.println("Name to delete: ");
                    String d_name = input.nextLine();
                    dcontact.delContact(d_name);
                }
                case "S" -> {
                    System.out.println("Name to search: ");
                    String s_name = input.nextLine();
                    int contactPos = dcontact.findContact(s_name);
                    if (contactPos < 0) {
                        System.out.println(s_name + " does not exist.");
                    } else {
                        System.out.println(s_name + " found!");
                    }
                }
                case "E" -> {
                    System.out.println("Email to search: ");
                    String s_email = input.nextLine();
                    int contactPos2 = dcontact.findContact2(s_email);
                    if (contactPos2 < 0) {
                        System.out.println(s_email + " does not exist.");
                    } else {
                        System.out.println(s_email + " found!");
                    }
                }
                case "P" -> dcontact.display();
                case "Q" -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("\nInvalid input\n");
            }
        }while(!quit);
    }
    public static void menu(){
        System.out.println("(A)dd");
        System.out.println("(D)elete");
        System.out.println("(E)mail Search");
        System.out.println("(P)rint List");
        System.out.println("(S)earch");
        System.out.println("(Q)uit");
        System.out.println("Please Enter a command: ");
    }
}