package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Ticket {
    private static int count = 0;
    int productCount = 0;
    int id;
    String date;
    String clientName;
    Product[] products = new Product[15];
    double total;
    double subtotal;
    double discount;
    double amountReceived;
    double amountReturned;
    String paymentMethod;

    public Ticket() {
        this.id = count++;
        this.date = LocalDate.now().toString();
        this.total = 0;
        this.subtotal = 0;
        this.discount = 0;
        this.amountReceived = 0;
        this.amountReturned = 0;
        this.paymentMethod = "";
    }

    public Ticket(Product[] products, double amountReceived, String paymentMethod) {
        this.id = count++;
        this.date = LocalDate.now().toString();
        this.products = products;
        total = 0;
        subtotal = 0;
        discount = 0;
        this.amountReceived = amountReceived;
        this.amountReturned = 0;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClientName() {
        return this.clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addProduct(int productID, int quantity) {
        // System.out.println(productCount);
        for (Product product : Main.inventory) {
            if (product != null)
                if (product.getId() == productID) {
                    this.products[productCount] = product;
                    this.products[productCount].quantity = quantity;
                    subtotal += products[productCount].price * products[productCount].quantity;
                }
        }
        productCount++;
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void setAmountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String toString() {

        if (subtotal > 100) {
            discount = subtotal * 0.10;
        }

        total = subtotal - discount;

        amountReturned = amountReceived - total;


        StringBuilder ticket = new StringBuilder();
        ticket.append("====================================\n");
        ticket.append("                TICKET              \n");
        ticket.append("====================================\n");
        ticket.append("Date: ").append(date).append("\n");
        ticket.append("Client Name: ").append(clientName).append("\n");
        ticket.append("------------------------------------\n");
        ticket.append("Products:\n");


        for (Product product : products) {
            if (product != null) {
                ticket.append(String.format("%d%s %s %.2f - %.2f", product.quantity, product.units, product.name, product.price, product.price * product.quantity)).append("\n");
            }
        }

        ticket.append("------------------------------------\n");
        ticket.append(String.format("Subtotal: %.2f\n", subtotal));
        ticket.append(String.format("Discount: %.2f\n", discount));
        ticket.append(String.format("Total: %.2f\n", total));
        ticket.append(String.format("Amount Received: %.2f\n", amountReceived));
        if (Objects.equals(paymentMethod, "Cash") || Objects.equals(paymentMethod, "cash")) {
            ticket.append(String.format("Amount Returned: %.2f\n", amountReturned));
        }
        ticket.append("Payment Method: ").append(paymentMethod).append("\n");
        ticket.append("====================================\n");

        return ticket.toString();
    }


}
