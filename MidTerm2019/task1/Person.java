
public class Person {
	
private final String name;
private final String country;
private int age;


public Person(String name, String country, int age) {
	this.name=name;
	this.country=country;
	this.age=age;
}
public String getName() {
	return name;
}
public String getCountry() {
	return country;
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}

}
