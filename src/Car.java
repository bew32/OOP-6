public class Car implements ICar {

	@Override
	public void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("Engine Start");

	}

	@Override
	public void changeGear(int newGear) {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub

	}
	
	public void engineStop() {
		System.out.println("Engine Stop");
	}

}