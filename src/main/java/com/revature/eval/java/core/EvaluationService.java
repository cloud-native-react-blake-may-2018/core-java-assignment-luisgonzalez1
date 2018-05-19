package com.revature.eval.java.core;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluationService {
	

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		String phraseWords[] = phrase.split(" "); 
		String acronym = "";
     
 		for (int i = 0 ;i<phraseWords.length ; i++)
 		{   //.substring
 			//This method returns new String object
 			//containing the substring of the given string from specified startIndex to endIndex.
 			acronym+= phraseWords[i].substring(0, 1);
 			 
 			
 		}
 		 acronym.toUpperCase(); 
 		
		return acronym;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {

			if(this.sideOne == this.sideTwo && this.sideOne == this.sideThree)
			{
				return true;
			}
			
			
			return false;
		}

		public boolean isIsosceles() {
			 if(this.sideOne == this.sideTwo || this.sideOne == this.sideThree || this.sideTwo== this.sideThree) {
			return true;
		}
		else return false;
	}

		public boolean isScalene() {
 		 if (!this.isIsosceles()) {
 			 
 			 return true ;
 		
		}
 		else return false;

	}
}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		string=string.toUpperCase();
		 
		String inputString[] =  string.split("");
	    String onePoint[] = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"} ;
	    String twoPoint[] = {"D", "G"};
	    String threePoint[] = {"B","C", "M", "P"};
	    String fourPoint[] = {"F", "H", "V", "W", "Y"};
	    String fivePoint[] = {"K"};
	    String eightPoint[] = {"J", "X"};
	    String tenPoint[]= {"Q", "Z"};
	    int counter=0;
	    
	    
	    for (String letter:onePoint) {
	    	 for (String ltrInputString:inputString) {
	    		 
	    		 if(ltrInputString.equals(letter)) {
	    			 
	    			 counter+=1;
	    		 }
	    	 }
	    }  
	    
	    for (String letter:twoPoint) {
	    	 for (String ltrInputString:inputString) {
	    		 
	    		 if(ltrInputString.equals(letter)) {
	    			 
	    			 counter+=2;
	    		 }
	    	 }
	    }  
	    
	    for (String letter:threePoint) {
	    	 for (String ltrInputString:inputString) {
	    		 
	    		 if(ltrInputString.equals(letter)) {
	    			 
	    			 counter+=3;
	    		 }
	    	 }
	    }  
	    
	    for (String letter:fourPoint) {
	    	 for (String ltrInputString:inputString) {
	    		 
	    		 if(ltrInputString.equals(letter)) {
	    			 
	    			 counter+=4;
	    		 }
	    	 }
	    }  
	    
	    for (String letter:fivePoint) {
	    	 for (String ltrInputString:inputString) {
	    		 
	    		 if(ltrInputString.equals(letter)) {
	    			 
	    			 counter+=5;
	    		 }
	    	 }
	    }  
	    
	    for (String letter:eightPoint) {
	    	 for (String ltrInputString:inputString) {
	    		 
	    		 if(ltrInputString.equals(letter)) {
	    			
	    			 counter+=8;
	    		 }
	    	 }
	    }  
	    
	    for (String letter:tenPoint) {
	    	 for (String ltrInputString:inputString) {
	    		 
	    		 if(ltrInputString.equals(letter)) {
	    			 
	    			 counter+=10;
	    		 }
	    	 }
	    }  
	     
	    

	    
	    
	    return counter;
}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String number) {
		 
		System.out.println(number);
		
		number = number.replaceAll("[ (  ) \\+ \\. 1 \\- ]", "");
				
		return number;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		Map<String, Integer> wordCounter = new HashMap<String, Integer>();
		
		//string = "olly olly olly in in in in come free" ;
		String sentence[] = string.split(" ");
		
		//wordCounter.put(sentence[0], 1);
		for (String word : sentence) {
			if(wordCounter.containsKey(word) ) {
				
				wordCounter.put(word, wordCounter.get(word)+1);
				 
			}else {
				wordCounter.put(word, 1);
				
			}
			
			 
		}
//		prints the HashMap
//		Set seOfKeys = wordCounter.keySet();
//		Iterator iterator = seOfKeys.iterator();
//		while(iterator.hasNext()) {
//			
//			String key = (String) iterator.next();
//			Integer value =(Integer)wordCounter.get(key);
//			
//			System.out.println( key + " : " + value);
//		}



		return wordCounter;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {		
			 
			
			
			 if(this.sortedList.contains(t)) {
			  return  this.sortedList.indexOf(t);	 	  
			 }else return -1;
			 
			 
		}
		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}
         
	}


	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		 String vowels[]= {"a","e","i","o","u"};
		 String stringArr[] =string.split(" ");
		 String firstLetter =null;
		 String pigStr="";
		 
		 for (int i=0 ;i< stringArr.length ; i++ ) {
			    firstLetter=stringArr[i].substring(0,1);
			    
			 if(firstLetter.equals("a")  ||  firstLetter.equals("e")  || firstLetter.equals("i") 
					 || firstLetter.equals("o")  ||  firstLetter.equals("u")  ) {
				 
				 stringArr[i] = stringArr[i].concat("ay");
				 
				 //System.out.println(stringArr[i]);
				 
				 if (Arrays.asList(stringArr).contains(stringArr[i])){
				        pigStr += stringArr[i];
						pigStr += " ";
				       }
				 
			 }else {
			 				 
				//concat first letter to the end of stringArr
				 
				 	stringArr[i]=stringArr[i].concat(stringArr[i].substring(0,1));
			    //new stringArr without first letter
				 	
				 	stringArr[i] =stringArr[i].substring(1);
			   //concat first ay to the end of stringArr
				 	
				 	stringArr[i]=stringArr[i].concat("ay");
			 
			        //System.out.println(stringArr[i]);
			        
			       if (Arrays.asList(stringArr).contains(stringArr[i])){
			        pigStr += stringArr[i];
					pigStr += " ";
			       }
			 }
			 
			 
				 
 		 }	 
		
		return pigStr;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		int sum =0 ; 
		Integer number  =  input;
		
		number.toString().length();
		String[] arr= number.toString().split("");
		Integer numArr[] =new Integer[arr.length];
		
		
	    for(int i= 0 ; i<arr.length ; i++ ) {
	    	
	    	
	    	numArr[i]=Integer.parseInt(arr[i]);
	     	sum+=Math.pow(numArr[i], numArr.length);
	    	
	    }
		 
		System.out.println(sum);
		if (sum == number) {
			return true;
		}else return false;
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		List<Long> primeFac = new  ArrayList<Long>();
		for (long i=2; i <= l/i; i++) {
			 System.out.println("{ i = " + i + " , number = " + l + "}");
			 while(l%i == 0) {
			  l = l/i;
			  //System.out.println("Factor: " + i);
			  primeFac.add(i);
			 }

			 }
			 if(l > 1) {
			  //System.out.println("Factor: " + l);
			  primeFac.add(l);
			 }
			 System.out.println();

			

		
		
		return primeFac;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.setKey(key);
		}

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			
		   String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}  ;
		    
		   String arr2[] = Arrays.copyOfRange(arr, arr.length-this.getKey(), arr.length);
		   String arr3[] = Arrays.copyOfRange(arr, 0, arr.length-this.getKey());
		   String merge[] = new String[arr2.length+arr3.length];
		   int continueString = 0;	
		   String decoded = "";
		   String shifted ="";
		   String alphabeth ="";
		   string=string.toUpperCase();
		   String arrOfInput[] = string.split("");
		   
		     
		   /// fors will create the array with the shift
		     
		     for (int i = 0 ; i<arr2.length ; i++) {
		    	 merge[i]=arr2[i];
		    	 
		    	 continueString ++;
		     }
		     for (int j = 0 ; j<arr3.length ; j++) {
		    	 
		    	 merge[continueString ++]=arr3[j];
		    	 
		     }
		     
		     // will compare string with shifted alphabeth
		     //will look index in normal alphabeth 
		     //and then will retrieve element in shifted alphabeth
		     for (int i=0 ; i< arrOfInput.length ; i++) {
		     
		      if(Arrays.asList(arr).contains(arrOfInput[i])) {
		    	  int index = Arrays.asList(arr).indexOf(arrOfInput[i]);
		    	  decoded+= Arrays.asList(merge).get(index);
		    	  
		      }else {
		    	  decoded+=" ";
		      }
		    	  
		     }
		      
		      for(String l:merge) {
			    	 
			    	shifted+=l;
			    }
		      for(String l:arr) {
			    	 
			    	alphabeth+=l;
			    }
		      System.out.println(alphabeth.toLowerCase());
		      System.out.println(shifted.toLowerCase());
		      decoded=decoded.toLowerCase();
			return  decoded;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		int numerator=2;
		int results =0;
		int counter =1;
		while(counter != i) {
			numerator++;
			results = numerator%2;
			if (results !=0) {
				counter ++;
				
			}	
			
		}
		 
		return numerator;
			
		
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}  ;
			String arrReversed[] = new String [arr.length];
			string=string.toUpperCase();
			String arrOfInput[]= string.split("");
			 
			int counter=arr.length-1;
			String encoded="";
			String reversedAlphabeth ="";
			String alphabeth ="";
			
			// will allocate reversed alphabeth on arrReversed
			for (int i=0 ;i< arr.length ;i++) {
				 arrReversed[i]=arr[counter];
				counter--;
			}
			
			 
			
			 
			 for (int i=0 ; i< arrOfInput.length ; i++) {
			     
			      if(Arrays.asList(arr).contains(arrOfInput[i])) {
			    	  
			    	  int index = Arrays.asList(arr).indexOf(arrOfInput[i]);
			    	  encoded+= Arrays.asList(arrReversed).get(index);
			    	  
			      }else {
			    	  encoded+=" ";
			      }
			     } 
			 
			 
			 
			 
			for(String l:arrReversed) {
		    	 
				reversedAlphabeth+=l;
		    }
	      for(String l:arr) {
		    	 
		    	alphabeth+=l;
		    }
	      
	      System.out.println(alphabeth.toLowerCase());
	      System.out.println(reversedAlphabeth.toLowerCase());
	      encoded=encoded.toLowerCase();
	      
	      
			return encoded;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			
			String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}  ;
			String arrReversed[] = new String [arr.length];
			string=string.toUpperCase();
			String arrOfInput[]= string.split("");
			 
			int counter=arr.length-1;
			String decoded="";
			String reversedAlphabeth ="";
			String alphabeth ="";
			
			// will allocate reversed alphabeth on arrReversed
			for (int i=0 ;i< arr.length ;i++) {
				 arrReversed[i]=arr[counter];
				counter--;
			}
			
			 
			
			 //same block for encode and decode  
			//the only thing that change is the order of the arr
			 for (int i=0 ; i< arrOfInput.length ; i++) {
			     
			      if(Arrays.asList(arr).contains(arrOfInput[i])) {
			    	  
			    	  int index = Arrays.asList(arrReversed).indexOf(arrOfInput[i]);
			    	  decoded+= Arrays.asList(arr).get(index);
			    	  
			      }
			     } 
			 
			 
			 
			 
			for(String l:arrReversed) {
		    	 
				reversedAlphabeth+=l;
		    }
	      for(String l:arr) {
		    	 
		    	alphabeth+=l;
		    }
	      
	      //System.out.println(alphabeth.toLowerCase());
	      //System.out.println(reversedAlphabeth.toLowerCase());
	      decoded=decoded.toLowerCase();
	      
	      
			return decoded;
			 
			
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		 string=string.replace("-" ,"");
		  System.out.println(string);
		  String[] arr= string.split("");
		  int multiplier=10;
		  int sum=0;
			Integer numArr[] =new Integer[arr.length];
			
			//converting string elements to int
		    for(int i= 0 ; i<arr.length ; i++ ) {  	
		    	
		    	numArr[i]=Integer.parseInt(arr[i]);   	 
		    	
		    }
		    
		    //multiply all elements
		    //and sum all elements
		    for (Integer n:numArr) {
		    	n*=multiplier;
		    	sum+=n;
		    	multiplier --;
		     	 

		    }

		    System.out.println(sum);
		    //divide sum by 11
		    if(sum%11==0) {
		    	return true;
		    			
		    }else return false;
		
		
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		//upper cased string due to arr[] having upper cased elements
		String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}  ;
		string=string.toUpperCase();
		string=string.replaceAll(" ", "");
		String arrOfInput[]= string.split("");
		//System.out.println(string.length());
		//System.out.println(string);
		String notRepeatString="";
		
		String arrNotRepeated[]=new String[40];
		int confirm=0;
		for (int i=0 ; i< arrOfInput.length ; i++) {
		     
		      if(Arrays.asList(arr).contains(arrOfInput[i])) {
		    	  
		    	  
		    	  //filters repeated letters withing the input string    
		    	   	  
		    	  if(!Arrays.asList(arrNotRepeated).contains(arrOfInput[i])) {
		    		 
		    		  arrNotRepeated[i]=arrOfInput[i];
		    		   
		    		   
		    		 // System.out.println(arrConfirm[i]);
		    	  }
		    	  	  
		      } 
		     
		     }
		 //pass elements on arrNotRepeated to notRepeatString and filter any null variables within array 
		for (String l: arrNotRepeated) {
			if(l!=null) {
				notRepeatString+=l;
			}
			
		}
		 
		System.out.println("Original string  :" + string.toLowerCase());
		System.out.println("String without repeated letters  :" + notRepeatString.toLowerCase());
		 
		//notRepeatString is true if length is equal to the amount of letters in the alphabeth
			if ( notRepeatString.length() == 26) {
				return true;
	    	  
			}else return false;
		 
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	 
		public Temporal getGigasecondDate(Temporal given) {
			// TODO Write an implementation for this method declaration
			int gigaSecond = 1000000000;
			int year;
			int day;
			int month;
			if (given.isSupported(ChronoUnit.SECONDS)) 				
			 return given.plus(gigaSecond, ChronoUnit.SECONDS);
			else {
				year = given.get(ChronoField.YEAR);
				month = given.get(ChronoField.MONTH_OF_YEAR);
				day = given.get(ChronoField.DAY_OF_MONTH);
			}
			
			return LocalDateTime.of(year, month, day, 0, 0, 0).plus(gigaSecond, ChronoUnit.SECONDS);
		}
	

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		int sum =0;
		System.out.println("Multiples of "+ i);
		for(int number:set) {
			
			if(number%i == 0 ) {
				sum+=number;
				System.out.println(number);
			}
		}
		
		// TODO Write an implementation for this method declaration
		return sum;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		 string=string.replace(" ", "");
		 string=string.substring(1);
		 String strArr[]=string.split("");
		 Integer numArr[]=new Integer[strArr.length];
		 
		 for ( int i =0; i< strArr.length ; i++) {
			 
			 numArr[i]=Integer.parseInt(strArr[i]);
		 }
		 String strNumber="";
		 Integer digit1;
		 Integer digit2;
		 
		 
		 for (int i = 0;i<numArr.length; i+=2) {
			 
			 numArr[i]*=2;
			 
			 if(numArr[i] >9 ) {
				 
				 strNumber=String.valueOf(numArr[i]);
				 digit1=Integer.parseInt(strNumber.substring(0, 1));
				 digit2=Integer.parseInt(strNumber.substring(1));
				 numArr[i]=digit1+digit2;
				 
				 
				 
			 }
			 
			 
			 
			 
		 }
		 int sum=0;
		 String doubled="";
		 for(Integer n:numArr) {
			 
			 doubled+=n;
			 sum+=n;
		 }
		 System.out.println("Initial input String "+string);
		 System.out.println("Doubled String "+doubled);		 
		 System.out.println("Sum of all the products " + sum);
		 
		 if(sum%10==0) {
			 return true;
			 
			 
		 }else  return false; 
		
		
		
		 
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		System.out.println(string);
		string=string.replaceAll("\\?"," ");	
		System.out.println(string);
		System.out.println(string);
		String arr[]=string.split(" ");
		 
		String mathTerms[]= {"multiplied","divided","minus","plus"};
		String numbers[]= {"1","2","3","4","5","6","7","8","9"};
         int i=0;
         int index=0;
         int operator=0;
         int value[]=new int[2];
         int counter=0;
         int value1=0;
         int value2=0;
         int results=0;
          
		while(i<=100) {
			 //System.out.println("inside while");
			
					if(Arrays.asList(arr).contains(String.valueOf(i))){
						
						 value[counter]=i;
						 counter++;
						
						
					}
					i++;
			}
		
		value1=value[0];
		value2=value[1];
		System.out.println(value1);
		System.out.println(value2);
		
		if(Arrays.asList(arr).contains("multiplied")){
			
			  results=value2*value1;
			
			
		}else if(Arrays.asList(arr).contains("divided")){
			
			results=value2/value1;
			
		}else if(Arrays.asList(arr).contains("minus")){
			
			results=value2-value1;
			
		}else if(Arrays.asList(arr).contains("plus")){
			
			results=value2+value1;
			
		}
		
		
		return results;
	}

}
 