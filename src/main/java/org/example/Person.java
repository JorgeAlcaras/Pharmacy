package org.example;

public class Person {
    private static int count = -1;
    int id;
    String name;
    String phone;
    String rfc;
    boolean status;

    public Person() {
        this.id = count++;
        this.name = "";
        this.phone = "";
        this.rfc = "";
        this.status = true;
    }

    public Person(String name, String phone, String rfc) {
        this.id = count++;
        this.name = name;
        this.phone = phone;
        this.rfc = rfc;
        this.status = true;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Phone: " + phone + "\n" +
                "RFC: " + rfc + "\n";
    }
}

class Supplier extends Person {
    private static int count = 0;
    String company;


    public Supplier() {
        this.id = count++;
        this.name = "";
        this.phone = "";
        this.rfc = "";
        this.company = "";
        this.status = true;
    }

    public Supplier(String name, String phone, String rfc, String company) {
        this.id = count++;
        this.name = name;
        this.phone = phone;
        this.rfc = rfc;
        this.company = company;
        this.status = true;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + "Company: " + company + "\n";
    }
}

class Employee extends Person {
    private static int count = 0;
    String role;

    public Employee() {
        this.id = count++;
        this.name = "";
        this.phone = "";
        this.rfc = "";
        this.role = "";
        this.status = true;
    }

    public Employee(String name, String phone, String rfc, String role) {
        this.id = count++;
        this.name = name;
        this.phone = phone;
        this.rfc = rfc;
        this.role = role;
        this.status = true;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String position) {
        this.role = position;
    }

    @Override
    public String toString() {
        return super.toString() + "Position: " + role + "\n";
    }
}

