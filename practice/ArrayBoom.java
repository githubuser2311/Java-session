package com.training.practice;

public class ArrayBoom {

	public static void main(String[] args) {
		// When the input array contains 7 it should display "BOOM" if not display 7 not found in the array. 

//int a[]={5,6,7,8,9} //BOOM 

//int a[]={9,6,5,4,3} // 7 not present 

//int a[]={12,35,67,80} // BOOM  
		
		int a[]= {5,6,7,8,9};
		int n=a.length;
		System.out.println(n);
		
		for(int i=0;i<n;i++) {
			if(a[i]!=7) {
			System.out.println("7 not present");
			break;
		}
		

	}
	}
}
