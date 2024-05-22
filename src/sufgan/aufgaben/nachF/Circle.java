package sufgan.aufgaben.nachF;

public class Circle {
	int radius = 0;
	
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	double getДлинаКруга() {
		return 2 * Math.PI * radius;
	}
	
	int getNext(int a) {
		return a + 1;
	}
	
	int getNext() {
		return 8;
	}
	
	public static void main(String[] args) {
		Circle a = new Circle();
		
		System.out.println(a.getNext(13));
		System.out.println(a.getNext());
	}
}
