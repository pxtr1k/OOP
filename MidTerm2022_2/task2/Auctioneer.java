public class Auctioneer extends Agent implements Auctionable {
    private int startingPrice;

    public Auctioneer(String name, int id){
        super(name, id);
        startAuction();
    }
    public int getStartingPrice() {
        return startingPrice;
    }
    public void setStartingPrice(int startingPrice) {
        this.startingPrice = startingPrice;
    }
    public void startAuction(){
      startingPrice=(int)(((20-10+1)+10)*(Math.random()));
    }
    @Override
    public String getAgentType(){
        return "auctioneer";
    }
}
