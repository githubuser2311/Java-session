package com.training.practice;

public class Fibonacci {
		static void fibonacci(int n){
			
			int n1=0,n2=1;
			
			for(int i=0;i<=n;i++) {
				System.out.print(n1 + " ");

				int n3=n2+n1;
				n1=n2;
				n2=n3;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		fibonacci(n);

	}

	
}
