package entities;

public class Product {
    public String productName;
    public double productPrice;
    public int productQuantity;
    public int stockEntry;
    public int stockOutput;


    public void stockIn(int stockEntry){
       this.productQuantity = productQuantity + stockEntry;
    }

    public void stockOut(int stockOutput){
        this.productQuantity =  productQuantity - stockOutput;
    }

    public double stockValue(){
        return productQuantity * productPrice;
    }

    @Override
    public String toString() {
        return "PRODUTO: " + productName + "\n"
                + "PREÇO: " + String.format("%.2f", productPrice) + "\n"
                + "QUANTIDADE ESTOQUE: " + productQuantity + "\n"
                + "VALOR PRODUTO EM ESTOQUE: " + stockValue();

    }
}
