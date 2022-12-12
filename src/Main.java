public class Main {
    public static void main(String[] args) {
        Stock myStock = new Stock("ORCL", "Oracle Corporation");
        myStock.previousClosingPrice = 34.5;
        myStock.currentPrice = 34.35;
        System.out.println("Stocl name: " + myStock.name);
        System.out.println("Stock symbol:" + myStock.symbol);
        System.out.println("Price-change percentage:" + myStock.getChangePercent());
    }
}