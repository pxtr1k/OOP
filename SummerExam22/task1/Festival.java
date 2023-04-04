import java.util.Arrays;

public class Festival extends MusicEvent{
    private int duration;
    private TicketType[] tickets;

    public Festival(String[] lineup, double price, int duration, TicketType[] tickets){
        super(lineup, price);
        this.duration=duration;
        this.tickets=tickets;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public TicketType[] getTickets() {
        return tickets;
    }
    public void setTickets(TicketType[] tickets) {
        this.tickets = tickets;
    }
    @Override
    public double calculatePrice(){
        double price=0.;
        for(TicketType ticket:tickets){
            if(ticket==TicketType.MULTI_DAY_PASSES){
                price+=getPrice()*getDuration()*0.8;
            }if(ticket==TicketType.VIP){
                price+=getPrice()*2*getDuration();
            }if(ticket==TicketType.DAILY_TICKET){
                price+=getPrice();
            }
        }
        return price;
    }
    @Override
    public String checkLineup(){
        if(getLineup().length<getDuration()){
            return "Add artists to lineup";
        }else {
           return String.format("Lineup: %s", Arrays.toString(getLineup()));
        }

    }
}
