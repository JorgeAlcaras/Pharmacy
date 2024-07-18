package org.example;

import java.util.Scanner;

public class Main {
    static Product[] inventory = new Product[15];
    static Supplier[] suppliers = new Supplier[50];

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inventory[0] = new Product("Paracetamol", 2.00f, "Analgesic", true, 100, 20, 20.00);
        inventory[1] = new Product("Ibuprofen", 4.00f, "Anti-inflammatory", true, 80, 20, 30.00);
        inventory[2] = new Product("Amoxicillin", 6.00f, "Antibiotic", true, 50, 15, 40.00);
        inventory[3] = new Product("Omeprazole", 5.00f, "Antacid", true, 60, 15, 35.00);
        inventory[4] = new Product("Loratadine", 3.00f, "Antihistamine", true, 90, 25, 25.00);
        inventory[5] = new Product("Simvastatin", 10.00f, "Lipid-lowering", true, 40, 10, 50.00);
        inventory[6] = new Product("Metformin", 7.00f, "Antidiabetic", true, 70, 20, 44.00);
        inventory[7] = new Product("Aspirin", 1.00f, "Analgesic", true, 120, 30, 15.00);
        inventory[8] = new Product("Sodium Chloride", 2.00f, "Electrolyte", true, 200, 25, 16.00);
        inventory[9] = new Product("Diclofenac", 4.50f, "Anti-inflammatory", true, 65, 18, 36.00);
        inventory[10] = new Product("Cetirizine", 3.50f, "Antihistamine", true, 75, 20, 28.00);
        inventory[11] = new Product("Metoprolol", 8.00f, "Beta-blocker", true, 35, 15, 55.00);
        inventory[12] = new Product("Insulin", 15.00f, "Insulin", true, 25, 10, 80.00);
        inventory[13] = new Product("Salbutamol", 3.50f, "Bronchodilator", true, 60, 20, 30.00);
        inventory[14] = new Product("Warfarin", 6.50f, "Anticoagulant", true, 50, 15, 45.00);

        Ticket ticket = new Ticket();
        ticket.setClientName("Juan Perez");
        ticket.setDate("2024-07-15");
        ticket.addProduct(1000001, 7);
        ticket.addProduct(1000002, 1000);
        ticket.addProduct(1000014, 1);
        ticket.addProduct(1000011, 4);
        ticket.setPaymentMethod("Cash");
        ticket.setAmountReceived(10000);

        // System.out.println(ticket);

        mainMenu();

    }

    public static void mainMenu() {
        clearScreen();
        System.err.println("\n\n====== Pharmacy Yahualica ======");
        System.err.println("\n Select an activity");

        System.out.println("1- Start a sale");
        System.out.println("2- Manage Products");
        System.out.println("3- Manage Clients");
        System.out.println("4- Manage Suppliers");
        System.out.println("5- Manage Employees");

        System.out.print("   -> ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:

                break;

            case 2:
                manageProducts();
                break;

            case 3:
                manageClients();
                break;

            case 4:
                manageSuplier();
                break;

            case 5:
                manageEmployees();
                break;

            default:
                break;
        }

    }

    public static void manageProducts() {
        clearScreen();
        System.err.println("\n====== Pharmacy Yahualica ======");
        System.err.println("      = Manage Products  =");
        System.err.println("\n Select an activity:");
    }

    public static void manageClients() {

        clearScreen();

        System.err.println("\n====== Pharmacy Yahualica ======");
        System.err.println("       = Manage Clients =");
        System.err.println("\n Select an activity:");

        System.out.println("1- Add client");
        System.out.println("2- Update client");
        System.out.println("3- Delete client");
        System.out.println("\t4- Back");

        System.out.print("   -> ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:
                mainMenu();
                break;

            default:
                break;
        }

    }

    public static void manageSuplier() {
        int count = 0;
        int idSupplier;
        int choice;

        boolean editing = true;

        String name, email, phone, address, company;

        clearScreen();
        System.err.println("\n====== Pharmacy Yahualica ======");
        System.err.println("      = Manage Suppliers =");
        System.err.println("\n Select an activity:");

        System.out.println("1- Add supplier");
        System.out.println("2- Update supplier");
        System.out.println("3- Delete supplier");
        System.out.println("\t4- Back");

        System.out.print("   -> ");
        choice = scanner.nextInt();

        suppliers[0] = new Supplier("name", "email", "phone", "address", "company");

        switch (choice) {

            case 1: //Add supplier

                // pause
                scanner.nextLine();

                System.out.print("Nombre: ");
                name = scanner.nextLine();

                System.out.print("E-mail: ");
                email = scanner.nextLine();

                System.out.print("Phone: ");
                phone = scanner.nextLine();

                System.out.print("Address: ");
                address = scanner.nextLine();

                System.out.print("Company: ");
                company = scanner.nextLine();

                for (int i = 0; i < suppliers.length; i++) {
                    if (suppliers[i] == null) {
                        count = i;
                        break;
                    }
                }

                suppliers[count] = new Supplier(name, email, phone, address, company);

                break;

            case 2: //Update supplier

                System.out.println("id User to update");
                idSupplier = scanner.nextInt();

                // pause
                scanner.nextLine();

                editing=true;

                while (editing) {
                    System.out.println("Which field do you want to edit?");
                    System.out.println("1- Name");
                    System.out.println("2- E-mail");
                    System.out.println("3- Phone");
                    System.out.println("4- Address");
                    System.out.println("5- Company");
                    System.out.println("\t0- Exit");

                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Nombre");
                            suppliers[idSupplier].name = scanner.nextLine();
                            break;
                        case 2:
                            System.out.println("E-mail");
                            suppliers[idSupplier].email = scanner.nextLine();
                            break;
                        case 3:
                            System.out.println("Phone");
                            suppliers[idSupplier].phone = scanner.nextLine();
                            break;
                        case 4:
                            System.out.println("Address");
                            suppliers[idSupplier].address = scanner.nextLine();
                            break;
                        case 5:
                            System.out.println("Company");
                            suppliers[idSupplier].company = scanner.nextLine();
                            break;
                        case 0:
                            editing = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }

                System.out.println("Updated Supplier Info:");
                System.out.println(suppliers[idSupplier]);

            case 3: //Delete supplier
            
            editing=true;

            while (editing) {
                System.out.println("id supplier to delete");
                idSupplier = scanner.nextInt();
                
                System.out.println("Is this the supplier");
                System.out.println("1- Yes\t2-No");
                System.out.println(suppliers[idSupplier]);
                choice = scanner.nextInt();
                
                if(choice == 1){
                    suppliers[idSupplier]=null;
                    suppliers[idSupplier].status = false;
                    System.out.println("Supplier deleted");
                }

                System.out.println("Delete another supplier");
                System.out.println("1- Yes\t2-No");
                choice = scanner.nextInt();

                if (editing) {
                    
                }

            }

                break;

            case 4:
                mainMenu();
                break;

            default:
                break;
        }

    }

    public static void manageEmployees() {
        clearScreen();
        System.err.println("\n====== Pharmacy Yahualica ======");
        System.err.println("      = Manage Employees =");
        System.err.println("\n Select an activity");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}