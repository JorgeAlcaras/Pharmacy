package org.example;

public class Person {
    int id;
    String name;
    String email;
    String phone;
    String address;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

   public void setEmail(String email){
        this.email = email;
   }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Address: " + address + "\n";
    }
}

class Supplier extends Person {
    String company;

    private static int count = 0;


    public Supplier(){
        this.id = count++;
        this.name = "";
        this.email = "";
        this.phone = "";
        this.address = "";
        this.company = "";
    }

    public Supplier(String name, String email, String phone, String address, String company){
        this.id = count++;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.company = company;
    }
    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return this.company;
    }

    @Override
    public String toString() {
        return super.toString() + "Company: " + company + "\n";
    }
}

class Employee extends Person {
    String role;

    private static int count = 0;

    public Employee(){
        this.id = count++;
        this.name = "";
        this.email = "";
        this.phone = "";
        this.address = "";
        this.role = "";
    }

    public Employee(String name, String email, String phone, String address, String role){
        this.id = count++;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public void setRole(String position){
        this.role = position;
    }

    public String getRole(){
        return this.role;
    }

    @Override
    public String toString() {
        return super.toString() + "Position: " + role + "\n";
    }
}

