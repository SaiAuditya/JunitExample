package com;

public class intLongvalues {
	
	public static void main(String [] args)
	{
		int phno [] = new int[3];
		//phno[0]=1233456764;
		//phno[1]=1233456765;
		//phno[2]=1233456766;
		int phno2 [] = new int[3];
		//phno2[0]=1233456764;
		//phno2[1]=1233456765;
		//phno2[2]=1233456766;
		System.out.println(phno==phno2);
		System.out.println(phno.equals(phno2));
		
		String s = new String("tss");
		String s2 = new String("tss");
		
		System.out.println(s==s2);
		
	}

}
