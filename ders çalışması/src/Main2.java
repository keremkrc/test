
public class Main2 {

	public static void main(String[] args) {
		
		Car2 car=new Car2("Renault","Clio",2017);
		//Car2 car2=new Car2("ggrsfhrs",	"fsfchampions",	1204); 
		Car2 car2=new Car2(car); 

		System.out.println(car.getMake());
		//.setMake("Mercedes");
		//car.setYear(25611);
		System.out.println(car2.getMake());
		//car2.copy(car);

		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		System.out.println(car2.getYear());
		
		
	
		
	
	}

}
