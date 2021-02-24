public class Trade {

    protected String id;
    protected String symbol;
    protected double price;

    public Trade(String id, String symbol,double price){
        this.id = id;
        this.symbol = symbol;
        this.price = price;
    }

    public Trade(String id){
        this.id = id;
        this.symbol = symbol;
    }

    public void setPrice(double price) {
        if(price >0){
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public String toString(){

        System.out.println
                ("id = "+id+" symbol="+" price = ");
    return null;
    }

    Trade t1= new Trade("T1","APPL",15.25);

}
