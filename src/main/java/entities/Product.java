package entities;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    public int stockEntry;
    public int stockOutput;

    ///////////////////////////////////////////////////////////////////

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    ////////////////////////////////////////////////////////////////////
    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    ///////////////////////////////////////////////////////////////////////////
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

//    public void setProductQuantity(int productQuantity) {
//        this.productQuantity = productQuantity;
//    }

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
