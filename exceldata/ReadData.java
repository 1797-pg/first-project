package com.te.exceldata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReadData {

	public static void main(String[] args) {
		String path="C:\\Users\\Pooja Gupta\\Downloads\\Products (4) - Sheet1.csv";
		String line="";
		MobilePlan plan = new MobilePlan();
		try {
			
			BufferedReader br=new BufferedReader(new FileReader(path));
			while((line=br.readLine())!=null){
				String[] values=line.split(",");
				
				
				
				
			  HashMap<Integer,MobilePlan> map=new HashMap<>();
			  map.put(1, new MobilePlan(values[0],values[1],values[2],values[3]));
//			  
////				String sArray=values[0];
////				String dArray=values[2];
////				String vArray=values[3];
//////				System.out.println(" "+values[1]+" ");
////				ArrayList arr=new ArrayList<>();
////				
////				arr.add(sArray);
////				arr.add(dArray);
////				arr.add(vArray);
//////				System.out.println(arr);
		  for(Map.Entry<Integer, MobilePlan> entry:map.entrySet()) {
			  System.out.println(entry.getValue().getProduct_name());
				  System.out.println(entry.getValue().getOnetime_fee());
				  System.out.println(entry.getValue().getRecurring_Fee());
				 
				  
				  
			  }
			    
				
			
					}
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
