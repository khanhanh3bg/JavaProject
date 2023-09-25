package assignment;

import java.util.*;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Phone> information = new ArrayList<>();
        int enter;
        do {
            Phone phone = new Phone();
            phone.menu1();
            phone.menu2();
            System.out.println("Enter 0 to end the program.");
            System.out.println("Please enter a function number: ");
            enter = input.nextInt();
            input.nextLine();
            switch (enter) {
                case 0: {
                    System.out.println("You have exited the program!");
                    break;
                }
                case 1: {
                    System.out.println("Insert function");
                    int enterIns;
                    do {
                        Phone phoneIns = new Phone();
                        phoneIns.insert(input);
                        information.add(phoneIns);
                        System.out.println("Continue: 1");
                        System.out.println("Stop: 0");
                        enterIns = input.nextInt();
                        input.nextLine();
                    } while (enterIns == 1);
                    System.out.println("Data has been entered into the system!");
                    phone.display(information);
                    break;
                }
                case 2: {
                    System.out.println("Update function");
                    phone.update(information);
                    phone.display(information);
                    break;
                }
                case 3: {
                    System.out.println("Delete function");
                    phone.delete(information);
                    phone.display(information);
                    break;
                }
                case 4: {
                    System.out.println("Display function");
                    phone.display(information);
                    break;
                }
                case 5: {
                    System.out.println("Filter by manufacturer");
                    phone.filter_manufacturer(information);
                    break;
                }
                case 6: {
                    System.out.println("Filter by price");
                    phone.filter_price(information);
                    break;
                }
                case 7: {
                    System.out.println("Order by release date");
                    phone.sort_release(information);
                    phone.display(information);
                    break;
                }
                case 8: {
                    System.out.println("Order by price");
                    phone.sort_price(information);
                    phone.display(information);
                    break;
                }
                default: {
                    System.out.println("Syntax error! Please try again.");
                    break;
                }
            }
            System.out.println("Continue: 1");
            System.out.println("Stop: 0");
            enter = input.nextInt();
        } while (enter != 0);
    }
}