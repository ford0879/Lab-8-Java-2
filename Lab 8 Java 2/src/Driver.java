import org.junit.Assert;
import org.junit.Test;

public class Driver
{
	
	@Test
	public void ShapeTest()
	{
		Assert.assertEquals("Shape toString Incorrect", "thimble", Shape.THIMBLE.toString());
	}
	
	@Test
	public void ColorTest()
	{
		Color col = null;
		
		//RED
		col = Color.RED;
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getR());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getG());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getB());
		
		//Green
		col = Color.GREEN;
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getR());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getG());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getB());
		
		//Blue
		col = Color.BLUE;
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getR());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getG());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getB());
		
		//Yellow
		col = Color.YELLOW;
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getR());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getG());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getB());
		
		//Cyan
		col = Color.CYAN;
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getR());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getG());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getB());
		
		//Magenta
		col = Color.MAGENTA;
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getR());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 0 , col.getG());
		Assert.assertEquals("Incorrect rgb value" + col.name(), 255 , col.getB());
	}
	
	@Test 
	public void GamePieceAppearanceTest()
	{
		GamePieceAppearance app = new GamePieceAppearance(Color.BLUE, Shape.BOOT);
		
		Assert.assertEquals("Incorrect color", Color.BLUE , app.getColor());
		Assert.assertEquals("Incorrect shape",Shape.BOOT , app.getShape());
	}
	
	@Test
	public void GamePieceConstructorAndPiecesTest()
	{
		GamePiece gp = null;
		
		//RED_RACER
		gp = GamePiece.RED_RACER;
		Assert.assertEquals("Incorrect color", Color.RED , gp.getColor());
		Assert.assertEquals("Incorrect shape",Shape.RACECAR , gp.getShape());
		
		//RED_THIMBLE
		gp = GamePiece.RED_THIMBLE;
		Assert.assertEquals("Incorrect color", Color.RED , gp.getColor());
		Assert.assertEquals("Incorrect shape",Shape.THIMBLE , gp.getShape());
		
		//BLUE_RACER
		gp = GamePiece.BLUE_RACER;
		Assert.assertEquals("Incorrect color", Color.BLUE , gp.getColor());
		Assert.assertEquals("Incorrect shape",Shape.RACECAR , gp.getShape());
		
		//BLUE_BOOT
		gp = GamePiece.BLUE_BOOT;
		Assert.assertEquals("Incorrect color", Color.BLUE , gp.getColor());
		Assert.assertEquals("Incorrect shape",Shape.BOOT , gp.getShape());
		
		//MAGENTA_RACER
		gp = GamePiece.MAGENTA_RACER;
		Assert.assertEquals("Incorrect color", Color.MAGENTA , gp.getColor());
		Assert.assertEquals("Incorrect shape",Shape.RACECAR , gp.getShape());
		
		//GREEN_BOOT
		gp = GamePiece.GREEN_BOOT;
		Assert.assertEquals("Incorrect color", Color.GREEN , gp.getColor());
		Assert.assertEquals("Incorrect shape",Shape.BOOT , gp.getShape());
		
		//YELLOW_BOOT
		gp = GamePiece.YELLOW_BOOT;
		Assert.assertEquals("Incorrect color", Color.YELLOW , gp.getColor());
		Assert.assertEquals("Incorrect shape",Shape.BOOT , gp.getShape());
		
		
	}
	
	@Test
	public void GamePieceMovesFirstTest()
	{
		GamePiece a = GamePiece.BLUE_BOOT;
		GamePiece b = GamePiece.GREEN_BOOT;
		
		Assert.assertEquals("Wrong piece moving first",a ,a.movesFirst(a, b));
		
		GamePiece c = GamePiece.BLUE_RACER;
		Assert.assertEquals("Wrong piece moving first", c, a.movesFirst(a, c));
	}
	
	@Test
	public void GamePieceToStringTest()
	{
		GamePiece a = GamePiece.BLUE_BOOT;
		Assert.assertEquals("Incorrect toString", "BLUE_BOOT: a BLUE boot with priority 5" ,a.toString());
	}
	
	@Test
	public void LocationTest()
	{
		//Kitchen
		Assert.assertEquals("Incorrect color", Location.KITCHEN , Location.valueOf("KITCHEN"));
		
		//Conservatory
		Assert.assertEquals("Incorrect color", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		
		//Dining_Room
		Assert.assertEquals("Incorrect color", Location.DINING_ROOM , Location.valueOf("DINING_ROOM"));
		
		//Ballroom
		Assert.assertEquals("Incorrect color", Location.BALLROOM , Location.valueOf("BALLROOM"));
		
		//Study
		Assert.assertEquals("Incorrect color", Location.STUDY , Location.valueOf("STUDY"));
		
		//Hall
		Assert.assertEquals("Incorrect color", Location.HALL , Location.valueOf("HALL"));
		
		//Lounge
		Assert.assertEquals("Incorrect color", Location.LOUNGE , Location.valueOf("LOUNGE"));
		
		//Library
		Assert.assertEquals("Incorrect color", Location.LIBRARY , Location.valueOf("LIBRARY"));
		
		//Billiard_Room
		Assert.assertEquals("Incorrect color", Location.BILLIARD_ROOM , Location.valueOf("BILLIARD_ROOM"));
	}
	
	@Test
	public void BoardGameConstructorTest()
	{
		
	}
	
	@Test
	public void BoardGameAddPlayerTest()
	{
		
	}
	
	@Test
	public void BoardGameGetPlayerGamePieceTest()
	{
		
	}
	
	@Test
	public void BoardGameMovePlayerTest()
	{
		
	}
	
	@Test
	public void BoardGameGetPlayerLocationsTest()
	{
		
	}
	
	@Test
	public void BoardGameGetGamePieceLocationTest()
	{
		
	}
	
	@Test
	public void BoardGamePlayerInfoTest()
	{
		
	}
}
