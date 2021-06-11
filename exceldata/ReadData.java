package com.te.exceldata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		String path="C:\\Users\\Pooja Gupta\\Downloads\\Products (4) - Sheet1.csv";
		String line="";
		int st=0,dt=0,vt=0;
		int srec=0,drec=0,vrec=0;
		Map<Integer,MobilePlan> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
//		MobilePlan plan = new MobilePlan();
		try {
			
			BufferedReader br=new BufferedReader(new FileReader(path));
			while((line=br.readLine())!=null){
				String[] values=line.split(",");
				
//				List<MobilePlan> mplans=new ArrayList<MobilePlan>();
				
//				MobilePlan plan=new MobilePlan(values[0],values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]));
				
			    if(values[0].equals("SMS")) {
			    	st=st+Integer.parseInt(values[2]);
			    	srec=srec+Integer.parseInt(values[3]);
			    	map.put(3,new MobilePlan(values[0],values[1],st,srec));
			    	
			    }
			    if(values[0].equals("Data Plan")) {
			    	dt=dt+Integer.parseInt(values[2]);
			    	drec=drec+Integer.parseInt(values[3]);
			    	map.put(2,new MobilePlan(values[0],values[1],dt,drec));
			    	
			    }
			    if(values[0].equals("Voice Plan")) {
			    	vt=vt+Integer.parseInt(values[2]);
			    	vrec=vrec+Integer.parseInt(values[3]);
			    	map.put(1,new MobilePlan(values[0],values[1],vt,vrec));
			    	
			    }
			    			
				}
			System.out.println("enter the key");
			for(Map.Entry<Integer, MobilePlan> entry:map.entrySet()) {
				  
				if(entry.getKey()==sc.nextInt());	 
					
				System.out.println(entry.getValue().getProduct_name()+" OT-"+entry.getValue().getOnetime_fee()+" RecFee-"+entry.getValue().getRecurring_Fee());
					  
				  }
			
//					
		} catch (Exception e) {
			e.printStackTrace();
		}
//
	}

}
	
