public class Trader {

    //protected String name;
    protected double price;
    protected int quantity;

    Account acc1 = new Account();

    public void addTrade(double price, int quantity){
      double newTotal;

      newTotal =  acc1.getTotalValue();
      newTotal += (price * quantity);

      acc1.setTotalValue(newTotal);
    }
}
