package LJIRzad2;

import java.util.Comparator;

public class PlayerComparator implements Comparator<FootballPlayer> {

	@Override
	public int compare(FootballPlayer o1, FootballPlayer o2) {
		int r = Integer.compare(o1.getOverallSkill(), o2.getOverallSkill());
		if(r!=0) {
			return r;
			}
		r=o1.getSurname().compareTo(o2.getSurname());
		if(r!=0) {
			return r;
		}
		
		return o1.getName().compareTo(o2.getName());
	}

}
