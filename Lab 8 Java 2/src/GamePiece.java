
/**
 * Specifies  the  game  pieces  available  for  players  to  choose  to  play  the  board  game.
 * Each game piece has a GamePieceAppearance to specify its Color and Shape.  Each
 * game piece also has a priority.  Only one piece may be moved in the board game at
 * a time.  Thus, if two players wish to make a move at the same time, the game has
 * to resolve who goes first.  The player who has the game piece with the lower value
 * priority goes first (e.g.  2 vs.  4 -¿ priority 2 goes first).  Each player must use a game
 * piece  to  play  the  board  game,  and  no  two  players  can  have  the  same  game  piece
 * (they cannot share it).
 *
 */
public enum GamePiece 
{
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0), 
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 4),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10), 
	
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5), 
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	
	/**
	 * Color of current game piece
	 * @return color of game piece
	 */
	public Color getColor()
	{
		return appearance.getColor();
	}
	
	/**
	 * Shape of current game piece
	 * @return shape of game piece
	 */
	public Shape getShape()
	{
		return appearance.getShape();
	}
	
	/**
	 * The game piece with the lowest priority value. 
	 * That is, the game piece that would take its turn first.
	 * @return game piece that needs to move first
	 */
	public GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if(a.priority < b.priority)
		{
			return a;
		}
		
		else
		{
			return b;
		}
	}
	
	/**
	 * A string of the format "%s: a %s %s with priority %d", with replacements in order: 
	 * (1) The name of the enum constant (e.g. BLUE_RACER) (2) The name of the game piece's color
	 * (3) The name of the game piece's shape (4) The priority value of the game piece
	 */
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", name(), getColor(), getShape(), priority);
	}
}
