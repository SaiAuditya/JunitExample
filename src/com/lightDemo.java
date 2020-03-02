package com;

public class lightDemo {

	boolean isOn = false;
			
    public void turnOn()
    {
		isOn = true;
    }
    
    public void turnOff()
    {
		isOn = false;
    }
    
    
	public static void main(String[] args)
	{
		lightDemo l1= new lightDemo();
		lightDemo l2 = new lightDemo();
		l1.turnOn();
		System.out.println(l1.isOn);
		l1.turnOff();
		System.out.println(l1.isOn);
		l1.turnOff();
		System.out.println(l2.isOn);
	}
}
