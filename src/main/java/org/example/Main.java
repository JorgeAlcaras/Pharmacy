package org.example;

import java.util.Scanner;

public class Main {
    static Product[] inventory = new Product[15];
    static Supplier[] suppliers = new Supplier[50];
    static Employee[] employees = new Employee[50];

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inventory[0] = new Product("Paracetamol", 2.00f, 3.00f, "Pz",  100, 20);
        inventory[1] = new Product("Ibuprofen", 4.00f, 5.00f, "Pz",  80, 20);
        inventory[2] = new Product("Amoxicillin", 6.00f, 7.00f, "Pz",  50, 15);
        inventory[3] = new Product("Omeprazole", 5.00f, 6.00f, "Pz", 60, 15);
        inventory[4] = new Product("Loratadine", 3.00f, 4.00f, "Pz", 90, 25);
        inventory[5] = new Product("Simvastatin", 10.00f, 11.00f, "Pz",  40, 10);
        inventory[6] = new Product("Metformin", 7.00f, 8.00f, "Pz",  70, 20);
        inventory[7] = new Product("Aspirin", 1.00f, 2.00f, "Pz",  120, 30);
        inventory[8] = new Product("Sodium Chloride", 2.00f, 3.00f, "Pz", 200, 25);
        inventory[9] = new Product("Diclofenac", 4.50f, 5.50f, "Pz",  65, 18);
        inventory[10] = new Product("Cetirizine", 3.50f, 4.50f, "Pz", 75, 20);
        inventory[11] = new Product("Metoprolol", 8.00f, 9.00f, "Pz",  35, 15);
        inventory[12] = new Product("Insulin", 15.00f, 16.00f, "Pz",  25, 10);
        inventory[13] = new Product("Salbutamol", 3.50f, 4.50f, "Pz",  60, 20);
        inventory[14] = new Product("Warfarin", 6.50f, 7.50f, "Pz", 50, 15);





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
        System.out.println("\n\n====== Pharmacy Yahualica ======");
        System.out.println("\n Select an activity");

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

    // public static void manageClients() {

    //     clearScreen();

    //     System.err.println("\n====== Pharmacy Yahualica ======");
    //     System.err.println("       = Manage Clients =");
    //     System.err.println("\n Select an activity:");

    //     System.out.println("1- Add client");
    //     System.out.println("2- Update client");
    //     System.out.println("3- Delete client");
    //     System.out.println("\t4- Back");

    //     System.out.print("   -> ");
    //     int option = scanner.nextInt();

    //     switch (option) {
    //         case 1:

    //             break;

    //         case 2:

    //             break;

    //         case 3:

    //             break;

    //         case 4:
    //             mainMenu();
    //             break;

    //         default:
    //             break;
    //     }

    // }

    // public static void manageSuplier() {
    //     int count = 0;
    //     int idSupplier;
    //     int choice;

    //     boolean editing = true;

    //     String name, email, phone, address, company;

    //     clearScreen();
    //     System.err.println("\n====== Pharmacy Yahualica ======");
    //     System.err.println("      = Manage Suppliers =");
    //     System.err.println("\n Select an activity:");

    //     System.out.println("1- Add supplier");
    //     System.out.println("2- Update supplier");
    //     System.out.println("3- Delete supplier");
    //     System.out.println("\t4- Back");

    //     System.out.print("   -> ");
    //     choice = scanner.nextInt();

    //     suppliers[0] = new Supplier("name", "email", "phone", "address", "company");

    //     switch (choice) {

    //         case 1: //Add supplier

    //             // pause
    //             scanner.nextLine();

    //             System.out.print("Nombre: ");
    //             name = scanner.nextLine();

    //             System.out.print("E-mail: ");
    //             email = scanner.nextLine();

    //             System.out.print("Phone: ");
    //             phone = scanner.nextLine();

    //             System.out.print("Address: ");
    //             address = scanner.nextLine();

    //             System.out.print("Company: ");
    //             company = scanner.nextLine();

    //             for (int i = 0; i < suppliers.length; i++) {
    //                 if (suppliers[i] == null) {
    //                     count = i;
    //                     break;
    //                 }
    //             }

    //             suppliers[count] = new Supplier(name, email, phone, address, company);

    //             break;

    //         case 2: //Update supplier

    //             System.out.println("id User to update");
    //             idSupplier = scanner.nextInt();

    //             // pause
    //             scanner.nextLine();

    //             editing=true;

