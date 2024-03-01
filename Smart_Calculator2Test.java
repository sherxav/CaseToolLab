package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Smart_Calculator2Test {

	//Compound Interest
	@Test
	void test() {
	Smart_Calculator2 s = new Smart_Calculator2();
	assertEquals(7128.600000000001,s.Compound_Interest());//Principle=6000, Rate=9, Time=2
	}
	
	//Mean
	@Test
	void test2() {
	Smart_Calculator2 s = new Smart_Calculator2();
	assertEquals(5,s.mean());//size=4, numbers=6,2,8,4
	}
	
	//Factorial
	@Test
	void test3() {
	Smart_Calculator2 s = new Smart_Calculator2();
	int result = s.Factorial(5);
	assertEquals(120,result);
	}

	//Percentage
	@Test
	void test4() {
	Smart_Calculator2 s = new Smart_Calculator2();
	assertEquals(90,s.Percentage());//total marks=300, marks obtained = 270
	}
	
	//Simple Interest
	@Test
	void test5() {
	Smart_Calculator2 s = new Smart_Calculator2();
	assertEquals(4000, s.Smart_Calculator());//Principle=40000, Rate=2, Time=5
	}
	
	//Compound Interest
	@Test
	void test6() {
		Smart_Calculator2 s = new Smart_Calculator2();
		assertEquals(7024.640000000002,s.Compound_Interest());//Principle=5000, Rate=12, Time=3
	}
	
	//Mean
	@Test
	void test7() {
	Smart_Calculator2 s = new Smart_Calculator2();
	assertEquals(15,s.mean());//size=5, numbers=5,10,15,20,25
	}
	
	//Factorial
	@Test
	void test8() {
	Smart_Calculator2 s = new Smart_Calculator2();
	int result = s.Factorial(4);
	assertEquals(24,result);
	}
	
	//Percentage
	@Test
	void test9() {
	Smart_Calculator2 s = new Smart_Calculator2();
	assertEquals(60,s.Percentage());//total marks=500, marks obtained =300
	}
	
	//Simple Interest
	@Test
	void test10() {
	Smart_Calculator2 s = new Smart_Calculator2();
	assertEquals(2000,s.Smart_Calculator());//Principle=20000, Rate=5, Time=2
	}
		
}