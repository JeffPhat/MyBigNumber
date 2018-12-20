package myjava.mybignumber;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBigNumberTest implements IReceiver{

	@Test
	void testMyBigNumber() {
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("10", "30");
	}

	
	
	@Test
	void testMyBigNumber1() {
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "321");
	}
	
	
	@Test
	void testMyBigNumber2() {
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("150", "20");
	}
	
	
	@Test
	void testMyBigNumber3() {
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("100", "300");
	}

	@Override
	public void send(String abc) {
		// TODO Auto-generated method stub
		System.out.println("case: " + abc);
	}

}
