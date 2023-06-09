package entities;

public class Product {
    String name; // por convenção os atributos dos Objetos devem ser declarados como private
                         // se não colocarmos nada ele sera apenas reconhecido em classes que estão no mesmo pacote
    private double price;
    private int quantity;

    public Product(){ // Construtor padrão

    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Product(String name, double price){ // Sobrecarga - dessa forma quantity inicia com 0
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){ // nesse caso não iremos permitir a alteração da quantidade, apenas é possivel
        return quantity; // através do método de adicionar ou remover quantidade
    }


    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}