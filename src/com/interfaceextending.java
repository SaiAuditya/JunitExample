package com;

public class interfaceextending implements interface2,interface1{
	
	public static void main(String [] args)
	{
		interfaceextending ex = new interfaceextending();
		ex.method1();
	}
	
	public void method1()
	{
		System.out.println("in default method xxx");
	}

}

interface interface1
{
	default void method1()
	{
		System.out.println("in default");
	}
}

interface interface2 
{
	default void method1()
	{
		System.out.println("in default method redefined");
	}
}

interface interface3 
{
	
	default void method1()
	{
		System.out.println("in default method redefined2");
	}
}
