package org.example;

import static java.lang.Integer.parseInt;

public class Product{
    int id;
    int barCode = 1000000;
    String name;
    float price;
    float cost;
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
        this.units = "pz";
        this.status = false;
        this.stock = 0;
        this.reorderPoint = 0;
        this.reorderPointCost = 0;
    }

    public Product(String name, float price, String units, boolean status, int stock, int reorderPoint, double reorderPointCost){
        this.id = count++;
        this.name = name;
        this.barCode = 1000000 + count;
        this.cost = 0;
        this.price = price;
        this.units =  "pz";
        this.status = status;
        this.stock = stock;
        this.reorderPoint = reorderPoint;
        this.reorderPointCost = reorderPointCost;
    }

    public void setId(int id){
        this.id = id;
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public int getReorderPoint() {
        return reorderPoint;
    }

    public double getReorderPointCost() {
        return reorderPointCost;
    }

    public void delete(){
        this.name = "";
        this.cost = 0;
        this.price = 0;
        this.quantity = 0;
        this.units = "";
        this.status = false;
        this.stock = 0;
        this.reorderPoint = 0;
        this.reorderPointCost = 0;
    }



    public String toString() {
        return String.format("%d%s %s %.2f - %.2f", quantity, units, name, price, price * quantity);
    }
}
