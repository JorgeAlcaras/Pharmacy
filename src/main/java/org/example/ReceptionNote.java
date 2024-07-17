package org.example;

public class ReceptionNote {
    int id;
    Supplier supplier; //The supplier is the same that restock order
    Product[] products = new Product[10]; //This will be the same products that restock order
    String receivedDate;
    float total;
    private static int count = 0;

    public ReceptionNote (){
        this.id = count++;
    }

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

    public String toString() {

        StringBuilder note = new StringBuilder();
        note.append("====================================\n");
        note.append("           RECEPTION NOTE           \n");
        note.append("====================================\n");
        note.append("Received Date: ").append(receivedDate).append("\n");
        note.append("Supplier Name: ").append(supplier == null ? "No supplier" : supplier.getName()).append("\n");
        note.append("Company Name: ").append(supplier == null ? "No supplier" : supplier.getCompany() ).append("\n");
        note.append("------------------------------------\n");
        note.append("Products:\n");

        for (Product product : products) {
            if (product != null) {
                note.append(product).append("\n");
            } else {
                note.append("\n");
                break;
            }
        }

        note.append("------------------------------------\n");
        note.append(String.format("Total: %.2f\n", total ));
        note.append("====================================\n");

        return note.toString();
    }

}
