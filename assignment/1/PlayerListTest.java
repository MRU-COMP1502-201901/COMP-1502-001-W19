import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PlayerListTest {

	private String name = "name";
	private Position pos = Position.C;
	private String bdate = "bdate";
	private String home = "home";
	private String wt = "wt";
	private String ht = "ht";
	private int goals1 = 1;
	private int assists1 = 2;
	private int shots1 = 3;
	private int goals2 = 4;
	private int assists2 = 5;
	private int shots2 = 6;
	private int goals3 = 7;
	private int assists3 = 8;
	private int shots3 = 9;
	private int ppgoals = 10;
	private int ppassists = 11;

	@Test
	public void addPlayer() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		Player p2 = new Player(name, pos, "2", bdate, home, wt, ht, goals2, assists2, ppgoals, ppassists, shots2);
		Player p3 = new Player(name, pos, "3", bdate, home, wt, ht, goals3, assists3, ppgoals, ppassists, shots3);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.addPlayer(p2);
		list.addPlayer(p3);
		assertEquals(p1, list.getPlayerByNumber("1"));
		assertEquals(p2, list.getPlayerByNumber("2"));
		assertEquals(p3, list.getPlayerByNumber("3"));
		assertEquals(null, list.getPlayerByNumber("4"));
	}

	@Test
	public void addGoal() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.recordGoal("1");
		assertEquals(shots1 + 1, p1.getShots());
		assertEquals(goals1 + 1, p1.getGoals());
		assertEquals(goals1 + 1 + assists1, p1.getPoints());
	}

	@Test
	public void addGoalOneAssist() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		Player p2 = new Player(name, pos, "2", bdate, home, wt, ht, goals2, assists2, ppgoals, ppassists, shots2);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.addPlayer(p2);
		list.recordGoal("1", "2");
		assertEquals(shots1 + 1, p1.getShots());
		assertEquals(goals1 + 1, p1.getGoals());
		assertEquals(goals1 + 1 + assists1, p1.getPoints());
		assertEquals(assists2 + 1, p2.getAssists());
		assertEquals(goals2 + assists2 + 1, p2.getPoints());
	}

	@Test
	public void addGoalTwoAssists() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		Player p2 = new Player(name, pos, "2", bdate, home, wt, ht, goals2, assists2, ppgoals, ppassists, shots2);
		Player p3 = new Player(name, pos, "3", bdate, home, wt, ht, goals3, assists3, ppgoals, ppassists, shots3);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.addPlayer(p2);
		list.addPlayer(p3);
		list.recordGoal("1", "2", "3");
		assertEquals(shots1 + 1, p1.getShots());
		assertEquals(goals1 + 1, p1.getGoals());
		assertEquals(goals1 + 1 + assists1, p1.getPoints());
		assertEquals(assists2 + 1, p2.getAssists());
		assertEquals(goals2 + assists2 + 1, p2.getPoints());
		assertEquals(assists3 + 1, p3.getAssists());
		assertEquals(goals3 + assists3 + 1, p3.getPoints());
	}

////ADDITIONAL TESTS for PlayerList
	@Test
	public void getPlayers() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		ArrayList<Player> temp = new ArrayList<>();
		temp.add(p1);
		assertEquals(temp, list.getPlayers());
	}

	@Test
	public void addShot() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.recordShot("1");
		assertEquals(shots1 + 1, p1.getShots());
	}

	@Test
	public void addPPGoal() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.recordPowerPlayGoal("1");
		assertEquals(shots1 + 1, p1.getShots());
		assertEquals(goals1 + 1, p1.getGoals());
		assertEquals(goals1 + 1 + assists1, p1.getPoints());
		assertEquals(ppgoals + 1, p1.getPowerPlayGoals());
		assertEquals(ppgoals + 1 + ppassists, p1.getPowerPlayPoints());
	}

	@Test
	public void addPPGoalOneAssist() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		Player p2 = new Player(name, pos, "2", bdate, home, wt, ht, goals2, assists2, ppgoals, ppassists, shots2);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.addPlayer(p2);
		list.recordPowerPlayGoal("1", "2");
		assertEquals(shots1 + 1, p1.getShots());
		assertEquals(goals1 + 1, p1.getGoals());
		assertEquals(goals1 + 1 + assists1, p1.getPoints());
		assertEquals(ppgoals + 1, p1.getPowerPlayGoals());
		assertEquals(ppgoals + 1 + ppassists, p1.getPowerPlayPoints());
		assertEquals(assists2 + 1, p2.getAssists());
		assertEquals(goals2 + assists2 + 1, p2.getPoints());
		assertEquals(ppassists + 1, p2.getPowerPlayAssists());
		assertEquals(ppgoals + ppassists + 1, p2.getPowerPlayPoints());
	}

	@Test
	public void addPPGoalTwoAssists() {
		Player p1 = new Player(name, pos, "1", bdate, home, wt, ht, goals1, assists1, ppgoals, ppassists, shots1);
		Player p2 = new Player(name, pos, "2", bdate, home, wt, ht, goals2, assists2, ppgoals, ppassists, shots2);
		Player p3 = new Player(name, pos, "3", bdate, home, wt, ht, goals3, assists3, ppgoals, ppassists, shots3);
		PlayerList list = new PlayerList();
		list.addPlayer(p1);
		list.addPlayer(p2);
		list.addPlayer(p3);
		list.recordPowerPlayGoal("1", "2", "3");
		assertEquals(shots1 + 1, p1.getShots());
		assertEquals(goals1 + 1, p1.getGoals());
		assertEquals(goals1 + 1 + assists1, p1.getPoints());
		assertEquals(ppgoals + 1, p1.getPowerPlayGoals());
		assertEquals(ppgoals + 1 + ppassists, p1.getPowerPlayPoints());
		assertEquals(assists2 + 1, p2.getAssists());
		assertEquals(goals2 + assists2 + 1, p2.getPoints());
		assertEquals(ppassists + 1, p2.getPowerPlayAssists());
		assertEquals(ppgoals + ppassists + 1, p2.getPowerPlayPoints());
		assertEquals(assists3 + 1, p3.getAssists());
		assertEquals(goals3 + assists3 + 1, p3.getPoints());
		assertEquals(ppassists + 1, p3.getPowerPlayAssists());
		assertEquals(ppgoals + ppassists + 1, p3.getPowerPlayPoints());
	}
}