
public class TestFactoryPattern {

	public static void main(String[] args) {
		// powinny się wypisac 3 rozne rodzaje samochodow
			CarFactory.buildCar(CarType.SMALL);
			CarFactory.buildCar(CarType.SEDAN);
			CarFactory.buildCar(CarType.LUXURY);

	}
}
