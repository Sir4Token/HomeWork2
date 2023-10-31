package oopTask2;



public class Triangle {
	private int size1;
	private int size2;
	private int size3;
	
	public Triangle(int size1, int size2, int size3) {
		super();
		this.size1 = size1;
		this.size2 = size2;
		this.size3 = size3;
	}
	

	public Triangle() {
		super();
	}

	public int getSize1() {
		return size1;
	}

	public void setSize1(int size1) {
		this.size1 = size1;
	}

	public int getSize2() {
		return size2;
	}

	public void setSize2(int size2) {
		this.size2 = size2;
	}

	public int getSize3() {
		return size3;
	}

	public void setSize3(int size3) {
		this.size3 = size3;
	}

	public double areaGeron () {
		double p = (size1 + size2 + size3) / 2.0;
		double area = Math.sqrt(p*(p - size1) * (p - size2) * (p - size3));
		return area;
	}
	
	
	public String toString() {
		return "Triangle [size1 = " + size1 + ", size2 = " + size2 + ", size3 = " + size3 + "]";
	}
	
}
