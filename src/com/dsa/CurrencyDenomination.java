package com.dsa;


import java.util.Scanner;



public class CurrencyDenomination {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the size of currency denominations");
		
		int size=scanner.nextInt();
		
		
		int note[]=new int[size];
		int notecounter[]=new int[size];
		
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < note.length; i++) {
			note[i]=scanner.nextInt();
		}
		
		System.out.println();
	
		
		System.out.println("enter the amount want to pay:");
		int amountPay =scanner.nextInt();
		MergeSorting mergeSorting= new MergeSorting();
		mergeSorting.sort(note, 0, note.length-1);
		
		for(int i=note.length-1;i>=0;i--) {
			
			notecounter[i]=amountPay/note[i];
			amountPay= amountPay%note[i];
		}
		
		for(int i=note.length-1;i>=0;i--) {
			
			if(notecounter[i]>0)
			System.out.println(note[i]+":"+notecounter[i]);
			
		}
		
		scanner.close();
	}

}
