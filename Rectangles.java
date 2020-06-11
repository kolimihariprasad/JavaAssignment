public class Rectangles {
	public float areaOfRectangle(float l, float b){
	return l*b;
	}
	public static void main(String[] args){
		Rectangles rect = new Rectangles();
		System.out.println(rect.areaOfRectangle(4,5));
		System.out.println(rect.areaOfRectangle(5,8));
	}
}
