package myjava.mybignumber;

/**
 * Tác giả: Trần Hữu Phát.
 * sum là hàm để thực hiện phép cộng 2 chuỗi số
 */

public class MyBigNumber {

    /**
Đây là cmt.
*/

	private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }
    
    
    
    public String sum(final String a,final String b) {
        int c = a.length();
        int d = b.length();
        String result = "";
		String step = "";
		String abc = "";
        int sodu = 0;
        int max = 0;
        int flag;
        int so1;
        int so2;
        char num1;
        char num2;
        int k;   // tổng tạm không có số nhớ
        int s1;
        int  s2;
        
        //so sánh độ dài 2 chuổi.
        
        if (c >= d) {
            max = c;
        } else {
            max = d;
        }
        
        //vòng lặp
        
        for (int i = 0; i < max; i++) {
            
            //dùng lấy vị trí cuối của dãy số
            so1 = c - i - 1;
            so2 = d - i - 1;
            
            //lấy số ở vị trí đó ra
            num1 = (so1 >= 0) ? a.charAt(so1) : '0'; 
            num2 = (so2 >= 0) ? b.charAt(so2) : '0';
            
            s1 = num1 - '0';
            s2 = num2 - '0';
            
            k = s1 + s2;
            //cộng từng số
            flag = (s1) + (s2) + sodu;
            
            //tách và cộng ký tự vào chuổi
            result = (flag % 10) + result;
           
            
            //Tính số dư
            sodu = flag / 10;
            
            
            if (i == 0) {
                abc = "Step " + i + " : " + s1 + " + " + s2 + " = " + k
                    + " , " + " Remember " + sodu + " , " + " Result " + result + "\n";
            } else {
                abc = "Step " + i + " : " + s1 + " + " + s2 + " + " + sodu 
                    + " = " + sodu + " , " + " Remember " + sodu + " , " + " Result " + result + "\n";
            }
            step = step + abc;
        }
        
        if(sodu > 0) {
        	result = sodu + result;
        }
        this.ireceiver.send(step);
        return result;
    }
}
