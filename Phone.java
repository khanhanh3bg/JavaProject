package assignment;

import java.util.*;

public class Phone {
    public static Scanner input = new Scanner(System.in);
    public int length, width, thickness, price, ram, rom, size, day, month, year, release_date;
    public String imei, name, manufacturer, chip;

    public void insert(Scanner input) {
        System.out.println("Please enter phone IMEI: ");
        this.imei = input.nextLine();
        System.out.println("Please enter phone name: ");
        this.name = input.nextLine();
        System.out.println("Please enter phone manufacturer: ");
        this.manufacturer = input.nextLine();
        System.out.println("Please enter phone chip: ");
        this.chip = input.nextLine();
        System.out.println("Please enter phone ram: ");
        this.ram = input.nextInt();
        System.out.println("Please enter phone rom: ");
        this.rom = input.nextInt();
        input.nextLine();
        System.out.println("Please enter phone release date! ");
        System.out.println("Please enter day: ");
        this.day = input.nextInt();
        System.out.println("Please enter month: ");
        this.month = input.nextInt();
        System.out.println("Please enter year: ");
        this.year = input.nextInt();
        System.out.println("Please enter phone screen size: ");
        this.size = input.nextInt();
        System.out.println("Please enter phone length: ");
        this.length = input.nextInt();
        System.out.println("Please enter phone width: ");
        this.width = input.nextInt();
        System.out.println("Please enter phone thickness: ");
        this.thickness = input.nextInt();
        System.out.println("Please enter phone price: ");
        this.price = input.nextInt();
        this.release_date = (year * 10000) + (month * 100) + day;
    }

    public void display(ArrayList<Phone> infor) {
//        key = ;//
        for (Phone phone : infor) {
            System.out.println(
                    "IMEI: " + phone.imei + " - " +
                            "Phone: " + phone.name + " - " +
                            "Manufacturer: " + phone.manufacturer + " - " +
                            "Screen size: " + phone.size + " inch " + " - " +
                            "Length: " + phone.length + " cm " + " - " +
                            "Width: " + phone.width + " cm " + " - " +
                            "Thickness: " + phone.thickness + " cm " + " - " +
                            "Chip: " + phone.chip + " - " +
                            "Ram: " + phone.ram + " gb " + " - " +
                            "Rom: " + phone.rom + " gb " + " - " +
                            "Release: " + phone.day + "/" + phone.month + "/" + phone.year + " - " +
                            "Price: " + phone.price + " $");
        }
    }

