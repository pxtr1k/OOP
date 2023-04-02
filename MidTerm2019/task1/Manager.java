
public class Manager extends Person {
	private Band managingBand;
	
	public Manager(String name, String country, int age, Band managingBand) {
		super(name, country, age);
		this.managingBand=managingBand;
	}
	
	public Band getManagingBand() {
		return managingBand;
	}
	
	public void kickBandMember(Musician musician) {
		Musician[] bandMembers=managingBand.getBandMembers();
		Musician[] newBand=new Musician[bandMembers.length-1];
		for(int i=0, j=0 ;i<bandMembers.length;i++) {
			if(musician.equals(bandMembers[i]))
				continue;
			else
				newBand[j++]=bandMembers[i];
			
		}
		managingBand.setBandMembers(newBand);
	   	
	}
}
