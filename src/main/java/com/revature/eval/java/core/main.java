package com.revature.eval.java.core;

import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

import com.revature.eval.java.core.EvaluationService.AtbashCipher;
import com.revature.eval.java.core.EvaluationService.BinarySearch;
import com.revature.eval.java.core.EvaluationService.RotationalCipher;
import com.revature.eval.java.core.EvaluationService.Triangle;
 
public class main {
 
	public static void main(String[] args) {
		 
		
		EvaluationService evaluation = new EvaluationService();
		System.out.println("==============================================");
		System.out.println("===============exercise 1 ====================");
		System.out.println("==============================================");
		System.out.println(evaluation.reverse("hola"));
		System.out.println("==============================================");
		System.out.println("===============exercise 2 ====================");
		System.out.println("==============================================");
		System.out.println(evaluation.acronym("Portable Network Graphics"));
		System.out.println("==============================================");
		System.out.println("===============exercise 3 ====================");
		System.out.println("==============================================");
		Triangle triangle = new Triangle(1.0,1.0,1.0);
		System.out.println(triangle.isEquilateral());
		System.out.println(triangle.isIsosceles());
		System.out.println(triangle.isScalene());
		System.out.println("==============================================");
		System.out.println("===============exercise 4 ====================");
		System.out.println("==============================================");
		System.out.println(evaluation.getScrabbleScore("cabbage"));
		System.out.println("==============================================");
		System.out.println("===============exercise 5 ====================");
		System.out.println("==============================================");
		System.out.println(evaluation.cleanPhoneNumber("+1 (613).995-0253"));
		System.out.println("==============================================");
		System.out.println("===============exercise 6 ====================");
		System.out.println("==============================================");
		System.out.println(evaluation.wordCount("olly olly olly in in in in come free "));
		System.out.println("==============================================");
		System.out.println("===============exercise 7 ====================");
		System.out.println("==============================================");
		BinarySearch<String> dictionary =new BinarySearch<String>(null);
		
		 
		List<String> list =  new ArrayList<String>(); 
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		dictionary.setSortedList(list);
		 		
		System.out.println(dictionary.indexOf("item3"));
		 
		System.out.println("==============================================");
		System.out.println("===============exercise 8 ====================");
		System.out.println("==============================================");
		
		evaluation.toPigLatin("hello string airplane baby elephant");
		
		System.out.println("==============================================");
		System.out.println("===============exercise 9 ====================");
		System.out.println("==============================================");
		
		System.out.println(evaluation.isArmstrongNumber(9));
		
		System.out.println("==============================================");
		System.out.println("===============exercise 10 ===================");
		System.out.println("==============================================");
		
		evaluation.calculatePrimeFactorsOf(18);
		
		System.out.println("==============================================");
		System.out.println("===============exercise 11 ===================");
		System.out.println("==============================================");
		
		RotationalCipher cipher =new RotationalCipher(0);
		
		cipher.setKey(13);
		System.out.println(cipher.rotate("Gur dhvpx oebja sbk whzcf bire gur ynml qbt"));
		
		System.out.println("==============================================");
		System.out.println("===============exercise 12 ===================");
		System.out.println("==============================================");
		System.out.println(evaluation.calculateNthPrime(1));
		System.out.println(evaluation.calculateNthPrime(2));
		System.out.println(evaluation.calculateNthPrime(3));
		System.out.println(evaluation.calculateNthPrime(4));
		System.out.println(evaluation.calculateNthPrime(5));
		System.out.println(evaluation.calculateNthPrime(6));
		System.out.println(evaluation.calculateNthPrime(7));
		System.out.println(evaluation.calculateNthPrime(8));
		
		System.out.println("==============================================");
		System.out.println("===============exercise 13 14 ==================");
		System.out.println("==============================================");

		AtbashCipher cipher1 = new AtbashCipher();
		System.out.println(cipher1.encode("TEST"));
		System.out.println(cipher1.decode("gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt"));
		
		System.out.println("==============================================");
		System.out.println("===============exercise 15 ===================");
		System.out.println("==============================================");
		
		
		System.out.println(evaluation.isValidIsbn("3-598-21508-8"));
		
		System.out.println("==============================================");
		System.out.println("===============exercise 16 ===================");
		System.out.println("==============================================");
		 System.out.println(evaluation.isPangram("the quick brown fox jumps over the lazy dog aaaaaaa bbbbbbb"));
		 
		 System.out.println("==============================================");
		 System.out.println("===============exercise 17 ===================");
		 System.out.println("==============================================");
		 
		 		// evaluation.getGigasecondDate( t);
		 System.out.println("==============================================");
		 System.out.println("===============exercise 18 ===================");
		 System.out.println("==============================================");
		 int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 
		 System.out.println("The sum of multiples is : " + evaluation.getSumOfMultiples(5,numbers));
		 
		 System.out.println("==============================================");
		 System.out.println("===============exercise 19 ===================");
		 System.out.println("==============================================");
		 //1 8273 1232 7352 0569
		 //1 4539 1488 0343 6467
		 System.out.println(evaluation.isLuhnValid("1 8273 1232 7352 0569"));
		 System.out.println(evaluation.isLuhnValid("1 4539 1488 0343 6467"));
		 System.out.println("==============================================");
		 System.out.println("===============exercise 20 ===================");
		 System.out.println("==============================================");
		 System.out.println("result : "+ evaluation.solveWordProblem("What is 5 plus 13"));
		 System.out.println("result : "+ evaluation.solveWordProblem("What is 7 minus 5"));
		 System.out.println("result : "+ evaluation.solveWordProblem("What is 6 multiplied by 4"));
		 System.out.println("result : "+ evaluation.solveWordProblem("What is 25 divided by 5"));
		 
		 
		 
		 
		 
	}   
	
	
	
}