    //             while (editing) {
    //                 System.out.println("Which field do you want to edit?");
    //                 System.out.println("1- Name");
    //                 System.out.println("2- E-mail");
    //                 System.out.println("3- Phone");
    //                 System.out.println("4- Address");
    //                 System.out.println("5- Company");
    //                 System.out.println("\t0- Exit");

    //                 choice = scanner.nextInt();
    //                 scanner.nextLine();

    //                 switch (choice) {
    //                     case 1:
    //                         System.out.println("Nombre");
    //                         suppliers[idSupplier].name = scanner.nextLine();
    //                         break;
    //                     case 2:
    //                         System.out.println("E-mail");
    //                         suppliers[idSupplier].email = scanner.nextLine();
    //                         break;
    //                     case 3:
    //                         System.out.println("Phone");
    //                         suppliers[idSupplier].phone = scanner.nextLine();
    //                         break;
    //                     case 4:
    //                         System.out.println("Address");
    //                         suppliers[idSupplier].address = scanner.nextLine();
    //                         break;
    //                     case 5:
    //                         System.out.println("Company");
    //                         suppliers[idSupplier].company = scanner.nextLine();
    //                         break;
    //                     case 0:
    //                         editing = false;
    //                         break;
    //                     default:
    //                         System.out.println("Invalid choice. Please try again.");
    //                 }
    //             }

    //             System.out.println("Updated Supplier Info:");
    //             System.out.println(suppliers[idSupplier]);

    //         case 3: //Delete supplier
            
    //         editing=true;

    //         while (editing) {
    //             System.out.println("id supplier to delete");
    //             idSupplier = scanner.nextInt();
                
    //             System.out.println("Is this the supplier");
    //             System.out.println("1- Yes\t2-No");
    //             System.out.println(suppliers[idSupplier]);
    //             choice = scanner.nextInt();
                
    //             if(choice == 1){
    //                 suppliers[idSupplier]=null;
    //                 suppliers[idSupplier].status = false;
    //                 System.out.println("Supplier deleted");
    //             }

    //             System.out.println("Delete another supplier");
    //             System.out.println("1- Yes\t2-No");
    //             choice = scanner.nextInt();

    //             if (editing) {
                    
    //             }

    //         }

    //             break;

    //         case 4:
    //             mainMenu();
    //             break;

    //         default:
    //             break;
    //     }

    // }

    // public static void manageEmployees() {
    //     clearScreen();
    //     System.err.println("\n====== Pharmacy Yahualica ======");
    //     System.err.println("      = Manage Employees =");
    //     System.err.println("\n Select an activity");
    // }


