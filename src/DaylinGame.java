
import java.util.Scanner;

public class DaylinGame{

	public static void main(String[] args) {
		String response; 
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("WELCOME TO DAYLIN'S TINY ADVENTURE!");
		System.out.println("You have a choice of a vacation or a $100,000!  Would you like the \"vacation\" or the \"money\"?");
		response = keyboard.next(); 
		
		if(response.equals("money")){
			System.out.println(" Would you rather \"deposit\" the money into your savings or make a \"purchase?\"");
			response = keyboard.next(); 
			
			if(response.equals("deposit")){
				System.out.println("You suddenly die of a anerism"); 
			}else if (response.equals("purchase")){
				System.out.println("The money was stolen and the cops have been following you. You are arrested at the scene");
			}
		}else if(response.equals("vacation")){
			System.out.println("You reach your travel destination where you meet a man who offers you a billion dollars! You can take it or leave it by saying yes or no");
			response = keyboard.next(); 
			if (response.equals("yes")){
				System.out.println("The man pulls out a knife and stabs you to death"); 
			
			}else if(response.equals("no")){
				System.out.println("The man says suit yourself. Enjoy your life!");
			
			}
			
		}
		
		

	}	
	
}
