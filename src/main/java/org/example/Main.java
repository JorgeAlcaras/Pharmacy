package org.example;

import java.util.Arrays;

public class Main {
    static Product[] inventory = new Product[15];


    public static void main(String[] args) {

        inventory[0] = new Product("Paracetamol", 2.00f, "Analgesic", true, 100, 20, 20.00);
        inventory[1] = new Product("Ibuprofen", 4.00f,  "Anti-inflammatory", true, 80, 20, 30.00);
        inventory[2] = new Product("Amoxicillin", 6.00f,  "Antibiotic", true, 50, 15, 40.00);
        inventory[3] = new Product("Omeprazole", 5.00f, "Antacid", true, 60, 15, 35.00);
        inventory[4] = new Product("Loratadine", 3.00f,  "Antihistamine", true, 90, 25, 25.00);
        inventory[5] = new Product("Simvastatin", 10.00f,  "Lipid-lowering", true, 40, 10, 50.00);
        inventory[6] = new Product("Metformin", 7.00f, "Antidiabetic", true, 70, 20, 44.00);
        inventory[7] = new Product("Aspirin", 1.00f,  "Analgesic", true, 120, 30, 15.00);
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
        ticket.addProduct(1000001, 7 );
        ticket.addProduct(1000002, 1000);
        ticket.addProduct(1000014, 1);
        ticket.addProduct(1000011, 4);
        ticket.setPaymentMethod("Cash");
        ticket.setAmountReceived(10000);

        System.out.println(ticket);

    }
}