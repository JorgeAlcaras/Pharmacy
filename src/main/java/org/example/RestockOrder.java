package org.example;

import java.time.LocalDate;

public class RestockOrder {
    private int id;
    private String date;
    private Supplier supplier;
    private Product[] products = new Product[15];
    private double total;
    private final double subtotal;
    private double amountReceived;
    private double amountReturned;

    public RestockOrder() {
        this.id++;
        this.date = LocalDate.now().toString();
        this.total = 0;
        this.subtotal = 0;
    }

    public RestockOrder(Product[] products) {
        this.id++;
        this.date = LocalDate.now().toString();
        this.products = products;
        total = 0;
        subtotal = 0;
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

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void addProduct(int productID, int quantity, int id) {
        int i = 0;

        if (Main.inventory[productID] != null) {
            for (Product product : products) {
                if (product != null && product.id == productID) {
                    product.quantity += quantity;
                    break;
                } else {
                    if (Main.inventory[productID] != null) {
                        products[id] = Main.inventory[productID];
                        products[id].quantity = quantity;
                    }
                }
            }
        }
    }

    public double getTotal() {
        for (Product product : products) {
            if (product != null) {
                total += (product.quantity * product.cost);
            }
        }
        return total;
    }

    public String toString() {
        StringBuilder restockOrder = new StringBuilder();
        restockOrder.append("====================================\n");
        restockOrder.append("           RESTOCK ORDER           \n");
        restockOrder.append("====================================\n");
        restockOrder.append("Restock order Date: ").append(date).append("\n");
        restockOrder.append("Supplier Name: ").append(supplier == null ? "No supplier" : supplier.getName()).append("\n");
        restockOrder.append("Company Name: ").append(supplier == null ? "No supplier" : supplier.getCompany()).append("\n");
        restockOrder.append("------------------------------------\n");
        restockOrder.append("Products:\n");

        for (Product product : products) {
            if (product != null) {
                restockOrder.append(String.format("%d%s %s %.2f %.2f",
                        product.quantity, product.units, product.name, product.cost, (product.quantity * product.cost))).append("\n");
            } else {
                restockOrder.append("\n");
                break;
            }
        }

        restockOrder.append("------------------------------------\n");
        restockOrder.append(String.format("Total: %.2f\n", getTotal()));
        restockOrder.append("====================================\n");

        return restockOrder.toString();
    }
}
