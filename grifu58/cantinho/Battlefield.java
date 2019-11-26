package cantinho;
import java.awt.Rectangle;

/**
 * Battlefield - a class to represent the battlefield
 */
public class Battlefield {

	private Rectangle field;
	
	public Battlefield(final int x, final int y, final int width, final int height) {
		this.field = new Rectangle(x, y, width, height);
	}
	
	public double getX() {
		return field.getX();
	}
	
	public double getY() {
		return field.getY();
	}
	
	public double getWidth() {
		return field.getWidth();
	}
	
	public double getHeight() {
		return field.getHeight();
	}
	
	public boolean contains(final int x, final int y) {
		return field.contains(x, y);
	}

}

