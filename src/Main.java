import java.util.Arrays;

class Car {
	private float price;

	public Car(float price) {
		super();
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Car() {
		this(0);
	}

	public void carsprice() {
		System.out.println("Price is: " + this.price);
	}
}

public class Main {

	public static void main(String[] args) {
		Car cars []= new Car[10];		
		cars [0] = new Automobile(6700,15);
		cars [1] = new Automobile(90000,10);
		cars [2] = new Automobile(4000,14);
		cars [3] = new Automobile(2000,12);
		cars [4] = new Automobile(6000,13);
		cars [5] = new SUV(12000,14);
		cars [6] = new SUV(17000,10);
		cars [7] = new SUV(9000,9);
		cars [8] = new SUV(14000,14);
		cars [9] = new SUV(27000,12);
//		for (int i = 0; i<cars.length; i++) {
//			cars[i]= new Car(i);
//		}
		
		//Arrays.sort(cars);
		for (Car c: cars) {
			c.carsprice();
		}
	}
}
