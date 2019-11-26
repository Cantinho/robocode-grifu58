package cantinho;

/**
 * MyClass - a class by (your name here)
 */
public class Predictor {
	public static Position predictPosition(final long futureTimestamp, final Position current, final double heading, final double speed) {
		// basic trigonometry
		// Find hypotenuse = speed * time
		final double hypotenuse = speed * futureTimestamp;
		// convert angle to radians
		final double angleAsRadians = Math.toRadians(heading); 
		// apply sin to find x
		final double x = Math.sin(angleAsRadians) * hypotenuse;
		// apply cos to find y
		final double y = Math.cos(angleAsRadians) * hypotenuse;
		return new Position(
			current.getX() + x,
			current.getY() + y
		);		
	}
}
