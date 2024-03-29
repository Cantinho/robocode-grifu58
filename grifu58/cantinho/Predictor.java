package cantinho;
/**
 * Predictor - a class represents a position predictor.
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
	
	public static double predictAbsoluteBearing(final long futureTimestamp, final Position current, final double heading, final double speed) {
		final Position predictedPosition = predictPosition(futureTimestamp, current, heading, speed);
		final double predictAbsoluteBearingInDegrees = MathUtils.findAbsoluteBearing(current, predictedPosition);
		return predictAbsoluteBearingInDegrees;
	}
	
	public static double predictNormalizedBearing(final double absoluteBearing, final double gunHeading) {
		return MathUtils.normalizeBearing(absoluteBearing - gunHeading);
	}
	
}
