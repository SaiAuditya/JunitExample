package com;

import java.util.regex.Pattern;

public class regex {

	private static final String string1= ":";
	private static final String string2="one:two:three:four:five";
	public static void main(String [] args)
	{
		Pattern patt = Pattern.compile(string1);
		String [] strArray = patt.split(string2);
		
		for(String str :strArray)
		{
			System.out.println(str);
		}
		
	}
	
}
