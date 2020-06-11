import java.util.*;

public class RectangleArea {
	public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
                System.out.println("Enter Length");
                float l = read.nextFloat();
                System.out.println("Enter breadth");
                float b = read.nextFloat();
                Area calc = new Area(l,b);
                System.out.print("Area of Reactangle is: " +calc.returnArea());
        }
}

class Area{
        float length;
        float breadth;
        Area(float l, float b) {
                this.length = l;
                this.breadth = b;
        }
        float returnArea() {
                return (length*breadth);
        }
}
