package entities;

public class Product {

    private int accountNumber;

    private String name;

    public char initialDeposit;

    private double valueDeposit;


    public Product(int accountNumber, String name, char initialDeposit, double valueDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.initialDeposit = initialDeposit;
        this.valueDeposit = valueDeposit;
    }

    public Product(String name, char initialDeposit) {
        this.name = name;
        this.initialDeposit = initialDeposit;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getValueDeposit() {
        return valueDeposit;
    }

    public void setValueDeposit(double valueDeposit) {
        this.valueDeposit = valueDeposit;
    }


}
