package com.program;

import java.util.HashSet;

class HashSetBook {

	int id,quantity;
	String publisher,name,author;
	
	public HashSetBook(int id, String name, String author, String publisher, int quantity) {
			
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}

	public class HashSetExercise {
		
	public static void main(String[] args) {
		
		//creating hashset
		
		HashSet<HashSetBook> set=new HashSet<HashSetBook>();
		HashSetBook b1=new HashSetBook(101,"Let us C","Yashwant Kanetkar","BPB",8);
		HashSetBook b2=new HashSetBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		
		set.add(b1);
		set.add(b2);
		
		for(HashSetBook b:set){
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		
		
		
		

	}

}
