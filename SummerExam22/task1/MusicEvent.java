public abstract class MusicEvent implements PriceCalculation{
    private String[] lineup;
    private double price;

    public MusicEvent(String []lineup, double price){
        this.lineup=lineup;
        this.price=price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String[] getLineup() {
        return lineup;
    }
    public void setLineup(String[] lineup) {
        this.lineup = lineup;
    }
    public abstract String checkLineup();
}
