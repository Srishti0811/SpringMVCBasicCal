package com.srishti.services;

public class OperationService {

	public double cal(int a, int b, String operator) {
		
		switch(operator) {
			case "Add": 
				return a + b;
			case "Subtract": 
				return a - b;
			case "Multiply": 
				return a * b;
			case "Divide": 
				if(b != 0) {
					return a/b;
				}
			default:
	            throw new RuntimeException("Unsupported operation is given for calculation");
		}
		
	}
	
	
	
}
