import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Class to represent a board game. The board game consists of several players (each represented 
 * only by their name) moving game pieces to different locations on the board. 
 * Each player has a unique, associated game piece (i.e. each player has only one game piece, 
 * and a game piece can be assigned to, at most, 1 player). Turns are taken one-at-a-time in this board game.
 *  In the case that two players which to move at the same time,
 *  the contest is resolved by the priority given to the game pieces associated to the two players.
 *
 */
public class BoardGame
{
	/**
	 * Each player places their game piece at a location on the board, as defined by the Location enum.
	 */
	protected LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<String, GamePiece>();
	
	/**
	 * Each player is associated with a unique game piece 
	 */
	protected LinkedHashMap<String, Location> playerLocations = new LinkedHashMap<String, Location>();
	
	/**
	 * Empty constructor
	 */
	public BoardGame()
	{
		
	}
	
	/**
	 * Adds a player to the board game object.
	 * @param playerName, name of the player
	 * @param gamePiece, game piece being used
	 * @param initialLocation, location game piece starts at
	 * @return
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{	
		if((! playerPieces.containsKey(playerName)) && (! playerPieces.containsValue(gamePiece)))
		{
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			
			return true;
		}
	
		else
		{
			return false;
		}
		
	}
	
	/**
	 * Given a player's name, find the game piece associated with that player.
	 * @param playerName, name of the player
	 * @return
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	/**
	 * Given a game piece, find the player associated with that game piece.
	 * @param gamePiece, game piece being used
	 * @return
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		String gp = new String();
		
		for(String playerName : playerPieces.keySet())
		{
			if(playerPieces.get(playerName) == gamePiece)
			{
				gp = playerName;
			}
		}
		
		return gp;
	}
	
	/**
	 * Moves a player to a new location in the board game.
	 * @param playerName, name of the player
	 * @param newLocation, location game pieces are moved to
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
			playerLocations.replace(playerName, newLocation);	
	}
	
	/**
	 * Method to use when two players each want to move at the same time.
	 * @param playerNames, names of the players
	 * @param newLocation, location game pieces are moved to
	 * @return
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocation)
	{
		
		GamePiece playerOne = playerPieces.get(playerNames[0]);
		GamePiece playerTwo = playerPieces.get(playerNames[1]);
		
		GamePiece movesFirst = playerOne.movesFirst(playerOne, playerTwo);
		String first;
		String second;
		
		if(movesFirst == playerOne)
		{
			first = playerNames[0];
			second = playerNames[1];
			String[] moveOrder = new String[]{first, second};
			movePlayer(playerNames[0], newLocation[0]);
			movePlayer(playerNames[1], newLocation[1]);
			return moveOrder;
		}
		else
		{
			first = playerNames[1];
			second = playerNames[0];
			String[] moveOrder = new String[]{first, second};
			movePlayer(playerNames[1], newLocation[1]);
			movePlayer(playerNames[0], newLocation[0]);
			return moveOrder;
		}
		
	}
	
	/**
	 * Gets the location of a player.
	 * @param player, current player
	 * @return
	 */
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	/**
	 * Given a location, find all players at that location.
	 * @param loc, location of game piece
	 * @return
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> piecesAtLoc = new ArrayList<String>();
		
		for(String playerName : playerLocations.keySet())
		{
			if(playerLocations.get(playerName) == loc)
			{
				piecesAtLoc.add(playerName);
			}
		}
		
		return piecesAtLoc;
	}
	
	/**
	 * Given a location, find the game pieces associated with all the players at that location.
	 * @param loc, location of game piece
	 * @return
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> piecesAtLoc = new ArrayList<GamePiece>();
		
		for(String playerName : playerLocations.keySet())
		{
			if(playerLocations.get(playerName) == loc)
			{
				piecesAtLoc.add(playerPieces.get(playerName));
			}
		}
		
		return piecesAtLoc;
	}
	
	/**
	 * Gets all players recorded in the game.
	 * @return
	 */
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	
	/**
	 * Gets all locations that the players are at (not all possible locations).
	 * @return
	 */
	public Set<Location> getPlayerLocations()
	{
		return (Set<Location>) playerLocations.values();
	}
	
	/**
	 * Gets all game pieces associated with the players (not all possible game pieces).
	 * @return
	 */
	public Set<GamePiece> getPlayerPieces()
	{
		return (Set<GamePiece>) playerPieces.values();
	}
}
