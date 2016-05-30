
class SUV extends Car {
	private double highpermSUV;

	public SUV(float price, double highpermSUV) {
		super(price);
		this.highpermSUV = highpermSUV;
	}

	public double getHighpermSUV() {
		return highpermSUV;
	}

	public void setHighpermSUV(double highpermSUV) {
		this.highpermSUV = highpermSUV;
	}

	public SUV() {
		this(0, 0);
	}

	public void autoconsumption() {
		System.out.println("High performance SUV: " + this.highpermSUV);
	}
}
