
public class Group3Project {
	
	/*
	Program: Group3Project.java          Date: May 19th 2022
	Author: Georgia Mollet, ---, ----, ----
	School: CHHS
	Course: Computer Science 10
*/
	public static void main(String[] args) 
	{
<<<<<<< HEAD
		//
		Scanner input = new Scanner(System.in);
=======
		
>>>>>>> branch 'master' of https://github.com/Georgia14377/Group3
		
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


