package zad1;

public class CameraDrone extends Aircraft implements Unmanned {

	private final int range;
	private int[]qualities;
	
	public CameraDrone(String model, String dateProduced, int range, int[]qualities) {
		super(model, dateProduced);
		this.range=range;
		this.qualities=qualities;
	}
	public int getRange() {
		return range;
	}
	public int[] getQualities() {
		return qualities;
	}
	public Status aircraftStatus() {
		double sum=0;
		for(int quality:qualities) {
			sum+=quality;
		}
		double average=sum/qualities.length;
		if(average>70 && average<=100)
			return Status.FUNCTIONAL;
		if(average>=50 && average<=70)
			return Status.NEED_CHECK;
		else
			return Status.OUT_OF_SERVICE;
		
	}
	public double coverArea(Number height) {
		return range*(double)height;
	}
	@Override
	public String toString() {
		return String.format("%s and has %d elements", super.toString(), qualities.length);
	}
	
}
