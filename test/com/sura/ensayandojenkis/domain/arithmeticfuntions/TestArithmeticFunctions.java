package com.sura.ensayandojenkis.domain.arithmeticfuntions;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sura.ensayandojenkis.domain.arithmeticfunctions.ArithmeticFunctions;

public class TestArithmeticFunctions {

	@Test
	public void sumarTest(){
		ArithmeticFunctions functions= new ArithmeticFunctions();
		int expectedValue=65;
		int term1=22,term2=43,plus;
		plus=functions.plus(term1,term2);
		assertEquals(plus, expectedValue);
	}
	
	@Test
	public void restarTest(){
		ArithmeticFunctions functions=new ArithmeticFunctions();
		int expectedValue=-4;
		int term1=4,term2=8,sub;
		sub=functions.subtraction(term1,term2);
		assertEquals(expectedValue, sub);
	}
	
	@Test
	public void multiplyTest(){
		ArithmeticFunctions functions=new ArithmeticFunctions();
		int expectedValue=28;
		int multiply,term1=4,term2=7;
		multiply=functions.multiply(term1,term2);
		assertEquals(expectedValue, multiply);
	}
	
	@Test
	public void divisionTest(){
		ArithmeticFunctions functions =new ArithmeticFunctions();
		Double expectedValue=7.0;
		Double division;
		Double term1=23.0,term2=3.0;
		division=functions.division(term1,term2);
		assertEquals(expectedValue, division);
	}

}
