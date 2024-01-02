public class Main {
	
	public static void main(String[]args){
		
		Vehicle car1 = new Car("BMW");
		Car car2 = new Car("MERCEDES");
		Vehicle vec = new Vehicle("motorbike"); 
		Bicycle bike = new Bicycle("salcano");
		
		System.out.println("speed is " + car1.speed);		
		
		System.out.println("pedals are " + bike.pedals);
		//car2.name="bmw";
		//bike.name="salcano";
		vec.move();
		car2.move();
		bike.move();
		bike.stop();
		
		
		
		/*Garage garage =new Garage();
		Car car =new Car("BMW");
		garage.park(car);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		/*
		
		Food food1= new Food("pizza");
		Food food2= new Food("lasagna");
		Food food3= new Food("kuru fasulye");
		
		Food[]refrigerator= {food1,food2,food3};

		/*
		refrigerator[0]=food1;
		refrigerator[1]=food2;
		refrigerator[2]=food3;
		*//*
		System.out.println(refrigerator[1].name);
		for(int i=0;i<3;i++) {
			System.out.println("I want to eat " + refrigerator[i].name);
			}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Car myCar = new Car();
		System.out.println(myCar.toString());
		System.out.println(myCar);
		*/
		/*System.out.println(myCar.color);
		System.out.println(myCar.make);
		myCar.drive();
		myCar.brake();
		 */

			/*
		Human humain= new Human("Rick Sanchez", 8, 17.6);
		Human humein= new Human("Morty Smith",41,67.9); 
		System.out.println(humain.wname);
		System.out.println(humain.weight);
		System.out.println(humein.wname);
		humain.eat();
		humein.drink();
		 */
			
		/*
		DiceRoller diceRoller =new DiceRoller();
		*/	
		/*
		Pizza pizza = new Pizza();
		System.out.println("Pizzanın malzemeleri sunlar:");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		*/

		

	}
}
 