package com.psl.question2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BillingClass {

	public static void main(String[] args) {
		String str,s1[];
		Customer c=null;
		List<Customer> customerList = new ArrayList<Customer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Billing.csv"));
			str=br.readLine();
			s1=str.split(",");
			System.out.println(s1[0]+"\t"+s1[1]+"\t"+s1[2]+"\t"+s1[3]+"\t"+s1[4]+"\t"+s1[5]+"\t"+s1[6]+"\t"+s1[7]);
			while((str=br.readLine())!=null)
			{
				c=new Customer();
				s1=str.split(",");
				System.out.println(s1[0]+"\t\t"+s1[1]+"\t\t\t"+s1[2]+"\t\t"+s1[3]+"\t\t"+s1[4]+"\t\t\t"+s1[5]+"\t\t\t"+s1[6]+"\t\t\t"+s1[7]);
				c.setCustomerId(Integer.parseInt(s1[0]));
				c.setCustomerName(s1[1]);
				c.setISD_duration(Double.parseDouble(s1[2]));
				c.setISD_per_min(Double.parseDouble(s1[3]));
				c.setSTD_duration(Double.parseDouble(s1[4]));
				c.setSTD_per_min(Double.parseDouble(s1[5]));
				c.setLocal_duration(Double.parseDouble(s1[6]));
				c.setLocal_per_min(Double.parseDouble(s1[7]));
				
				customerList.add(c);
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double total=0;
		
		System.out.println(" billing Amount Per cutomer is ");
		for (Customer customer : customerList) {
			total=0;
			total=(customer.getISD_duration()/60)*customer.getISD_per_min() +  (customer.getSTD_duration()/60)*customer.getSTD_per_min() + (customer.getLocal_duration()/60)*customer.getLocal_per_min();
			System.out.println(customer.getCustomerId()+"\t"+customer.getCustomerName()+"\t"+total);
			
		}
		
	}
}
