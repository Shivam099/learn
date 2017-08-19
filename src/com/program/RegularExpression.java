package com.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");				
		boolean b=m.matches();
		System.out.println("1st way:" +b);
		
		System.out.println("first:"+Pattern.matches(".s","as"));//true (2nd char is s)  
		System.out.println("second:"+Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println("third:"+Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println("fourth:"+Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println("fifth:"+Pattern.matches("..s", "mas"));//true (3rd char is s) 		

	}

}
