package cantinho;

/**
 * Vehicle - a class to represent vehicle
 */
public class Vehicle {
	private String id;
	private double x;
	private double y;
	private double energy;
	private double heading;
	private double bearing;
	
	public Vehicle(final String id, final double x, final double y, final double energy, final double heading, final double bearing) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.energy = energy;
		this.heading = heading;
		this.bearing = bearing;
	}
	
	public Vehicle() {}
	
	public String getId() {
		return id;
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
	
	public void setId(final String id) {
		this.id = id;
	}
	
	public void setX(final double x) {
		this.x = x;
	}
	
	public void setY(final double y) {
		this.y = y;
	}
	
	public void setEnergy(final double energy) {
		this.energy = energy;
	}
	
	public void setHeading(final double heading) {
		this.heading = heading;
	}
	
	public void setBearing(final double bearing) {
		this.bearing = bearing;
	}

	public String toString() {
		return "Vehicle: x=" + x + " y=" + y + " energy=" + energy + " heading=" + heading + " bearing=" + bearing;
	}
	
}
