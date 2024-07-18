package org.example;

import static java.lang.Integer.parseInt;

public class Product{
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

    private static int count = 0;

    public Product(){
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

    public Product(String name, String brand, float cost, float price, String units, int stock, int reorderPoint){
        this.id = count++;
        this.name = name;
        this.barCode = 1000000 + count;
        this.cost = cost;
        this.price = price;
        this.units =  units;
        this.brand = brand;
        this.status = true;
        this.stock = stock;
        this.reorderPoint = reorderPoint;
        this.reorderPointCost = reorderPoint * price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(float cost){
        this.cost = cost;
    }
    public float getCost(){
        return this.cost;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getUnits() {
        return units;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }

    public void setReorderPoint(int reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public int getReorderPoint() {
        return reorderPoint;
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
