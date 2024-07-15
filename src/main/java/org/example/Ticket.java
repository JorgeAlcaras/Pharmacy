package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Ticket {
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

    private static int count = 0;
    private static int productCount = 0;

    public Ticket(){
        this.id = count++;
        this.date = "";
        this.total = 0;
        this.subtotal = 0;
        this.discount = 0;
        this.amountReceived = 0;
        this.amountReturned = 0;
        this.paymentMethod = "";
    }

    public Ticket(String date, Product[] products,  double amountReceived, String paymentMethod){
        this.id = count++;
        this.date = date;
        this.products = products;
        total = 0;
        subtotal = 0;
        discount = 0;
        this.amountReceived = amountReceived;
        this.amountReturned = 0;
        this.paymentMethod = paymentMethod;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return this.date;
    }

    public void setClientName(String clientName){
        this.clientName = clientName;
    }

    public String getClientName(){
        return this.clientName;
    }

    public void addProduct(int productBarCode, int quantity){
        for (Product product : Main.inventory) {
            if(product != null)
                if(product.barCode == productBarCode){
                    this.products[productCount] = product;
                    this.products[productCount].quantity = quantity;
                    subtotal += products[productCount].price * products[productCount].quantity;
            }
        }
        productCount++;
    }

    public Product[] getProducts(){
        return this.products;
    }

    public void setAmountReceived(double amountReceived){
        this.amountReceived = amountReceived;
    }

    public void setPaymentMethod(String paymentMethod){
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
                ticket.append(product).append("\n");
            } else {
                ticket.append("\n");
                break;
            }
        }

        ticket.append("------------------------------------\n");
        ticket.append(String.format("Subtotal: %.2f\n", subtotal));
        ticket.append(String.format("Discount: %.2f\n", discount));
        ticket.append(String.format("Total: %.2f\n", total ));
        ticket.append(String.format("Amount Received: %.2f\n", amountReceived));
        if (Objects.equals(paymentMethod, "Cash") || Objects.equals(paymentMethod, "cash")) {
            ticket.append(String.format("Amount Returned: %.2f\n", amountReturned));
        }
        ticket.append("Payment Method: ").append(paymentMethod).append("\n");
        ticket.append("====================================\n");

        return ticket.toString();
    }


}