    public static void manageClients() {

        clearScreen();

        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("       = Manage Clients =");
        System.out.println("\n Select an activity:");

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

//Suplier

    public static void manageSuplier() {
        int choice;

        do {
            clearScreen();
            System.out.println("\n====== Pharmacy Yahualica ======");
            System.out.println("      = Manage Suppliers =");
            System.out.println("\n Select an activity:");

            System.out.println("1- Add supplier");
            System.out.println("2- Update supplier");
            System.out.println("3- Delete supplier");
            System.out.println("\t4- Back");

            System.out.print("   -> ");
            choice = scanner.nextInt();

            // suppliers[0] = new Supplier("name", "email", "phone", "address", "company");

            switch (choice) {

                case 1: // Add supplier
                    addSupplier();
                    break;

                case 2: // Update supplier
                    updateSupplier();
                    break;

                case 3: // Delete supplier
                    deleteSupplier();
                    break;

                case 4:
                    mainMenu();
                    break;

                default:
                    break;
            }
        } while (true);

    }

    public static void addSupplier() {
        int count = 0;

        String name, email, phone, address, company;

        clearScreen();
        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("      = Add supplier =");

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

        System.out.println("\n\tSupplier added: ");
        System.out.println(suppliers[count]);

        // pause
        scanner.nextLine();
    }

    public static void updateSupplier() {
        int idSupplier;
        int choice;

        boolean editing = true;

        clearScreen();
        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("      = Update supplier =");

        System.out.println("id User to update");
        idSupplier = scanner.nextInt();

        System.out.println("Is this the supplier?\n");
        System.out.println(suppliers[idSupplier]);
        System.out.println("\n1- Yes\t0- No");
        System.out.print("   -> ");
        choice = scanner.nextInt();

        if (choice == 0) {
            updateSupplier();
        }

        // pause
        scanner.nextLine();

        editing = true;

        while (editing) {
            System.out.println("\nWhich field do you want to edit?");
            System.out.println("1- Name");
            System.out.println("2- E-mail");
            System.out.println("3- Phone");
            System.out.println("4- Address");
            System.out.println("5- Company");
            System.out.println("\t0- Exit edit mode");

            System.out.print("   -> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nombre: ");
                    suppliers[idSupplier].name = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("E-mail: ");
                    suppliers[idSupplier].email = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Phone: ");
                    suppliers[idSupplier].phone = scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Address: ");
                    suppliers[idSupplier].address = scanner.nextLine();
                    break;
                case 5:
                    System.out.print("Company: ");
                    suppliers[idSupplier].company = scanner.nextLine();
                    break;
                case 0:
                    editing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        clearScreen();
        System.out.println("Updated Supplier Info:");
        System.out.println(suppliers[idSupplier]);

        // pause
        scanner.nextLine();
    }

    public static void deleteSupplier() {
        int idSupplier;
        int choice;

        boolean editing = true;

        clearScreen();
        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("      = Delete supplier =");

        editing = true;

        while (editing) {
            System.out.println("id supplier to delete");
            idSupplier = scanner.nextInt();

            System.out.println("Is this the supplier?\n");
            System.out.println(suppliers[idSupplier]);
            System.out.println("\n1- Yes\t0- No");
            System.out.print("   -> ");
            choice = scanner.nextInt();

            if (choice == 1) {
                suppliers[idSupplier] = null;
                System.out.println("Supplier deleted");
            }

            System.out.println("Delete another supplier");
            System.out.println("1- Yes\t0-No");
            choice = scanner.nextInt();

            if (choice == 0) {
                editing = false;
            }

        }

        // pause
        scanner.nextLine();
    }

//Employees

    public static void manageEmployees() {
        int choice;

        do {
            clearScreen();
            System.out.println("\n====== Pharmacy Yahualica ======");
            System.out.println("      = Manage Employees =");
            System.out.println("\n Select an activity:");

            System.out.println("1- Add employee");
            System.out.println("2- Update employee");
            System.out.println("3- Delete employee");
            System.out.println("\t4- Back");

            System.out.print("   -> ");
            choice = scanner.nextInt();


            switch (choice) {

                case 1: // Add employee
                    addEmployee();
                    break;

                case 2: // Update employee
                    updateEmployee();
                    break;

                case 3: // Delete employee
                    deleteEmployee();
                    break;

                case 4:
                    mainMenu();
                    break;

                default:
                    break;
            }
        } while (true);

    }

    public static void addEmployee() {
        int count = 0;

        String name, email, phone, address, role;

        clearScreen();
        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("      = Add employee =");

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

        System.out.print("Role: ");
        role = scanner.nextLine();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                count = i;
                break;
            }
        }

        employees[count] = new Employee(name, email, phone, address, role);

        System.out.println("\n\tSupplier added: ");
        System.out.println(employees[count]);

        // pause
        scanner.nextLine();
    }

