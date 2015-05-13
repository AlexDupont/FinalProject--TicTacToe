import java.util.ArrayList;
public class ArrayGrid 
{
	static String[][] matrix=new String[3][3];
	public static void main(String[] args) 
	{
		AGrid();
	}
	public static void AGrid()
	{
		makeSpaces();
		makeGrid();
	}
	public static void makeSpaces()
	{
		String s=" ";
		for(int row=0;row<3;row++)
			{
				for(int col=0;col<3;col++)
				{
					matrix[row][col]=s;
				}
			}
		}
	public static void makeGrid()
	{
		
		System.out.println(" -------------");
		System.out.println("a| " +matrix[0][0]+" | "+matrix[0][1]+" | "+matrix[0][2]+" |");
		System.out.println(" -------------");
		System.out.println("b| " +matrix[1][0]+" | "+matrix[1][1]+" | "+matrix[1][2]+" |");
		System.out.println(" -------------");
		System.out.println("c| " +matrix[2][0]+" | "+matrix[2][1]+" | "+matrix[2][2]+" |");
		System.out.println(" -------------");
	}
}
