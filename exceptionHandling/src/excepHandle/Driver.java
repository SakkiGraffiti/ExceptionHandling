package excepHandle;

import java.util.InputMismatchException;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Person Sakki =new Person (2000,'D', 160.00F);
		try {
			System.out.println("Drinking Age: " + Sakki.isDrinkingAge());
		}
		catch (Exception e){
			System.out.println("Birth Year cannot be greater than 2019");
			
		}
	
		try {
			System.out.println("Height:"+Sakki.isTallForRides());
		}
		catch (Exception err){
			System.out.println("Invalid Height");
		}
		
		try {
			System.out.println("Height:"+Sakki.isWoman());
		}
		catch (InputMismatchException error){
			System.out.println("Invalid Gender");
		}
		
		
	}

}
