package com.mph.mvnproj;

public class Calculate {

	
	public int add(int... number) {
		int result = 0;
		
		for(int i:number) {
			result+=i;
		}
		return result;
	}
	
	public int Multiply(int... number) {
		int result = 1;
		
		for(int i:number) {
			result*=i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,19,26));

	}

	public void divide(int... number) {
		int result = number[0];
		for(int i=1; i<number.length ;i++) {
			result/=number[i];
		}
		
	}

}
