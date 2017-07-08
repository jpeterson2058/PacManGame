import java.util.*;
public class PacManTest
{
	public static void main(String[] args)
    {
        char O;
        char V;
        
        
        
        Scanner input = new Scanner(System.in);
		System.out.println("Input total rows:");
		int row = input.nextInt();
		System.out.println("Input total columns:");
		int column = input.nextInt();
		System.out.println("Welcome to a bad version of PacMan!");
		System.out.println("Enter the number of the comman desired.");
		System.out.println("Display Commands   	<0>:");
		System.out.println("Turn Left         	<1>:");
		System.out.println("Turn right              <2>:");
		System.out.println("Move                    <3>:");
		System.out.println("Exit                    <4>:");
		
        char board[][] = new char[row][column];

        for(int x = 0; x < board.length; x++)
        {
            for(int i = 0; i < board.length; i++)
            {
                double random = Math.random();
                if(random >.01 && random <=.15)
                {
                    board[x][i] = 'O';
                }
                
                else {
                    board[x][i] = '.';
                }
               
                System.out.print(board[x][i] + " ");
            }
            System.out.println("");
        }
        
        class PacManMove 
        {
        	private char left;
        	private char up;
        	private char right;
        	private char down;
        	
        		
        	PacManMove()
        	{
        		this.left = '>';
        		this.up = 'V';
        		this.right = '<';
        		this.down = '^';
        	}
        }
    }
}
