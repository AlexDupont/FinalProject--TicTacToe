import java.util.ArrayList;
import java.util.Scanner;
public class UserInputTicTacToe 
{
	public static void main(String[] args) 
	{
		ArrayGrid.AGrid();
		askUserToPlay();
		printTac();
	}
	public static void askUserToPlay()
	{
		Scanner userInput=new Scanner (System.in);
		System.out.println("Press Enter To Start Game: ");
		userInput.nextLine();
	}
	public static void printTac()
	{
		Scanner userInput=new Scanner (System.in);
		System.out.println("You will be: " +"X"+" and the Computer will be: " +"O");
		System.out.println("Type where you will move: (Ex. a1)");
		if(userInput.nextLine().equals("a1"))
		{
			int a=0;
			matrix[0][0]=a;
			System.out.println(a+"X");
			System.out.println(ArrayGrid.AGrid);
		}
		else if(userInput.nextLine().equals("a2"))
		{
			int a=0;
			matrix[0][1]=a;
			System.out.println(a+"X");
		}
		else if(userInput.nextLine().equals("a3"))
		{
			int a=0;
			matrix[0][2]=a;
			System.out.println(a+"X");
		}
		else if(userInput.nextLine().equals("b1"))
		{
			int a=0;
			matrix[1][0]=a;
			System.out.println(a+"X");
		}
		else if(userInput.nextLine().equals("b2"))
		{
			int a=0;
			matrix[1][1]=a;
			System.out.println(a+"X");
		}
		else if(userInput.nextLine().equals("b3"))
		{
			int a=0;
			matrix[1][2]=a;
			System.out.println(a+"X");
		}
		else if(userInput.nextLine().equals("c1"))
		{
			int a=0;
			matrix[2][0]=a;
			System.out.println(a+"X");
		}
		else if(userInput.nextLine().equals("c2"))
		{
			int a=0;
			matrix[2][1]=a;
			System.out.println(a+"X");
		}
		else if(userInput.nextLine().equals("c3"))
		{
			int a=0;
			matrix[2][2]=a;
			System.out.println(a+"X");
		}
	}
}
