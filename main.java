import java.util.Scanner;

public class main{
	
	private Mybignumber number;
	public static void main(String[] args) {
	number = new Mybignumber();
	//nhập dữ liệu
	String a;
	String b;
	Scanner sc= new Scanner(System.in);
	System.out.println("Input first number:");
	a= sc.nextLine();
	System.out.println("Input second number:");
	b= sc.nextLine();
	
	String c = number.sum(a,b);
	
	System.out.println("Result is: "+c);
}
