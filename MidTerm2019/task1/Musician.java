
public class Musician extends Person {
	private Integer skill;
	private BandPosition bandPosition;
	
	public Musician(String name, String country, int age, BandPosition bandposition, Integer skill) {
		super(name, country, age);
		this.bandPosition=bandPosition;
		this.skill=skill;
	}
	public Integer getSkill() {
		return skill;
	}
	public void setSkill(Integer skill) {
		this.skill=skill;
	}
	public BandPosition getBandPosition() {
		return bandPosition;
	}
	public void trainForOneYear() {
	 this.setAge(this.getAge()+1);
	 this.setSkill(skill+1);
	}
	

}
