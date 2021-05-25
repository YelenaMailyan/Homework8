package com.company;

public class Store {

    int productNumber;
    private int countOfWorkers;        //countOfWorkers must be in range 2 - 50
    private String name;               //name must have at least 3 characters
    private String phoneNumber;        //phoneNumber must have 8 digits,

    public Store() {
    }

    public Store(int countOfWorkers, String name, String phoneNumber, int productNumber) {
        setCountOfWorkers(countOfWorkers);
        setName(name);
        setPhoneNumber(phoneNumber);
        setProductNumber(productNumber);
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        } else System.out.println("count of workers is wrong , it must be 2-50");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else System.out.println("Wrong input for field Name");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^\\d{8}$")) {
            this.phoneNumber = phoneNumber;
        } else System.out.println("Wrong input,phoneNumber must have 8 digits");
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void printStoreInfo() {
        System.out.println(getName() + ":Number of workers is " + getCountOfWorkers() + " Phone: " + getPhoneNumber() + " In stock:" + getProductNumber());
    }

    public void sellProducts(int numberOfSoldProducts) {
        if (getProductNumber() - numberOfSoldProducts > 0) {
            setProductNumber(getProductNumber() - numberOfSoldProducts);
        } else
            System.out.println("Sorry, cant sell " + numberOfSoldProducts + " products, there is not enough products in stock");

    }

}
