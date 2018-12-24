package java8;


import java.util.Optional;
import java.util.Scanner;

public class OptionalTest {

	public static void main(String args[]) {

		//Dynamic String 
		Optional<String> str = Optional.ofNullable(null);

		System.out.println(" Str  "+ str   + "     "+ str.isPresent() + "   "+ str.empty().toString());
		
	}

}
