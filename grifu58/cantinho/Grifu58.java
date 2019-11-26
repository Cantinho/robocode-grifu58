package cantinho;
import java.awt.Color;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/AdvancedRobot.html

/**
 * Grifu58 - a robot by (your name here)
 */
public class Grifu58 extends AdvancedRobot
{
	private static final double BOT_SIZE = 36;
	private static final double SAFE_AREA = BOT_SIZE + 10;
	private Battlefield battlefield;
	private Vehicle me;
	private EnemyVehicle enemyVehicle;

	/**
	 * run: Grifu58's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		init();

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			

			//setAhead(100);
			//setTurnGunRight(360);
			//execute();
			//setBack(100);
			//setTurnGunRight(360);
			//execute();
		}
	}
	
	private void init() {
		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setBodyColor(new Color(255, 255, 255));
		setGunColor(new Color(153, 0, 51));
		setBulletColor(new Color(153, 0, 51));
		setRadarColor(new Color(204, 204, 153));
		setScanColor(new Color(0, 0, 0));
		
		// Set battlefield dimensions
		battlefield = new Battlefield((int) SAFE_AREA, (int) SAFE_AREA, (int) (getBattleFieldWidth() - 2 * SAFE_AREA), (int) (getBattleFieldHeight() - 2 * SAFE_AREA));
		me = new Vehicle("Grifu58", getX(), getY(), getEnergy(), getHeading(), 0);
		enemyVehicle = null;
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		
		setFire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		setBack(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		setBack(20);
	}	
}
