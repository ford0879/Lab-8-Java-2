
/**
 * A  simple  class  that  acts  as  a  composite  data  structure  of  a  Color  and  Shape. 
 * In effect, holds information on the appearance of a game piece.
 *
 */
public class GamePieceAppearance 
{
	/**
	 * Holds the color of the Game Piece
	 */
	private Color color;
	
	/**
	 * Holds the Shape of the Game Piece
	 */
	private Shape shape;
	
	/**
	 * Constructor that assigns color and shape of specific Game Piece
	 * @param color
	 * @param shape
	 */
	public GamePieceAppearance(Color color, Shape shape)
	{
		this.color = color;
		this.shape = shape;
	}

	/**
	 * Returns the color of the Game Piece
	 * @return color
	 */
	public Color getColor() 
	{
		return color;
	}

	/**
	 * Returns the shape of the Game Piece
	 * @return shape
	 */
	public Shape getShape() 
	{
		return shape;
	}
	
}