    public static void updateEmployee() {
        int idEmployee;
        int choice;

        boolean editing = true;

        clearScreen();
        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("      = Update employee =");

        System.out.println("id employee to update");
        idEmployee = scanner.nextInt();

        System.out.println("Is this the employee?\n");
        System.out.println(employees[idEmployee]);
        System.out.println("\n1- Yes\t0- No");
        System.out.print("   -> ");
        choice = scanner.nextInt();

        if (choice == 0) {
            updateEmployee();
        }

        // pause
        scanner.nextLine();

        editing = true;

        while (editing) {
            System.out.println("\nWhich field do you want to edit?");
            System.out.println("1- Name");
            System.out.println("2- E-mail");
            System.out.println("3- Phone");
            System.out.println("4- Address");
            System.out.println("5- Role");
            System.out.println("\t0- Exit edit mode");

            System.out.print("   -> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nombre: ");
                    employees[idEmployee].name = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("E-mail: ");
                    employees[idEmployee].email = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Phone: ");
                    employees[idEmployee].phone = scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Address: ");
                    employees[idEmployee].address = scanner.nextLine();
                    break;
                case 5:
                    System.out.print("Role: ");
                    employees[idEmployee].role = scanner.nextLine();
                    break;
                case 0:
                    editing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        clearScreen();
        System.out.println("Updated Employee Info:");
        System.out.println(suppliers[idEmployee]);

        // pause
        scanner.nextLine();
    }

    public static void deleteEmployee() {
        int idEmployee;
        int choice;

        boolean editing = true;

        clearScreen();
        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("      = Delete employee =");

        editing = true;

        while (editing) {
            System.out.println("id employee to delete");
            idEmployee = scanner.nextInt();

            System.out.println("Is this the employee?\n");
            System.out.println(suppliers[idEmployee]);
            System.out.println("\n1- Yes\t0- No");
            System.out.print("   -> ");
            choice = scanner.nextInt();

            if (choice == 1) {
                employees[idEmployee] = null;
                System.out.println("Employee deleted");
            }

            System.out.println("Delete another employee");
            System.out.println("1- Yes\t0-No");
            choice = scanner.nextInt();

            if (choice == 0) {
                editing = false;
            }

        }

        // pause
        scanner.nextLine();
    }


    public static void manageProducts() {
        int count = 0;
        int idProduct;
        int choice;
        boolean editing = true;
        String name, units;
        float price, cost;
        boolean status;
        int stock, reorderPoint;

        clearScreen();
        System.out.println("\n====== Pharmacy Yahualica ======");
        System.out.println("      = Manage Products =");
        System.out.println("\n Select an activity:");
        System.out.println("1- Add product");
        System.out.println("2- Update product");
        System.out.println("3- Delete product");
        System.out.println("\t4- Back");

        System.out.print("   -> ");
        choice = scanner.nextInt();


        switch (choice) {
            case 1: // Add product
                scanner.nextLine(); // pause

                System.out.print("Name: ");
                name = scanner.nextLine();

                System.out.print("Cost: ");
                cost = scanner.nextFloat();

                System.out.print("Price: ");
                price = scanner.nextFloat();

                scanner.nextLine(); // pause

                System.out.print("Units(ej. pz, kg): ");
                units = scanner.nextLine();

                System.out.print("Stock: ");
                stock = scanner.nextInt();

                System.out.print("Reorder Point: ");
                reorderPoint = scanner.nextInt();

                for (int i = 0; i < inventory.length; i++) {
                    if (inventory[i] == null) {
                        count = i;
                        break;
                    }
                }

                inventory[count] = new Product(name, cost, price, units, stock, reorderPoint);

                System.out.println("Product added");
                System.out.println(inventory[count]);
                break;

            case 2: // Update product
                System.out.print("ID Product to update: ");
                idProduct = scanner.nextInt();
                scanner.nextLine(); // pause

                while (editing) {
                    System.out.println("Which field do you want to edit?");
                    System.out.println("1- Name");
                    System.out.println("2- Cost");
                    System.out.println("3- Price");
                    System.out.println("4- Units");
                    System.out.println("5- Status");
                    System.out.println("6- Add Stock");
                    System.out.println("7- Stock");
                    System.out.println("8- Reorder Point");
                    System.out.println("\t0- Exit");

                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Name");
                            inventory[idProduct].setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Cost");
                            inventory[idProduct].setCost(scanner.nextFloat());
                            scanner.nextLine(); // pause
                            break;
                            case 3:
                                System.out.println("Price");
                        inventory[idProduct].setPrice(scanner.nextFloat());
                        scanner.nextLine(); // pause
                        break;
                        case 4:
                            System.out.println("Units");
                            inventory[idProduct].setUnits(scanner.nextLine());
                            break;
                        case 5:
                            System.out.println("Status");
                            inventory[idProduct].setStatus(scanner.nextBoolean());
                            scanner.nextLine(); // pause
                            break;
                            case 6:
                            System.out.println("Add Stock");
                            inventory[idProduct].setStock(inventory[idProduct].getStock() + scanner.nextInt());
                            scanner.nextLine(); // pause
                            break;
                        case 7:
                            System.out.println("Stock");
                            inventory[idProduct].setStock(scanner.nextInt());
                            scanner.nextLine(); // pause
                            break;
                        case 8:
                            System.out.println("Reorder Point");
                            inventory[idProduct].setReorderPoint(scanner.nextInt());
                            scanner.nextLine(); // pause
                            break;
                        case 0:
                            editing = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }

                System.out.println("Updated Product Info:");
                System.out.println(inventory[idProduct]);

                break;

            case 3: // Delete product
                System.out.print("ID Product to delete: ");
                idProduct = scanner.nextInt();
                System.out.println("Is this the product");
                System.out.println("1- Yes\t2- No");
                System.out.println(inventory[idProduct]);
                choice = scanner.nextInt();
                if (choice == 1) {
                    inventory[idProduct] = null;
                    System.out.println("Product deleted");
                }

                break;

            case 4:
                break;

            default:
                break;
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}