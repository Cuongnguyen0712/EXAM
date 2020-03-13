package AddressBooks;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise = 0;
        String name = null;
        String company = null;
        String email = null;
        String phone = null;
        ContactList contactList = new ContactList();
        do {
            System.out.println("Menu: ");
            System.out.println("1. Add a new Contact.");
            System.out.println("2. Find a Contact by name.");
            System.out.println("3. Display Contact.");
            System.out.println("4. Exit");
            System.out.println("Input: ");
            choise = sc.nextInt();
            sc.nextLine();
            switch (choise) {
                case 1:
                    System.out.println("+ Name:");
                    name = sc.nextLine();
                    System.out.println("+ Company: ");
                    company = sc.nextLine();
                    System.out.println("+ Email: ");
                    email = sc.nextLine();
                    System.out.println("+ Phone: ");
                    phone = sc.nextLine();
                    contactList.AddNewPhoneNumber(new Contact(name , company , email , phone));
                    System.out.println("Success");
                    contactList.Display();
                    break;
                case 2:
                    System.out.println("+ Find Name: ");
                    name = sc.nextLine();
                    contactList.SearchContact(name);
                    break;
                case 3:
                    contactList.Display();
                    break;
                case 4:
                    System.exit(4);
                default:
                    break;
            }
        } while (choise != 4);
    }
}
