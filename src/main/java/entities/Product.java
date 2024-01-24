package entities;

public class Product {
    public String productName;
    public double productPrice;
    public int productQuantity;
    public int stockEntry;
    public int stockOutput;


    public int stockIn(){
         return productQuantity =  productQuantity + stockEntry;
    }

    public int stockOut(){
        return productQuantity =  productQuantity - stockOutput;
    }

    public double stockValue(){
        return productQuantity * productPrice;
    }
}
