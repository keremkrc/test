
public class Human {
	String wname;
	int age;
	double weight;
	

	Human(String name, int age, double weight){
		wname=name;
		this.age=age;
		this.weight=weight;
			}
	void eat() {
		System.out.println(this.age + " is eating");
	}
	void drink() {
		System.out.println(this.age + " is drinking");
	}
}
