package com.program;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExercise {
	
	String empName,dept,company;
	int empID;
	


	public HashTableExercise(int empID, String empName, String dept, String company) {
		this.empID=empID;
		this.empName=empName;
		this.dept=dept;
		this.company=company;
		
	}



	public static void main(String args[]){
		
		Hashtable<Integer, HashTableExercise> htable=new Hashtable<Integer, HashTableExercise>();
		HashTableExercise h1=new HashTableExercise(101,"Shivam","OSS","CTLI");
		HashTableExercise h2=new HashTableExercise(101, "Joe", "DWI", "IBM");
		HashTableExercise h3=new HashTableExercise(103, "Mohan", "ITS", "JPM");
		
		htable.put(1, h1);
		htable.put(2, h2);
		htable.put(3, h3);
		
		//traversing map
		
		for(Map.Entry<Integer,HashTableExercise> entry:htable.entrySet())
		{
			int key=entry.getKey();
			HashTableExercise ht=entry.getValue();
			System.out.println(key+" Details: ");
			System.out.println(ht.empID+" "+ht.empName+" "+ht.dept+" "+ht.company);
		}
		
		
		
	}
}
