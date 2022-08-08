package Electronics;

public class demo2 {
	
	public static void main(String[] args) // Static method in same class
	{	add();
		sub();
		mul();
		div();}
	
	public static void add()
	{	int a=20;
		int b=10;
		System.out.println("Addition is: "+(a+b));}
	
	public static void sub()
	{   int a=20;
		int b=10;
		System.out.println("Substraction is: "+(a-b));}
	
	public static void mul()
	{	int a=20;
		int b=10;
		System.out.println("Multiplication is: "+(a*b));}
	
	public static void div()
	{	int a=20;
		int b=10;
		System.out.println("Division is: "+(a/b));}	
}