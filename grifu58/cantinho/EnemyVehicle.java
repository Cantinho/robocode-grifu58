package cantinho;

/**
 * EnemyVehicle - a class represents an enemy vehicle.
 */
public class EnemyVehicle extends Vehicle {
	private double speed;
	private double distance;
	
	public EnemyVehicle(
		final String id, 
		final double x, 
		final double y, 
		final double energy, 
		final double heading, 
		final double bearing,
		final double speed,
		final double distance) {
		
		super(id, x, y, energy, heading, bearing);
		this.speed = speed;
		this.distance = distance;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setSpeed(final double speed) {
		this.speed = speed;
	}
	
	public void setDistance(final double distance) {
		this.distance = distance;
	}
}
