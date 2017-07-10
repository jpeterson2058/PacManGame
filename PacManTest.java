import java.util.*;
public class PacManTest
{
	PacManMove pacMan;
	Board board;
	
	PacManTest(int row, int column)
	{
		pacMan = new PacManMove();
		board = new Board(row, column);		
	}
	
	public static void main(String[] args)
    {
        char O;
        char V;
        
        
        
        Scanner input = new Scanner(System.in);
		System.out.println("Input total rows:");
		int row = input.nextInt();
		System.out.println("Input total columns:");
		int column = input.nextInt();
		
		PacManTest game = new PacManTest(row, column);
		
		int command = 0;
		while(command !=4)
		{
			switch (command)
			{
			case 0: instructions();
			case 1: game.pacMan.direction = game.pacMan.left;
			break;
			case 2:game.pacMan.direction = game.pacMan.right;
			break;
			case 3:game.pacMan.direction = game.pacMan.down;
			break;
			}
			
			game.board.drawBoard(game.pacMan.posX, game.pacMan.posY,
					game.pacMan.direction);
			command = input.nextInt();
		}
    }
	
	public static void instructions()
	{
		System.out.println("Welcome to a bad version of PacMan!");
		System.out.println("Enter the number of the comman desired.");
		System.out.println("Display Commands   	<0>:");
		System.out.println("Turn Left         	<1>:");
		System.out.println("Turn right              <2>:");
		System.out.println("Move                    <3>:");
		System.out.println("Exit                    <4>:");
	}
	
	class Board
	{
		
        public char board[][];
        Board(int row, int column)
        		{
        			board = new char [row] [column];
        			for(int x = 0; x< board.length; x++)
        			{
        				for(int i = 0; i<board.length; i++)
        				{
        					double random = Math.random();
        					if(random >.01 && random <=.15)
                
        					{
        						board[x][i] = 'O';
        					}
                
        					else 
        					{
        						board[x][i] = '.';
        					}
        				}
        			}
        		}
                
        public void drawBoard(int posX, int posY, char direction)
        {
        	board[posX][posY] = direction;
        	
        	for(int y = 0; y<board.length; y++)
        	{
        		for(int x = 0; x<board.length; x++)
        		{
        			System.out.print(board[y][x] + " ");
        		}
        		System.out.println("");
        	}
        }
	}  
        
     class PacManMove 
        {
        	private char left;
        	private char up;
        	private char right;
        	private char down;
        	
        	private int posX;
        	private int posY;
        	private char direction;
        	
        		
        	PacManMove()
        	{
        		this.left = '>';
        		this.up = 'V';
        		this.right = '<';
        		this.down = '^';
        		
        		this.posX = 0;
        		this.posY = 0;
        		this.direction=this.right;
        		this.direction=this.left;
        		this.direction=this.down;
        		this.direction=this.up;
        	}
        }
    }
	