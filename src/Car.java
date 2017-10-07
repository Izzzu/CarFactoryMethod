
public abstract class Car {

	private CarType model;

	public Car(CarType model) {
		this.model = model;
		construct();

	}

	public CarType getModel() {
		return model;
	}

	protected void construct() {
		System.out.println("Building a car: " + model.name());
	};


	
}
