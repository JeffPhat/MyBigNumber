package myjava.mybignumber;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBigNumberTest implements IReceiver{

	@Test
	void testMyBigNumber() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("10", "20");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}

	
	
	@Test
	void testMyBigNumber1() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("123", "321");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	
	@Test
	void testMyBigNumber2() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("100", "50");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	
	@Test
	void testMyBigNumber3() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("300", "100");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}

	@Override
	public void send(String abc) {
		// TODO Auto-generated method stub
		System.out.println("case: " + abc);
	}

}
