
public class Festival extends Event implements EventPromoter {
private Band[] bandList;

public Festival(String name, String location, String date, Band[] bands) {
	super(name, location, date);
	this.bandList = bands;
}
@Override
public void printEventPoster() {
	System.out.println("Event date: " +this.getDate());
	System.out.println("Festival: "+this.getName()+ " in "+this.getLocation());
	System.out.println("Band list for the festival is: ");
	for(int i=0;i<bandList.length;i++) {
		System.out.println("Band "+(i+1)+": " +bandList[i].getBandName());
	}
}

}
