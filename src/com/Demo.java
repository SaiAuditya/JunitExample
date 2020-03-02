package com;

interface staticm {
static void staticmethod()
{
System.out.println("Inside interface");	
}

}

class staticinterface implements staticm
{
	//public static void staticmethod()
	//{
		//System.out.println("inside statiuc method");
	//}
}

public class Demo
{
	public static void main(String args[]) {
		//new staticinterface().staticmethod();
		staticm.staticmethod();
	}
}