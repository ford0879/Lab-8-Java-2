	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Set;

	import org.junit.Assert;
	import org.junit.Test;
	
public class GameTest 
{

		/**
		 * Tests the toString method of Shape
		 */
		@Test
		public void ShapeTest()
		{
			Assert.assertEquals("Shape toString Incorrect", "thimble", Shape.THIMBLE.toString());
			Assert.assertEquals("Shape toString Incorrect", "boot", Shape.BOOT.toString());
			Assert.assertEquals("Shape toString Incorrect", "racecar", Shape.RACECAR.toString());
		}
		
		/**
		 * Tests color values are properly stored
		 */
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

		/**
		 * Tests that color and shape are properly assigned to game piece
		 */
		@Test 
		public void GamePieceAppearanceTest()
		{
			GamePieceAppearance app = new GamePieceAppearance(Color.BLUE, Shape.BOOT);
			
			Assert.assertEquals("Incorrect color", Color.BLUE , app.getColor());
			Assert.assertEquals("Incorrect shape",Shape.BOOT , app.getShape());
		}
		
		/**
		 * Tests that game pieces are properly created
		 */
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
		
		/**
		 * Tests that lowest priority piece moves first
		 */
		@Test
		public void GamePieceMovesFirstTest()
		{
			GamePiece a = GamePiece.BLUE_BOOT;
			GamePiece b = GamePiece.GREEN_BOOT;
			
			Assert.assertEquals("Wrong piece moving first",a ,GamePiece.movesFirst(a, b));
			
			GamePiece c = GamePiece.BLUE_RACER;
			Assert.assertEquals("Wrong piece moving first", c, GamePiece.movesFirst(a, c));
		}
		
		/**
		 * Tests that toString is properly formatted
		 */
		@Test
		public void GamePieceToStringTest()
		{
			GamePiece a = GamePiece.BLUE_BOOT;
			Assert.assertEquals("Incorrect toString", "BLUE_BOOT: a BLUE boot with priority 5" ,a.toString());
		}
		
		/**
		 * Tests that locations are properly enumerated
		 */
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
		
		/**
		 * Tests that players are properly added and the same pieces are not used
		 */
		@Test
		public void BoardGameAddPlayerTest()
		{
			BoardGame bg = new BoardGame();
			
			Assert.assertEquals("Players failed to add", true, 
					bg.addPlayer("Bob", GamePiece.BLUE_BOOT, Location.BALLROOM));
			
			bg.addPlayer("Steve", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
			Assert.assertEquals("Players added when not supposed to", false, bg.addPlayer("Steve", 
					GamePiece.MAGENTA_RACER, Location.CONSERVATORY));
			
		}
		
		/**
		 * Tests that players and game pieces are properly associated
		 */
		@Test
		public void BoardGameGetPlayerGamePieceTest()
		{
			BoardGame bg = new BoardGame();
			bg.addPlayer("Bob", GamePiece.BLUE_BOOT, Location.BALLROOM);
			
			GamePiece actual = bg.getPlayerGamePiece("Bob");
			Assert.assertEquals("Incorrect Game Piece",GamePiece.BLUE_BOOT , actual);
			
			String actual2 = bg.getPlayerWithGamePiece(GamePiece.BLUE_BOOT);
			Assert.assertEquals("Incorrect Player","Bob" , actual2);
		}
		
		/**
		 * Tests that the proper player moves first and movement is correct
		 */
		@Test
		public void BoardGameMovePlayerTest()
		{
			BoardGame bg = new BoardGame();
			bg.addPlayer("Bob", GamePiece.BLUE_BOOT, Location.BALLROOM);
			bg.addPlayer("Steve", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
			
			bg.movePlayer("Bob", Location.HALL);
			Assert.assertEquals("Incorrect movement",Location.HALL ,bg.playerLocations.get("Bob"));
			
			String[] playerNames = {"Steve", "Bob"};
			Location[] newLocation = {Location.KITCHEN, Location.STUDY};
			
			String[] actual = bg.moveTwoPlayers(playerNames, newLocation);
			String[] expected = {"Steve", "Bob"};
			Assert.assertEquals("Incorrect moving order",expected ,actual);
			
			String[] playerNamesTwo = {"Bob", "Steve"};
			String[] actualTwo = bg.moveTwoPlayers(playerNamesTwo, newLocation);
			Assert.assertEquals("Incorrect moving order",expected ,actualTwo);
		}
		
		/**
		 * Checks players are in proper positions
		 */
		@Test
		public void BoardGameGetPlayerLocationsTest()
		{
			BoardGame bg = new BoardGame();
			bg.addPlayer("Bob", GamePiece.BLUE_BOOT, Location.BALLROOM);
			bg.addPlayer("Steve", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
			
			Assert.assertEquals("Incorrect location",Location.BALLROOM, bg.getPlayersLocation("Bob"));
			
			ArrayList<String> expected = new ArrayList<String>();
			expected.add("Bob");
			Assert.assertEquals("Incorrect player",expected, bg.getPlayersAtLocation(Location.BALLROOM));
		}
		
		/**
		 * Checks that game pieces are in proper positions
		 */
		@Test
		public void BoardGameGetGamePieceLocationTest()
		{
			BoardGame bg = new BoardGame();
			bg.addPlayer("Bob", GamePiece.BLUE_BOOT, Location.BALLROOM);
			bg.addPlayer("Steve", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
			
			ArrayList<GamePiece> expected = new ArrayList<GamePiece>();
			expected.add(GamePiece.BLUE_BOOT);
			Assert.assertEquals("Incorrect location",expected, bg.getGamePiecesAtLocation(Location.BALLROOM));
		}
		
		/**
		 * Tests that getPlayer, getPlayerLocation, and getPlayerpieces are correct
		 */
		@Test
		public void BoardGamePlayerInfoTest()
		{
			BoardGame bg = new BoardGame();
			bg.addPlayer("Bob", GamePiece.BLUE_BOOT, Location.BALLROOM);
			bg.addPlayer("Steve", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
			
			//GetPlayers
			String[] expected = new String[] {"Bob", "Steve"};
			Set<String> actual = bg.getPlayers();
			
			Assert.assertEquals(expected, actual);
			
			//GetPlayerLocations
			
			
			//GetPlayerPieces
		}
	}
