package com.te.exceldata;

public class Demo {

	public static void main(String[] args) {
		
//		String str="I am From Test Yantra";
//		String temp;
////		int i=str.length()-1;
////		int start,end=i+1;
//		String[] str1= str.split(" ") ;
////		 System.out.println(str1[0]);
//		for(int i=str1.length-1;i>=0;i--) {
//			System.out.println(str1[i]);
//		}
//		}
		
	  String str2="malayalam";
	  int i=0;
	  int j=str2.length()-1;
	  
	  while(i<j) {
		  if(str2.charAt(i)==str2.charAt(j)) {
			  i++;
			  j--;
		  }
		    
	  }
	  System.out.println("pallindrome");
	}
}

