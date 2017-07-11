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
			case 2: game.pacMan.direction = game.pacMan.right;
			break;
			case 3: 
                switch (game.pacMan.direction)
                {
                    case '>':
                        if (game.pacMan.posX > 0)
                        {
                            game.pacMan.posX--;
                        }
                        break;
                    case '<':
                        if (game.pacMan.posX < (column - 1))
                        {
                            game.pacMan.posX++;
                        }
                        break;
                    case 'v':
                        if (game.pacMan.posY > 0)
                        {
                            game.pacMan.posY--;
                        }
                        break;
                    case '^':
                        if (game.pacMan.posY < row)
                        {
                            game.pacMan.posY++;
                        }
                        break;
                }
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
        private int curX = 0;
        private int curY = 0;

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
            // Replace where PacMan was with a .
            board[curX][curY] = '.'; 

            // Set PacMan on the board facing the direction
        	board[posX][posY] = direction;
            
            // Remember where PacMan is
            curX = posX;
            curY = posY;
        	
        	for(int y = 0; y<board.length; y++)
        	{
        		for(int x = 0; x<board.length; x++)
        		{
        			System.out.print(board[x][y] + " ");
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
        		this.up = 'v';
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
	
