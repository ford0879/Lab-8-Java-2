
/**
 * Specifies a set of shapes that they game pieces can take. 
 */
public enum Shape 
{
	THIMBLE, BOOT, RACECAR;
	
	/**
	 * Gives the name of the value of the enum object, in lowercase.
	 */
	@Override
	public String toString()
	{
		return this.name().toLowerCase();
	}
}