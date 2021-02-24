public class Stock {
    public int id;
    public String symbol;
    public int quantity;
    public double price;

    public Stock(int id, String symbol, int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void stockPrice(double price){
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = 5.0;
    }
}
