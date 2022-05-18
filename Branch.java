package model;

import java.util.List;


public class Branch {
    String location;
    String branchManager;
    List<Product> products;


    public Branch(String location, String managerName, List<String> listOfProducts) {
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
