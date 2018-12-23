package myjava.mybignumber;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBigNumberTest implements IReceiver{


        public static int p = 0;
	public static ArrayList<String> list = new ArrayList<String>();
	
	
	
	@Test
	void testMyBigNumber() {
	
			list.add("10 + 20");
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("10", "20");
			assertEquals("30", sum);
	}

	
	@Test
	void testMyBigNumber1() {
			list.add("123 + 321");
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("123", "321");
			assertEquals("444", sum);
	}
	
	
	@Test
	void testMyBigNumber2() {
			list.add("100 + 50");
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("100", "50");
			assertEquals("150", sum);
	}
	
	
	@Test
	void testMyBigNumber3() {
			list.add("300 + 100");
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("300", "100");
			assertEquals("400", sum);
	}
	
	@Test
	void testMyBigNumber4() {
		try{
			list.add("303dsfas0 + 100");
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
			list.add("303dsfas0 + 10đá0");
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
			list.add("30%%%3dsfas0 + 10đá0");
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
			list.add("30%%%3dsfas0 + 10đáda&&0");
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
			list.add("-30%%%3dsfas0 + 10đáda&&0");
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
			list.add("-30456540 + -30456540");
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("-30456540", "-30456540");
        }catch(NumberFormatException ex){
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
	@Test
	void testMyBigNumber10() {
		try{
			list.add("-30456540 + 1045645");
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
		System.out.println(list.get(p) + abc);
		p++;
	}

}
