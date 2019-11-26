package cantinho;

import robocode.*;
import static robocode.util.Utils.normalRelativeAngleDegrees;

/**
 * MathUtils - a class by (your name here)
 */
public class MathUtils {

	private static final double PI_AS_DEGREES = 180;	
	private static final double TWO_PI_AS_DEGREES = 360;

	public static double findAbsoluteBearing(final Position me, final Position enemy) {
		final double deltaX = enemy.getX() - me.getX();
		final double deltaY = enemy.getY() - me.getY();
		final double hypotenuse = distanceBetween(me, enemy);
		final double arcSinAsRadians = Math.asin(deltaX / hypotenuse);
		final double arcSinAsDegrees = Math.toDegrees(arcSinAsRadians);
		if(deltaX != 0) {
			if(deltaY < 0) {
				return PI_AS_DEGREES - arcSinAsDegrees;
			} else if (deltaY > 0) {
				if(deltaX > 0) {
					return arcSinAsDegrees;
				} else {
					return TWO_PI_AS_DEGREES + arcSinAsDegrees;
				}
			}
		}
		return 0;
	}
	
	public static double distanceBetween(final Position pointA, final Position pointB) {
		final double deltaX = pointB.getX() - pointA.getX();
		final double deltaY = pointB.getY() - pointA.getY();
		return Math.hypot(deltaY, deltaX);
	}
	
	public double simpleTurningRightAiming(final double myHeading, final double myGunHeading, final double enemyBearing) {
		return myHeading - myGunHeading + enemyBearing;		
	}
	
	public double normalizeBearing(final double bearing) {
		double normalizedAngle = bearing;
		normalizedAngle = normalizeRelativeAngleAsDegrees(normalizedAngle);
		while(normalizedAngle > PI_AS_DEGREES) normalizedAngle -= TWO_PI_AS_DEGREES;
		while(normalizedAngle < -PI_AS_DEGREES) normalizedAngle += TWO_PI_AS_DEGREES;
		return normalizedAngle;
	}
	
	public double optimizedTurningRightAiming(final double myHeading, final double myGunHeading, final double enemyBearing) {
		return normalizeBearing(simpleTurningRightAiming(myHeading, myGunHeading, enemyBearing));
	}

	public double simpleFirePower(final double maxDistance, final double enemyDistance, final double maxPower) {
		return Math.min(maxDistance / enemyDistance, maxPower);
	}
	
	public double normalizeRelativeAngleAsDegrees(final double bearing) {
		double normalized = bearing;
		return (normalized%= TWO_PI_AS_DEGREES) >= 0 ? (normalized < PI_AS_DEGREES) ? normalized : normalized - TWO_PI_AS_DEGREES : (normalized >= -PI_AS_DEGREES) ? normalized : normalized + TWO_PI_AS_DEGREES;
	}

}
