import java.util.*;

public class Complex {
	public static void main(String args[]) {
		float num1,num2;

		Scanner input =  new Scanner(System.in);
		Complex_Op cal = new Complex_Op() ;
		System.out.print("Enter the first Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex_Op Object1  = new Complex_Op(num1,num2);
		System.out.print("Enter the Second Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex_Op Object2  = new Complex_Op(num1,num2);
		cal.AddNumbers(Object1,Object2);
		cal.SubtractNumbers(Object1,Object2);
		cal.MultiplyNumbers(Object1,Object2);
	}
}

class Complex_Op
{
	private float real,imag;
	Complex_Op()
	{
		real=0;
		imag=0;
	}
	Complex_Op(float real,float imag)
	{
		this.real=real;
		this.imag=imag;
	}
	void  AddNumbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		this.real = (C1.real + C2.real);
		this.imag = (C1.imag + C2.imag);
		System.out.println("Addition is:("+this.real+") + ("+this.imag+")i" );
	}
	void SubtractNumbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		this.real = (C1.real - C2.real);
		this.imag = (C1.imag - C2.imag);
		System.out.println("subtraction is:("+this.real+") + ("+this.imag+")i" );
	}
	void MultiplyNumbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		this.real = (C1.real*C2.real - C1.imag*C2.imag);
		this.imag = (C1.real*C2.imag + C2.real*C1.imag);
		System.out.println("multiplication is:("+this.real+") + ("+this.imag+")i" );
	}
}
