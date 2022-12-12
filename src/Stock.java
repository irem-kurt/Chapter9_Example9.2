//UML diagram
/********************************************
 *                    Stock                  *
 *-------------------------------------------*
 * symbol: String                            *
 * name: String                              *
 * previousClosingPrice: double              *
 * currentPrice: double                      *
 *-------------------------------------------*
 * Stock(newSymbol: String, newName: String) *
 * getChangePercent(): double                *
 ********************************************/
/*
■ A string data field named symbol for the stock’s symbol.
■■ A string data field named name for the stock’s name.
■■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■■ A double data field named currentPrice that stores the stock price for the
current time.
■■ A constructor that creates a stock with the specified symbol and name.
■■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class then implement the class.
Write a test program that creates a Stock object with the stock symbol
ORCL, the name Oracle Corporation, and the previous closing price of
34.5. Set a new current price to
34.35 and display the price-change percentage.
 */
public class Stock {

    String symbol;
    String name;
    // Stores the storage price for the previous day.
    double previousClosingPrice;
    //  stores the stock price for the current time.
    double currentPrice;

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }
    double getChangePercent() {
        return  (100*(currentPrice-previousClosingPrice)) / currentPrice;
    }

}
