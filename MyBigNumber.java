
/**
*
* @author Trần Hữu Phát. FengTimo
*/
import java.util.Scanner;

public class MyBigNumber{
public static void main(String[] args){
	
	//nhập dữ liệu
	String a;
	String b;
	Scanner sc= new Scanner(System.in);
	System.out.println("Input first number:");
	a= sc.nextLine();
	System.out.println("Input second number:");
	b= sc.nextLine();
	
	String c = sum(a,b);
	
	System.out.println("Result is: "+c);
}
 
 

//hàm cộng hai số
public static String sum(String a, String b){
	int c=a.length();
	int d=b.length();
	String result="";
	int max, sodu=0;
	
		//so sánh độ dài 2 chuổi
	if(c>=d){
		max=c;
	}else{
		max=d;
	}
	
		//vòng lặp
	for(int i=0; i<max;i++){
		
			//dùng lấy vị trí cuối của dãy số
		int so1= c-i-1;
		int so2= d-i-1;
		
			//lấy số ở vị trí đó ra
		char num1 = '0';
		char num2 = '0';
		if (so1 >= 0) {
            num1 = a.charAt(so1); 
        }
        if (so2 >= 0) {
            num2 = b.charAt(so2);
        }
		
			//cộng từng số
		int flag = (num1- '0') + (num2- '0') + sodu;
		
			//tách và cộng ký tự vào chuổi
		if (so1 > 0) {
            result = (flag % 10) + result;
        } else {
            result = flag + result;
        }
		
			//Tính số dư
        sodu = flag / 10;
	}
	
	return result;
}
}
