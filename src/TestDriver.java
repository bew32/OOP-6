
public class TestDriver {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.engineStar();
		c1.engineStop();
		
		ICar c2 = new Car();
		c2.engineStart();
		c2.engineStop();
		}
}
