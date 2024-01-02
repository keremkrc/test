import java.util.*;
public class DiceRoller {
	Random random = new Random();
	int number=0;
	
	
	DiceRoller(){
		roll(random,number);
	}
void roll(Random a,int 	b ) {
	number = random.nextInt(6)+1;
	System.out.println(number);
	
	
}
}
