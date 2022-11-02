/*
 * This is demo class to test package
 * @author: Anikesh Chouhan
 * @Date: 02nov
 */

//declaring package
package com.test;

//declaring a class to test package demo
public class loops {

	//main method
	public static void main(String[] args) {
		
	//creating a object of Demo class	
	Demo obj1 = new Demo();
	
	//calling the method
	obj1.printValue();
	
	//calling static directly with name of class: no object required
	Demo.printMessage();
	

	}
	
	//end of main method

}
