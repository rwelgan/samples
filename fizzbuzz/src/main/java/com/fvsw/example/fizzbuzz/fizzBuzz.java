package com.fvsw.example.fizzbuzz;

public class fizzBuzz {
	
	static boolean isFizz (int inputNumber) {
		
		if ((inputNumber % 3) == 0) {
			return true;
		}
		else {
			return false;
		}	
		
	}
	
	static boolean isBuzz (int inputNumber) {
		
		if ((inputNumber % 5) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean isFizzBuzz (int inputNumber) {
		
		if (isBuzz(inputNumber) && isFizz(inputNumber)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

