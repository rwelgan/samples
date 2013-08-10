package com.fvsw.example.fizzbuzz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FizzBuzzDemo {
	
	static ArrayList<String> getNumber(String filename) {
		
		BufferedReader objReader = null;
		ArrayList<String> foundNumbers = new ArrayList<String>();
		
		try {
						
			String currentLine;
			
			objReader = new BufferedReader(new FileReader(filename));
			
			while ((currentLine = objReader.readLine()) != null) {
				String[] splits = currentLine.split(FizzConst.SPLITCHAR);
				for (int i=0; i<splits.length; i++) {
						foundNumbers.add(splits[i]);
				}				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objReader != null) {
					objReader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return foundNumbers;
	}

	public static void main(String[] args) {
		
		ArrayList<String> fizzBuzzers = getNumber(FizzConst.CSVFILE);
				
		for (int i=0; i<fizzBuzzers.size(); i++) {
			if (fizzBuzz.isFizzBuzz(Integer.parseInt(fizzBuzzers.get(i)))) {
				System.out.println(FizzConst.FIZZ+FizzConst.BUZZ);
			}
			else if (fizzBuzz.isFizz(Integer.parseInt(fizzBuzzers.get(i)))) {
				System.out.println(FizzConst.FIZZ);
			}
			else if (fizzBuzz.isBuzz(Integer.parseInt(fizzBuzzers.get(i)))) {
				System.out.println(FizzConst.BUZZ);
			}
			else {
				System.out.println(fizzBuzzers.get(i));
			}
		}
	}

}
