package com.program;

import java.util.regex.Pattern;

public class RegExpCharacter {

	public static void main(String[] args) {
		
		System.out.println("first:"+Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println("second:"+Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println("third:"+Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

	}

}
