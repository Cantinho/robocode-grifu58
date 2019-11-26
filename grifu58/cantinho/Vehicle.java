package cantinho;

/**
 * Vehicle - a class to represent vehicle
 */
public class Vehicle {
	private double x;
	private double y;
	private double energy;
	private double heading;
	private double bearing;
	
	public Vehicle(final double x, final double y, final double energy, final double heading, final double bearing) {
		this.x = x;
		this.y = y;
		this.energy = energy;
		this.heading = heading;
		this.bearing = bearing;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getEnergy() {
		return energy;
	}
	
	public double getHeading() {
		return heading;
	}
	
	public double getBearing() {
		return bearing;
	}
	
	public String toString() {
		return "Vehicle: x=" + x + " y=" + y + " energy=" + energy + " heading=" + heading + " bearing=" + bearing;
	}
	
}

