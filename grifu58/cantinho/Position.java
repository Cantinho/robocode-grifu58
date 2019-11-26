package cantinho;

/**
 * Position - a class represents object position.
 */
public class Position {
	
	private final double x;
	private final double y;
	
	public Position(final double x, final double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String toString() {
		return "Position: x=" + x + " y=" + y;
	}

}
