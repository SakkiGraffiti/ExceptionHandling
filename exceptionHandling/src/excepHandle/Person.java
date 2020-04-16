package excepHandle;

import java.util.InputMismatchException;

public class Person {
	
	private int birthYear;
	private char gender;
	private double height;
	
	public Person(int b, char g, double h){
		this.birthYear=b;
		this.gender=g;
		this.height=h;
	}
	
	public boolean isDrinkingAge() throws Exception {
		if(this.birthYear > 2019)
			throw new Exception ("Birth Year cannot be greater than 2019");
		return(birthYear < 2001);
	}
	
	public boolean isTallForRides() throws Exception {
		if(this.height == 0 || this.height>this.height || this.height>10.0F)
			throw new Exception("Invalid Height");
		return (height > 4.5);
	}
	
	public boolean isWoman() throws Exception {
		if(this.gender != 'F' || this.gender != 'M')
			throw new Exception ("Invalid gender");
		return(birthYear <= 1998 && gender == 'F');
	}
}
