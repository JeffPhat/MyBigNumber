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
	
	@Test
	void testMyBigNumber4() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("303dsfas0", "100");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}

	@Test
	void testMyBigNumber5() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("303dsfas0", "10đá0");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	@Test
	void testMyBigNumber6() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("30%%%3dsfas0", "10đá0");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	@Test
	void testMyBigNumber7() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("30%%%3dsfas0", "10đáda&&0");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	@Test
	void testMyBigNumber8() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("-30%%%3dsfas0", "10đáda&&0");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	@Test
	void testMyBigNumber9() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("-30456540", "-1045645");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	@Test
	void testMyBigNumber10() {
		try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("-30456540", "1045645");
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
