package com.StonePaperScissor;
import java.util.*;
import java.lang.Math;
public class Main {
	static void whoWins(String user) {
		Random random = new Random();
		int x = random.nextInt(3); 
		String arr[] = {"stone","paper","scissor"};
		String computer = arr[x];
		if(user.equals(computer)){
	        System.out.println("You entered "+ user+" and computer has "+ computer+" so match tie!");
	        System.out.println("==============================================================================");
	     }
	     else{
	         if(user.equals(computer)){
	        	 System.out.println("You entered " +user+ " and computer has "+computer+ " so computer wins!");
	             System.out.println("==============================================================================");
	         }
	         else if(user.equals(arr[0]) && computer.equals(arr[2])){
	        	 System.out.println("You entered " +user+" and computer has "+computer+" so you wins!"); 
	             System.out.println("==============================================================================");
	         }
	         else if(user.equals(arr[1]) && computer.equals(arr[0])){
	        	 System.out.println("You entered "+user+" and computer has "+computer+" so you wins!");
	             System.out.println("==============================================================================");
	         }
	         else if(user.equals(arr[1]) && computer.equals(arr[2])){
	        	 System.out.println("You entered " +user+ " and computer has "+computer+" so computer wins!");
	             System.out.println("==============================================================================");
	         }
	         else if(user.equals(arr[2]) && computer.equals(arr[0])){
	        	 System.out.println("You entered "+user+" and computer has "+ computer+" so computer wins!");
	             System.out.println("==============================================================================");
	         }
	         else{
	        	 System.out.println("You entered "+user+" and computer has "+computer+" so computer wins!!!");
	             System.out.println("==============================================================================");
	         }
	     }
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		         System.out.println("==================================Game Begins!================================");
		System.out.println("Enter ur choice(Stone/Paper/Scissor)");
		String User = sc.nextLine();
		whoWins(User);
		boolean again = true;
		while(again) {
			System.out.println("Do you want to play again?[if yes pls enter 1 else 0]");
			int x = sc.nextInt();
			sc.nextLine();
			if(x==1) {
				again=true;
				System.out.println("Enter ur choice(stone/paper/scissor)");
				User = sc.nextLine();
				whoWins(User);

			}
			else
				again=false;
		}
				System.out.println("...Thanks for Playing!...");
			     System.out.println("==============================================================================");
		}
		
	}
