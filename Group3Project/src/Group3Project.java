/*
	Program: Group3Project.java          Date: May 19th 2022
	Author: Georgia Mollet, Anjali Sanjay, ----, ----
	School: CHHS
	Course: Computer Science 10
*/
import java.util.Scanner;

public class Group3Project {
	
	
	public static void main(String[] args) 
	{

		//
		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter a number between 1 and 20: ");//user gets asked to input number
		int pnum = input.nextInt();//answer gets recorded
		
		int comnum = (int) (Math.random()*30);//random number
		
		if(comnum != pnum)//if players response is the same as the computers this gets displayed
		{
			System.out.println("Computer's Number is: "+ comnum);
			System.out.println("Player's Number is: "+ pnum);
			System.out.println("Good Job!!! You got it Right!");	
		}
		else//if both numbers aren't the same this gets displayed
		{
			System.out.println("Computer's Number is: "+ comnum);
			System.out.println("Player's Number is: "+ comnum);
			System.out.println("Better luck next time.");
		}
		
	}
}


