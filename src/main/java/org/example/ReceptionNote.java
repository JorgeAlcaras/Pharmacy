package org.example;

public class ReceptionNote {
    int id = 0;
    Supplier supplier; //The supplier is the same that restock order
    Product[] products = new Product[10]; //This will be the same products that restock order
    String receivedDate;
    float total;


    public ReceptionNote(int supplierId, int productId, int quantity) {
        this.id++;
        this.receivedDate = "";
        this.total = 0;
        this.supplier = Main.suppliers[supplierId];
        addProduct(productId, quantity, id);

    }

    public ReceptionNote() {
        this.id++;
    }

    public float getTotal() {
        for (Product product : products) {
            if (product != null) {
                total += (product.quantity * product.cost);
            }
        }
        return total;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
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
                    Main.inventory[productID].stock += quantity;
                    break;
                } else {
                    if (Main.inventory[productID] != null) {
                        products[id] = Main.inventory[productID];
                        products[id].quantity = quantity;
                        Main.inventory[productID].stock += quantity;
                    }
                }
            }
        }



        /*
        for (Product product : products) {
            if (product != null) {
                if (product.id == productID) {
                    product.quantity += quantity;
                    product.stock += quantity;
                    break;
                }
            }

        }

        for (Product product : Main.inventory) {
            if (product != null) {
                if (product.id == productID) {
                    products[id] = product;
                    products[id].quantity = quantity;
                    product.stock += quantity;
                }
            }
        }
        */

    }

    public String toString() {

        StringBuilder note = new StringBuilder();
        note.append("====================================\n");
        note.append("           RECEPTION NOTE           \n");
        note.append("====================================\n");
        note.append("Received Date: ").append(receivedDate).append("\n");
        note.append("Supplier Name: ").append(supplier == null ? "No supplier" : supplier.getName()).append("\n");
        note.append("Company Name: ").append(supplier == null ? "No supplier" : supplier.getCompany()).append("\n");
        note.append("------------------------------------\n");
        note.append("Products:\n");

        for (Product product : products) {
            if (product != null) {
                note.append(String.format("%d%s %s %.2f %.2f",
                        product.quantity, product.units, product.name, product.cost, (product.quantity * product.cost))).append("\n");
            } else {
                note.append("\n");
                break;
            }
        }

        note.append("------------------------------------\n");
        note.append(String.format("Total: %.2f\n", getTotal()));
        note.append("====================================\n");

        return note.toString();
    }

}
