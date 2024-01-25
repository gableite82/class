package util;

public class currencyCoverter {
    public static double IOF = 0.06;
    public static double converter(double valorDollar, double comprarDollar){
        return comprarDollar * IOF + valorDollar * comprarDollar;
    }
}
