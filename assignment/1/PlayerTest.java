import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	private String name = "name";
	private String no = "1";
	private Position pos = Position.C;
	private String bdate = "bdate";
	private String home = "home";
	private String wt = "wt";
	private String ht = "ht";
	private int goals = 10;
	private int assists = 15;
	private int ppgoals = 5;
	private int ppassists = 10;
	private int shots = 30;

	@Test
	public void rosterConstructor() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht);
		assertEquals(name, p.getName());
		assertEquals(no, p.getNumber());
		assertEquals(pos, p.getPosition());
		assertEquals(bdate, p.getDateOfBirth());
		assertEquals(home, p.getHomeTown());
		assertEquals(wt, p.getWeight());
		assertEquals(ht, p.getHeight());
		assertEquals(0, p.getGoals());
		assertEquals(0, p.getAssists());
		assertEquals(0, p.getPowerPlayGoals());
		assertEquals(0, p.getPowerPlayAssists());
		assertEquals(0, p.getShots());
		assertEquals(0, p.getPoints());
		assertEquals(0, p.getPowerPlayPoints());
		assertEquals(0.0, p.getShootingPercentage(), 0.0000001);
	}

	@Test
	public void statsConstructor() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		assertEquals(name, p.getName());
		assertEquals(no, p.getNumber());
		assertEquals(pos, p.getPosition());
		assertEquals(bdate, p.getDateOfBirth());
		assertEquals(home, p.getHomeTown());
		assertEquals(wt, p.getWeight());
		assertEquals(ht, p.getHeight());
		assertEquals(goals, p.getGoals());
		assertEquals(assists, p.getAssists());
		assertEquals(ppgoals, p.getPowerPlayGoals());
		assertEquals(ppassists, p.getPowerPlayAssists());
		assertEquals(shots, p.getShots());
		assertEquals(goals + assists, p.getPoints());
		assertEquals(ppgoals + ppassists, p.getPowerPlayPoints());
		assertEquals(goals / (double) shots * 100.0, p.getShootingPercentage(), 0.0000001);
	}

	@Test
	public void copyConstructor() {
		Player other = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		Player p = new Player(other);
		assertEquals(name, p.getName());
		assertEquals(no, p.getNumber());
		assertEquals(pos, p.getPosition());
		assertEquals(bdate, p.getDateOfBirth());
		assertEquals(home, p.getHomeTown());
		assertEquals(wt, p.getWeight());
		assertEquals(ht, p.getHeight());
		assertEquals(goals, p.getGoals());
		assertEquals(assists, p.getAssists());
		assertEquals(ppgoals, p.getPowerPlayGoals());
		assertEquals(ppassists, p.getPowerPlayAssists());
		assertEquals(shots, p.getShots());
		assertEquals(goals + assists, p.getPoints());
		assertEquals(ppgoals + ppassists, p.getPowerPlayPoints());
		assertEquals(goals / (double) shots * 100.0, p.getShootingPercentage(), 0.0000001);
	}

	@Test
	public void addAssist() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		p.recordAssist();
		assertEquals(assists + 1, p.getAssists());
		assertEquals(goals + assists + 1, p.getPoints());
		// Could verify these are unchanged\\
//		assertEquals(goals, p.getGoals());
//		assertEquals(ppgoals, p.getPowerPlayGoals());
//		assertEquals(ppassists, p.getPowerPlayAssists());
//		assertEquals(shots, p.getShots());
//		assertEquals(ppgoals + ppassists, p.getPowerPlayPoints());
//		assertEquals(goals / (double) shots * 100.0, p.getShootingPercentage(), 0.0000001);
	}

	@Test
	public void addGoal() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		p.recordGoal();
		assertEquals(goals + 1, p.getGoals());
		assertEquals(shots + 1, p.getShots());
		assertEquals(goals + 1 + assists, p.getPoints());
		// Could verify these are unchanged
//		assertEquals(assists, p.getAssists());
//		assertEquals(ppgoals, p.getPowerPlayGoals());
//		assertEquals(ppassists, p.getPowerPlayAssists());
//		assertEquals(ppgoals + ppassists, p.getPowerPlayPoints());
//		assertEquals((goals + 1) / (double) (shots + 1) * 100.0, p.getShootingPercentage(), 0.0000001);
	}

	@Test
	public void addPPAssist() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		p.recordPowerPlayAssist();
		assertEquals(assists + 1, p.getAssists());
		assertEquals(ppassists + 1, p.getPowerPlayAssists());
		assertEquals(goals + assists + 1, p.getPoints());
		assertEquals(ppgoals + ppassists + 1, p.getPowerPlayPoints());
		// Could verify these are unchanged
//		assertEquals(goals, p.getGoals());
//		assertEquals(ppgoals, p.getPowerPlayGoals());
//		assertEquals(shots, p.getShots());
//		assertEquals(goals / (double) shots * 100.0, p.getShootingPercentage(), 0.0000001);
	}

	@Test
	public void addPPGoal() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		p.recordPowerPlayGoal();
		assertEquals(goals + 1, p.getGoals());
		assertEquals(ppgoals + 1, p.getPowerPlayGoals());
		assertEquals(shots + 1, p.getShots());
		assertEquals(goals + assists + 1, p.getPoints());
		assertEquals(ppgoals + ppassists + 1, p.getPowerPlayPoints());
		// Could verify these are unchanged
//		assertEquals(assists, p.getAssists());
//		assertEquals(ppassists, p.getPowerPlayAssists());
//		assertEquals((goals + 1) / (double) (shots + 1) * 100.0, p.getShootingPercentage(), 0.0000001);
	}

	@Test
	public void recordShotShootingPercentageChange() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		assertEquals(goals / (double) shots * 100.0, p.getShootingPercentage(), 0.0000001);
		p.recordShot();
		assertEquals(goals / (double) (shots + 1) * 100.0, p.getShootingPercentage(), 0.0000001);
		// Could verify these as well
//		assertEquals(goals, p.getGoals());
//		assertEquals(assists, p.getAssists());
//		assertEquals(ppgoals, p.getPowerPlayGoals());
//		assertEquals(ppassists, p.getPowerPlayAssists());
//		assertEquals(shots + 1, p.getShots());
//		assertEquals(goals + assists, p.getPoints());
//		assertEquals(ppgoals + ppassists, p.getPowerPlayPoints());
	}

	@Test
	public void recordGoalShootingPercentageChange() {
		Player p = new Player(name, pos, no, bdate, home, wt, ht, goals, assists, ppgoals, ppassists, shots);
		assertEquals(goals / (double) shots * 100.0, p.getShootingPercentage(), 0.0000001);
		p.recordGoal();
		assertEquals((goals + 1) / (double) (shots + 1) * 100.0, p.getShootingPercentage(), 0.0000001);
		// Could verify these as well
//		assertEquals(goals + 1, p.getGoals());
//		assertEquals(assists, p.getAssists());
//		assertEquals(ppgoals, p.getPowerPlayGoals());
//		assertEquals(ppassists, p.getPowerPlayAssists());
//		assertEquals(shots + 1, p.getShots());
//		assertEquals(goals + assists + 1, p.getPoints());
//		assertEquals(ppgoals + ppassists, p.getPowerPlayPoints());
	}

}