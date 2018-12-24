package java8;

import java.util.Scanner;

public class TestEnum {

	public static void main(String args[]) {
		
		System.out.println("Enter Service provider company ");
		System.out.println("1 for USPS ");
		System.out.println("2 for UPS ");
		System.out.println("3 for DHL ");
		System.out.println("4 for FEDEX ");
		Scanner sc = new Scanner(System.in);
		
		byte companyId = sc.nextByte();
		
		final ServiceType serviceType= ServiceType.getById(companyId);
		
     
		 if(ServiceType.USPS.equals(serviceType)) {
			 System.out.println("YOu have selected USPS");
		 }else if(ServiceType.UPS.equals(serviceType)) {
			 System.out.println("YOu have selected UPS");
		 }else if(ServiceType.DHL.equals(serviceType)) {
			 System.out.println("YOu have selected DHL");
		 }else if(ServiceType.FEDEX.equals(serviceType)) {
			 System.out.println("YOu have selected FEDEX");
		 }
		
		
		
	}
	
}
