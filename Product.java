package model;

import java.text.DateFormat;
import java.util.Date;

public class Product {
    String name;
    String brandName;
    Branch branch;
    int price;
    DateFormat warrrantyDate;




    public Product(String name, String brandName, int price, Branch branch, DateFormat warrantyDate){
        this.name=name;
        this.brandName=brandName;
        this.price=price;
        this.warrrantyDate=warrantyDate;
        this.branch=branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public Branch getBranch() {
        return branch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getbrandName() {
        return brandName;
    }

    public void setbrandName(String brandName) {
        this.brandName = brandName;
    }

    public DateFormat getWarrrantyDate() {
        return warrrantyDate;
    }

    public void setWarrrantyDate(DateFormat warrrantyDate) {
        this.warrrantyDate = warrrantyDate;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", brandName='" + brandName + '\'' +
                ", location=" + branch.getLocation() +
                ", price=" + price +"$";
    }
}
