
/**
 * Specifies a set of colors.  Each color has an rgb value (representing the red, green, and blue 
 *  components of the color).  All game pieces have a color.
 *
 */
public class Color
{

	public enum Colors{RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA}
	
	/**
	 * Variables used to hold values of red, green, and blue
	 */
	private int r;
	private int g;
	private int b;
	
	/**
	 * Constructor used to hold red, green, and blue values
	 * @param r
	 * @param g
	 * @param b
	 */
	public Color(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public int getR()
	{
		return r;
	}
	public int getG()
	{
		return g;
	}
	public int getB()
	{
		return b;
	}
	
}
