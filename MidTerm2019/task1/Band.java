
public class Band {
	private Musician[] bandMembers;
	private String bandName;
	
	public Musician[] getBandMembers() {
		return bandMembers;
	}
	public String getBandName() {
		return bandName;
	}
	public Band(Musician[] bandMembers, String bandName) {
		this.bandMembers=bandMembers;
		this.bandName=bandName;
	}
	public void setBandMembers(Musician[] bandMembers) {
		this.bandMembers = bandMembers;

	}
	@Override
	public String toString() {
		String info="Members of the band " +this.getBandName()+" are: ";
		for(int i=0;i<bandMembers.length;i++) {
			if(i!=bandMembers.length-1)
				info+=" "+ bandMembers[i].getName()+",";
			else
				info+=" "+ bandMembers[i].getName();
		}
		return info;
	}
}
