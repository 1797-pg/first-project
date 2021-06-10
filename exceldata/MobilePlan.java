package com.te.exceldata;


public class MobilePlan {

	private String Product_name;
	
	private String Price_Plan_Name;
	
	private String Onetime_fee;
	
	private String Recurring_Fee;

	public String getProduct_name() {
		return Product_name;
	}

	public String getPrice_Plan_Name() {
		return Price_Plan_Name;
	}

	public String getOnetime_fee() {
		return Onetime_fee;
	}

	

	public MobilePlan(String product_name, String price_Plan_Name, String onetime_fee, String recurring_Fee) {
		super();
		Product_name = product_name;
		Price_Plan_Name = price_Plan_Name;
		Onetime_fee = onetime_fee;
		Recurring_Fee = recurring_Fee;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public void setPrice_Plan_Name(String price_Plan_Name) {
		Price_Plan_Name = price_Plan_Name;
	}

	public void setOnetime_fee(String onetime_fee) {
		Onetime_fee = onetime_fee;
	}

	public void setRecurring_Fee(String recurring_Fee) {
		Recurring_Fee = recurring_Fee;
	}

	public MobilePlan() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "MobilePlan [Product_name=" + Product_name + ", Price_Plan_Name=" + Price_Plan_Name + ", Onetime_fee="
				+ Onetime_fee + ", Recurring_Fee=" + Recurring_Fee + "]";
	}

	public String getRecurring_Fee() {
		return Recurring_Fee;
	}

	
	
}
