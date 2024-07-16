package org.example;

public class ReceptionNote {
    int id;
    Product[] products = new Product[10];
    String receivedDate;
    float total;

    public float getTotal() {
        for(Product product: products){
            total += (int) product.cost;
        }
        return total;
    }

    public void setReceivedDate(String receivedDate){
        int i = 0;

        if (receivedDate != null){
            for (Product product : Main.inventory){
                if (products.length > i) {
                    if (product.id == products[i].id) {
                        product.stock += product.quantity;
                    }
                }
            }
        }
    }
}
