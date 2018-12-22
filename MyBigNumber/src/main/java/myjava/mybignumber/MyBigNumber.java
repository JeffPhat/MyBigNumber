package myjava.mybignumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    /**
Đây là cmt.
*/
    
    public String sum(final String a, final String b) {
        final Pattern pattern = Pattern.compile("\\D");
        final Matcher flag1 = pattern.matcher(a);
        final Matcher flag2 = pattern.matcher(b);
        String str1 = a;
        String str2 = b;
        String result = "";
        String step = "";
        String abc = "";
        final int c = str1.length();
        final int d = str2.length();
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
        int local;
        
        //check two number sequences is empty or not
        // if it is null make it = '0'
        if ((str1 == null) || (str1.trim().isEmpty())) {
            str1 = "0";
        }
        if ((str2 == null) || (str2.trim().isEmpty())) {
            str2 = "0";
        }
        
        //Check whether the number is negative
        if (str1.charAt(0) == '-') {
            local = 1;
            this.ireceiver.send("Chưa hỗ trợ số âm : " + str1);
            throw new NumberFormatException("Tại vị trí " + local 
                    + " của chuỗi " + str1 + " không phải là số");
        }
        if (str2.charAt(0) == '-') {
            local = 1;
            this.ireceiver.send("Chưa hỗ trợ số âm : " + str2);
            throw new NumberFormatException("Tại vị trí " + local 
                    + " của chuỗi " + str2 + " không phải là số");
        }
        
        //Check whether characters are special characters or characters
        if (flag1.find()) {
            local = flag1.start() + 1;
            this.ireceiver.send("Vui lòng không chứa kí tự trong chuỗi : " + str1);
            throw new NumberFormatException("Tại vị trí " + local 
                    + " của chuỗi " + str1 + " không phải là số");
        }
        if (flag2.find()) {
            local = flag2.start() + 1;
            this.ireceiver.send("Vui lòng không chứa kí tự trong chuỗi : " + str2);
            throw new NumberFormatException("Tại vị trí " + local 
                    + " của chuỗi " + str1 + " không phải là số");
        }
        
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
        
        if (sodu > 0) {
            result = sodu + result;
        }
        this.ireceiver.send(step);
        
        return result;
    }
}