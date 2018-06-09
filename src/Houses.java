import org.jointheleague.graphical.robot.Robot;

public class Houses {
	int height = 0;
	static Robot it = new Robot();
public static void main(String[] args) {
	it.setX(10);
	it.setY(350);
	drawFlatRoof(100);
}
public void drawPointyRoof() {
	
}
public static void drawFlatRoof(int height) {
	
	it.setSpeed(50);
	it.penDown();
	it.setPenWidth(3);
	it.move(height);
	it.turn(90);
	it.move(50);
	it.turn(90);
	it.move(height);
	it.turn(-90);
	it.setPenColor(0, 255, 0);
	it.move(50);
}
}