    public void update(ArrayList<Phone> infor) {
        System.out.println("Please enter an imei to update: ");
        String imei = input.nextLine();
        boolean check = true;
        for (Phone phone : infor) {
            if (phone.imei.equals(imei)) {
                System.out.println("Please update Phone imei: ");
                phone.imei = input.nextLine();
                System.out.println("Please update Phone name: ");
                phone.name = input.nextLine();
                System.out.println("Please update Phone manufacturer: ");
                phone.manufacturer = input.nextLine();
                System.out.println("Please update Phone screen size: ");
                phone.size = input.nextInt();
                System.out.println("Please update Phone length: ");
                phone.length = input.nextInt();
                System.out.println("Please update Phone width: ");
                phone.width = input.nextInt();
                System.out.println("Please update Phone thickness: ");
                phone.thickness = input.nextInt();
                input.nextLine();
                System.out.println("Please update Phone chip: ");
                phone.chip = input.nextLine();
                System.out.println("Please update Phone ram: ");
                phone.ram = input.nextInt();
                System.out.println("Please update Phone rom: ");
                phone.rom = input.nextInt();
                input.nextLine();
                System.out.println("Please update Phone release date! ");
                System.out.println("Please update day: ");
                phone.day = input.nextInt();
                System.out.println("Please update month: ");
                phone.month = input.nextInt();
                System.out.println("Please update year: ");
                phone.year = input.nextInt();
                System.out.println("Please update Phone price: ");
                phone.price = input.nextInt();
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("No results were found!");
        }
    }

    public void delete(ArrayList<Phone> infor) {
        System.out.println("Please enter an imei to delete: ");
        String imei = input.nextLine();
        boolean check = true;
        for (int i = 0; i < infor.size(); i++) {
            if (infor.get(i).imei.equals(imei)) {
                infor.remove(i);
                check = false;
            }
        }
        if (check){
            System.out.println("No results were found!");
        }
    }

    public void filter_manufacturer(ArrayList<Phone> infor) {
        System.out.println("Please enter manufacturer to filter: ");
        String manufacturer = input.nextLine();
        boolean check = true;
        for (Phone phone : infor) {
            if (phone.manufacturer.equals(manufacturer)) {
                System.out.println("Search results: ");
                System.out.println(
                        "IMEI: " + phone.imei + " - " +
                                "Phone: " + phone.name + " - " +
                                "Manufacturer: " + phone.manufacturer + " - " +
                                "Screen size: " + phone.size + " inch " + " - " +
                                "Length: " + phone.length + " cm " + " - " +
                                "Width: " + phone.width + " cm " + " - " +
                                "Thickness: " + phone.thickness + " cm " + " - " +
                                "Chip: " + phone.chip + " - " +
                                "Ram: " + phone.ram + " gb " + " - " +
                                "Rom: " + phone.rom + " gb " + " - " +
                                "Release: " + phone.day + "/" + phone.month + "/" + phone.year + " - " +
                                "Price: " + phone.price + " $");
                check = false;
            }
        }
        if (check) {
            System.out.println("No results were found!");
        }
    }

    public void filter_price(ArrayList<Phone> infor) {
        System.out.println("Please enter price to filter: ");
        int price = input.nextInt();
        boolean check = true;
        for (Phone phone : infor) {
            if (phone.price <= price) {
                System.out.println("Search results: ");
                System.out.println(
                        "IMEI: " + phone.imei + " - " +
                                "Phone: " + phone.name + " - " +
                                "Manufacturer: " + phone.manufacturer + " - " +
                                "Screen size: " + phone.size + " inch " + " - " +
                                "Length: " + phone.length + " cm " + " - " +
                                "Width: " + phone.width + " cm " + " - " +
                                "Thickness: " + phone.thickness + " cm " + " - " +
                                "Chip: " + phone.chip + " - " +
                                "Ram: " + phone.ram + " gb " + " - " +
                                "Rom: " + phone.rom + " gb " + " - " +
                                "Release: " + phone.day + "/" + phone.month + "/" + phone.year + " - " +
                                "Price: " + phone.price + " $");
                check = false;
            }
        }
        if (check) {
            System.out.println("No results were found!");
        }
    }

    public void sort_price(ArrayList<Phone> infor) {
        for (int i = 0; i < infor.size() - 1; i++) {
            for (int j = i + 1; j < infor.size(); j++) {
                if (infor.get(i).price < infor.get(j).price) {
                    Phone temp = new Phone();
                    temp.imei = infor.get(i).imei;
                    temp.name = infor.get(i).name;
                    temp.manufacturer = infor.get(i).manufacturer;
                    temp.size = infor.get(i).size;
                    temp.length = infor.get(i).length;
                    temp.width = infor.get(i).width;
                    temp.thickness = infor.get(i).thickness;
                    temp.chip = infor.get(i).chip;
                    temp.ram = infor.get(i).ram;
                    temp.rom = infor.get(i).rom;
                    temp.day = infor.get(i).day;
                    temp.month = infor.get(i).month;
                    temp.year = infor.get(i).year;
                    temp.price = infor.get(i).price;
                    temp.release_date = infor.get(i).release_date;

                    infor.get(i).imei = infor.get(j).imei;
                    infor.get(i).name = infor.get(j).name;
                    infor.get(i).manufacturer = infor.get(j).manufacturer;
                    infor.get(i).size = infor.get(j).size;
                    infor.get(i).length = infor.get(j).length;
                    infor.get(i).width = infor.get(j).width;
                    infor.get(i).thickness = infor.get(j).thickness;
                    infor.get(i).chip = infor.get(j).chip;
                    infor.get(i).ram = infor.get(j).ram;
                    infor.get(i).rom = infor.get(j).rom;
                    infor.get(i).day = infor.get(j).day;
                    infor.get(i).month = infor.get(j).month;
                    infor.get(i).year = infor.get(j).year;
                    infor.get(i).price = infor.get(j).price;
                    infor.get(i).release_date = infor.get(j).release_date;

                    infor.get(j).imei = temp.imei;
                    infor.get(j).name = temp.name;
                    infor.get(j).manufacturer = temp.manufacturer;
                    infor.get(j).size = temp.size;
                    infor.get(j).length = temp.length;
                    infor.get(j).width = temp.width;
                    infor.get(j).thickness = temp.thickness;
                    infor.get(j).chip = temp.chip;
                    infor.get(j).ram = temp.ram;
                    infor.get(j).rom = temp.rom;
                    infor.get(j).day = temp.day;
                    infor.get(j).month = temp.month;
                    infor.get(j).year = temp.year;
                    infor.get(j).price = temp.price;
                    infor.get(j).release_date = temp.release_date;
                }
            }
        }
    }

    public void sort_release(ArrayList<Phone> infor) {
        for (int i = 0; i < infor.size() - 1; i++) {
            for (int j = i + 1; j < infor.size(); j++) {
                if (infor.get(i).release_date < infor.get(j).release_date) {
                    Phone temp = new Phone();
                    temp.imei = infor.get(i).imei;
                    temp.name = infor.get(i).name;
                    temp.manufacturer = infor.get(i).manufacturer;
                    temp.size = infor.get(i).size;
                    temp.length = infor.get(i).length;
                    temp.width = infor.get(i).width;
                    temp.thickness = infor.get(i).thickness;
                    temp.chip = infor.get(i).chip;
                    temp.ram = infor.get(i).ram;
                    temp.rom = infor.get(i).rom;
                    temp.day = infor.get(i).day;
                    temp.month = infor.get(i).month;
                    temp.year = infor.get(i).year;
                    temp.price = infor.get(i).price;
                    temp.release_date = infor.get(i).release_date;

                    infor.get(i).imei = infor.get(j).imei;
                    infor.get(i).name = infor.get(j).name;
                    infor.get(i).manufacturer = infor.get(j).manufacturer;
                    infor.get(i).size = infor.get(j).size;
                    infor.get(i).length = infor.get(j).length;
                    infor.get(i).width = infor.get(j).width;
                    infor.get(i).thickness = infor.get(j).thickness;
                    infor.get(i).chip = infor.get(j).chip;
                    infor.get(i).ram = infor.get(j).ram;
                    infor.get(i).rom = infor.get(j).rom;
                    infor.get(i).day = infor.get(j).day;
                    infor.get(i).month = infor.get(j).month;
                    infor.get(i).year = infor.get(j).year;
                    infor.get(i).price = infor.get(j).price;
                    infor.get(i).release_date = infor.get(j).release_date;

                    infor.get(j).imei = temp.imei;
                    infor.get(j).name = temp.name;
                    infor.get(j).manufacturer = temp.manufacturer;
                    infor.get(j).size = temp.size;
                    infor.get(j).length = temp.length;
                    infor.get(j).width = temp.width;
                    infor.get(j).thickness = temp.thickness;
                    infor.get(j).chip = temp.chip;
                    infor.get(j).ram = temp.ram;
                    infor.get(j).rom = temp.rom;
                    infor.get(j).day = temp.day;
                    infor.get(j).month = temp.month;
                    infor.get(j).year = temp.year;
                    infor.get(j).price = temp.price;
                    infor.get(j).release_date = temp.release_date;
                }
            }
        }
    }

    public void menu1() {
        System.out.println("+---------------------------------+");
        System.out.println("|              Phone              |");
        System.out.println("|1. Insert a new phone.           |");
        System.out.println("|2. Update a phone.               |");
        System.out.println("|3. Delete a phone.               |");
        System.out.println("|4. Display all phone.            |");
        System.out.println("+---------------------------------+");
    }

    public void menu2() {
        System.out.println("+---------------------------------+");
        System.out.println("|              Tools              |");
        System.out.println("|5. Filter by manufacturer.       |");
        System.out.println("|6. Filter by price.              |");
        System.out.println("|7. Order by release date.        |");
        System.out.println("|8. Order by price desc.          |");
        System.out.println("+---------------------------------+");
    }


}










































