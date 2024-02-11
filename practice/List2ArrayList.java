package com.training.practice;

import java.util.ArrayList;
import java.util.List;

public class List2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=new ArrayList<String>();
		ls.add("Apple");
		ls.add("Amazon");
		ls.add("Microsoft");
		
		
			System.out.println(ls);
			
			  String[] arr=new String[ls.size()]; 
			  ls.toArray(arr); 
			  for(int i=0;i<arr.length;i++)
			  { System.out.println(arr[i] +" "); 
			  }
			 

	}

}
