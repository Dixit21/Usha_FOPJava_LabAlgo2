package com.greatlearning.currencydenomination;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of Currency Denominations: ");
		int size= sc.nextInt();
		int [] count = new int [size];
		int [] denValue = new int [size];
		
		System.out.println("Enter the Currency Denominations value: ");
			for (int i=0; i<size; i++) 
			{
			denValue[i]=sc.nextInt();
			}
		System.out.println("Enter the amount you want to pay");
			int amountPayable =sc.nextInt();
	
	//sort the value of array i.e denValue
			SortingClass sort = new SortingClass();
			denValue= sort.sort(denValue);
	
		if (amountPayable<=0)
		{
		System.out.println("Total amount is zero or negative Please enter vaild amount");
		}
		else if (amountPayable == denValue[0]) 
		{
			count[0]=1;
		} 
		else {
			for(int i=0; i<size; i++) 
			{
				if(amountPayable >= denValue[i])
				count [i] =amountPayable/denValue[i];
				amountPayable =amountPayable - count[i]*denValue[i];  
	    }
 		if (amountPayable == 0) 
 		{
 			System.out.println("your payment approach in order to give min no of notes will be:");
 			for (int i=0; i<size; i++)
 			if(count[i]>0) 
 			{
 			 	System.out.println(denValue[i]+":"+ count[i]);
 			}
 		}
		
 		else
 			 System.out.println("Amount can not be printed with the given Denomination");
 	 		
 		}
	}
 	
}

