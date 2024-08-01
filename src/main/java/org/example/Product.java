package org.example;

public class Product {
    private static int count = 0;
    int id;
    int barCode = 1000000;
    String name;
    float price;
    float cost;
    String brand;
    int quantity;
    String units; //Unidades de medida
    boolean status;
    int stock;
    int reorderPoint;
    double reorderPointCost;

    public Product() {
        this.id = count++;
        this.barCode++;
        this.name = "";
        this.cost = 0;
        this.price = 0;
        this.brand = "";
        this.units = "pz";
        this.status = false;
        this.stock = 0;
        this.reorderPoint = 0;
        this.reorderPointCost = 0;
    }

    public Product(String name, String brand, float cost, float price, String units, int stock, int reorderPoint) {
        this.id = count++;
        this.name = name;
        this.barCode = 1000000 + count;
        this.cost = cost;
        this.price = price;
        this.units = units;
        this.brand = brand;
        this.status = true;
        this.stock = stock;
        this.reorderPoint = reorderPoint;
        this.reorderPointCost = reorderPoint * price;
    }

    public Product(String name, String units) {
        this.id = count++;
        this.name = name;
        this.barCode = 1000000 + count;
        this.cost = 0;
        this.price = 0;
        this.units = units;
        this.status = true;
        this.stock = 0;
        this.reorderPoint = 0;
        this.reorderPointCost = 0;
    }

    public int getId(){
        return this.id;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(int reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public double getReorderPointCost() {
        return reorderPointCost;
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Brand: " + brand + "\n" +
                "BarCode: " + barCode + "\n" +
                "Price: " + price + "\n" +
                "Cost: " + cost + "\n" +
                "Units: " + units + "\n" +
                "Status: " + status + "\n" +
                "Stock: " + stock + "\n" +
                "Reorder Point: " + reorderPoint + "\n" +
                "Reorder Point Cost: " + reorderPointCost + "\n";
    }
}
