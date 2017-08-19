package com.program;

import java.util.Scanner;

public class findDupInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array with duplicate record");
		int arrayWithDup[]=new int[5];
		for(int i=0;i<arrayWithDup.length-1;i++){
			arrayWithDup[i]=sc.nextInt();
		}
		for(int i=0;i<arrayWithDup.length-1;i++)
		{
		System.out.println("List of array as "+arrayWithDup[i]);
		}

	}

}
