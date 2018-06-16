import org.jointheleague.graphical.robot.Robot;

public class Houses {
	int height = 0;
	static Robot it = new Robot();
public static void main(String[] args) {
	it.setX(10);
	it.setY(350);
	drawFlatRoof(100);
	drawPointyRoof(70);
	drawFlatRoof(20);
	drawPointyRoof(90);
	drawFlatRoof(50);
	drawPointyRoof(30);
	drawFlatRoof(10);
	drawPointyRoof(60);
	drawFlatRoof(110);
	drawPointyRoof(40);
	drawFlatRoof(100);
	drawPointyRoof(50);
	
}
public static void drawPointyRoof(int height) {
	it.setSpeed(200);
	it.penDown();
	it.setPenWidth(3);
	it.setPenColor(0, 0, 0);
	it.move(height);
	it.turn(45);
	it.move(25);
	it.turn(90);
	it.move(25);
	it.turn(45);
	it.move(height);
	it.turn(-90);
	it.setPenColor(0, 255, 0);
	it.move(40);
	it.turn(-90);
	
}
public static void drawFlatRoof(int height) {
	
	it.setSpeed(200);
	it.penDown();
	it.setPenWidth(3);
	it.setPenColor(0, 0, 0);
	it.move(height);
	it.turn(90);
	it.move(35);
	it.turn(90);
	it.move(height);
	it.turn(-90);
	it.setPenColor(0, 255, 0);
	it.move(40);
	it.turn(-90);
}
}
