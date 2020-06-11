public class Triangle {
	int a,b,c;
	float area;
	int perimeter;
	public Triangle() {
		this.a=3;
		this.b=4;
		this.c=5;
		this.area = (a*b)/2;
		this.perimeter = a+b+c;
	}
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		System.out.println(tri.area);
		System.out.println(tri.perimeter);
	}
}
