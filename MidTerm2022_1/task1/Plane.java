package zad1;

public class Plane extends Aircraft {
	private int capacity;
	private int[] motorsStatus;
	
	public Plane(String model, String dateProduced, int capacity, int[] motorsStatus) {
		super(model, dateProduced);
		this.capacity=capacity;
		this.motorsStatus=motorsStatus;
	}
	public Status aircraftStatus() {
		int counter100=0;
		int counterlower80=0;
		int counterlower100=0;
		for(int motor:motorsStatus) {
			if(motor==100)
				counter100++;
			if(motor<100 && motor>80)
				counterlower100++;
			else
				counterlower80++;
				
		}
		if(counter100==motorsStatus.length)
			return Status.FUNCTIONAL;
		else if(counterlower80>1)
			return Status.OUT_OF_SERVICE;
		else
			return Status.NEED_CHECK;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	public int[] getMotorsStatus() {
		return motorsStatus;
	}
	public void setMotorsStatus(int[] motorStatus) {
		this.motorsStatus=motorStatus;
	}
	@Override
	public String toString() {
		return String.format("%s and has %d motors and capacity of %d.", super.toString(), motorsStatus.length ,getCapacity());
	}
	

}
