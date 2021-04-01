package com.ks;

/**
 * Exam :)
 */
public class Application
{
    /**
     * How many centuries have n years ?
     *
     * Example
     * Year 1 belongs to the 1st century
     * Year 99 belongs to the 1st century
     * Year 101 belongs to the 2nd century
     * Year 2020 belongs to the 21st century
     *
     * @param years years...
     * @return century on the years
     */
    public static int yearsToCenturies(int years)
    {
    	 //Let's start!
        int century = (years / 100) + 1; //This is the equation that a i thought and it works !!! 
        return century;
    }

    /**
     * This method search a text equality inside of another text like SCRAMBLE !!!
     *
     * You don't need instructions, right?
     *
     * in: hdsasdellsdasooawwadwdwawrl ,  helloworld
     *     hd    ell    oo w        rl -> hdelloowrl
     * Yes, it doesn't look the same, but ordered you should get the same word, you know, like scramble ...
     *
     **** You must have the same number of letters if you use them more than once ***
     *
     * @param str1 unknown text
     * @param str2 searched word
     * @return if all same words and same quantity from second string exists in first string
     */
    public static boolean scramble(String str1, String str2)
    {
        //First tear ;(
    	
    	// Convert the "searched word" and "uknown text" string variables, to Char type to compare it one to one.
        char[] unknownText = str1.toCharArray();
    	char[] searchedWord = str2.toCharArray(); 
    	//Flag to control the times that unknownText and searchedWord are equals
        int flag = 0;
        //for to compare 2 array
        for (int i = 0; i < str2.length(); i++) {
        	for (int j = 0; j < str1.length(); j++) {
        		/**
        		 * if some character from 'searchedWord' is equal to 'unknownText'
        		 * erase that character from 'unknownText' to not repeat it (null)
        		 * and increase the flag in 1
        		 * the 'break' is to stop the search and pass to the next 
        		 * character from 'searchedWord' to not account it 
            	
            	*/
            	if(searchedWord[i] == unknownText[j]) {
            		unknownText[j] = '\0';
            		flag++;
            		break;
            	}
             }
        }
        
        //Compare the flag value and the size of the 'searches word' and must to be equals to return True else False 
        if(flag == str2.length())
            return true;
        else
        	return false;
    	
    }

    /**
     * Find a middle char(s) in a text
     *
     * Example
     *
     * in: yes (hint: odd)
     * out: e
     *
     * in: word (hint: pair)
     * out: or
     *
     * *** Always wait for a single word ***
     *
     * @param word is the resource
     * @return a middle char(s)
     */
    public static String getMiddle(String word)
    {
        //So easy ...
    	char[] wordToChar = word.toCharArray();		//Convert 'word' to an ArrayChar to work with any character 
    	int wordSize = word.length();				//wordSize has the size (int) of the word
    	int middle = wordSize / 2;					//I have now the middle number
    	String finalWord = "";						
    	
    	StringBuilder sb = new StringBuilder();		//This object help us to make a String from so many characters
    	
    	if(wordSize % 2 == 0) {						//If the residue is equal with 0 we will use 2 numbers
    		sb.append(wordToChar[middle-1]).append(wordToChar[middle]); //Making String of concatenation of character using the object and subtracting one (for the position)
    		finalWord = sb.toString();
    	}else if(wordSize % 2 != 0){				//If the residue isn't equal with 0 we will use just 1
    		sb.append(wordToChar[middle]);
    		finalWord = sb.toString();
    	}
    	
        return finalWord;
    }

    /**
     * This method is used to find how many letters are repeated
     *
     * Example
     *
     * in: AcCoMmOdatIOn
     * out: 4
     *
     * AcCoMmOdatIOn -> have (a:2, c:2, o:3, m:2, d:1, t:1, i:1, n:1)
     *               -> just more than one (a:2, c:2, o:3, m:2)
     *               -> sum them             ^    ^    ^    ^  -> 4
     *
     * *** As you can see, case sensitive is irrelevant, spaces don't count ***
     *
     * @param text is the resource to search
     * @return how many words are repeated
     */
    public static int duplicateCount(String text)
    {
    	//have fun!
    	char [] charText = text.toCharArray();			//Convert String to Char
    	int timesCounter=0;								//Counter to control than the character just repeat 1 time
    	int letterCounter=0;							//Counter that help us to count the characters repeat times
    	
    	for (int i = 0; i < text.length(); i++) {		
    		timesCounter=0;								//i put this in 0, to let that the characters will we equals with 1 or not

         	for (int j = i + 1; j < text.length(); j++) { //'For' that goes to i to forward (j+1)
         		/**Firstly i convert everything to lowercase to don't have omissions
         		 * After i compare if 'i' is equal with all the characters forward but converting the rest in empty characters
         		 * If 'i' is an empty character we ignore it and jump me to the next one
         		*/
         		if(Character.toLowerCase(charText[i]) == Character.toLowerCase(charText[j])  && charText[i] != '\0') {
         			charText[j] = '\0';
         			timesCounter++;
         			if(timesCounter == 1) { //If 1 is equal with timesCounter i count and ignore the next ones
         				letterCounter++;
         				
         			}
         		}
         	}
    	 }
        
        return letterCounter;
    }

    /**
     * This method get how many times a vocals are in a text
     *
     * Example
     *
     * in : "vowel counting is not an everyday thing"
     *        ^ ^   ^^  ^   ^   ^  ^  ^ ^   ^    ^   -> 12
     *
     * ***Always wait lowercase***
     *
     * @param str is a text to search
     * @return a number of how many times a vocals are in a text
     */
    public static int getCount(String str)
    {	
        //...
    	//Just convert the str to char and compare each one with the 5 vowels
    	char [] strToChar = str.toCharArray();
    	int vowelsCounter = 0;
    		for (int i = 0; i < str.length(); i++) {		
    			if(Character.toLowerCase(strToChar[i]) == 'a' || Character.toLowerCase(strToChar[i]) == 'e' || Character.toLowerCase(strToChar[i]) == 'i' || Character.toLowerCase(strToChar[i]) == 'o' || Character.toLowerCase(strToChar[i]) == 'u')
    				vowelsCounter++;
    		}
        return vowelsCounter;
    }

    /**
     * This method solve a quantity of multiply all separated decimal numbers on a number recursively
     *
     * in : 236
     * out: 8
     *
     * how ?
     *
     * 236 -> (2 * 3 * 6) = [36] -> (3 * 6) = [18] (1 * 8) = [8]
     *
     * <h3> How many times a decimal values need be multiplied to find a root number</h3>
     *
     * @param n a number to find a digital root
     * @return how many times a decimal values in a number can be multiplied recursively
     */
    public static int persistence(long n)
    {
    	//Next is so easy after this
    	
    	char [] longChar = String.valueOf(n).toCharArray(); 		//Char Array that contents long per position
    	int sizeOfNumber=longChar.length;							//Number Size
    	int temp=1;													//Used to multiplicate his own value
    	int finalInt=0;												//Variable with the final value
    	int flag = 0;												//Just to end the loop 'While'
    	
    	while(flag == 0) {
        	
    		for(int i=0; i < sizeOfNumber; i++) {						//This part does the multiplication o values converted to Int 
            	temp=temp*Character.getNumericValue(longChar[i]);
        	}
    		
    		 longChar = String.valueOf(temp).toCharArray();	
    		 sizeOfNumber=longChar.length;
    		 
	    		if(longChar.length == 1) {								//If just left one number, finish the While
	    			flag=1;
	    			finalInt=temp;										//Assignated the last value
	    		}
	    		
	    		temp=1;													//Reset this value to repeat de operation
    		   
    	}
    	
        return finalInt;
    }

    /**
     * This value sum all separated decimal numbers on a number recursively
     *
     * in : 123456
     * out : 3
     *
     * how ?
     *
     * 123456 -> (1 + 2 + 3 + 4 + 5 + 6) = [21] -> (2 + 1) = [3]
     *
     * @param n a number to find a digital root
     * @return digital root from a number
     */
    public static int digital_root(int n)
    {
        //Another easy
    	char [] intChar = String.valueOf(n).toCharArray(); 		    //Char Array that contents int per position
    	int sizeOfNumber=intChar.length;							//Number Size
    	int temp=0;													//Used to sum his own value
    	int finalInt=0;												//Variable with the final value
    	int flag = 0;												//Just to end the loop 'While'
    	
    	while(flag == 0) {
        	
    		for(int i=0; i < sizeOfNumber; i++) {						//This part does the sum o values converted to Int 
            	temp=temp+Character.getNumericValue(intChar[i]);
        	}
    		
    		 intChar = String.valueOf(temp).toCharArray();	
    		 sizeOfNumber=intChar.length;
    		 
	    		if(intChar.length == 1) {								//If just left one number, finish the While
	    			flag=1;
	    			finalInt=temp;										//Assignated the last value
	    		}
	    		
	    		temp=0;													//Reset this value to repeat de operation
    		   
    	}
        return finalInt;												//Yeah i used the code of "persistence" xD
    }

    /**
     * This method return a char pair in array
     *
     * Example
     * in: "Give me some pairs please"
     * out: [Gi, ve,  m, e , so, me,  p, ai, rs,  p, le, as, e_]
     *
     * ***Spaces also count***
     *
     * @param s a text to evaluate
     * @return an array with pair of chars
     */
    
    public static String[] solution(String s)
    {
    	//Will be worse ?
    	int sizeOfString=s.length();						//Size of String 's'
    	String [] CadenaFinal=new String[sizeOfString];		//Array of strings with the half of elements that 's' cause is in groups of two and two
    	int conta=0;
    	int conta2=2;
    	
    	for(int i=0; i < sizeOfString/2; i++) {				//'For' that helps to full the array String with the pair of characters
	    	CadenaFinal[i]=s.substring(conta,conta2);
	    	conta=conta2;
	    	conta2=conta2+2;
    	}
    	
        return CadenaFinal; 								//That was the best that i could do it
    } 

    /**
     * This method convert a long in a valid ip
     *
     * Example
     *
     * in: 2147483467L -> out : 127.255.255.75
     *
     * how ?
     * 1.- Convert a long in binary (you will always get 32 bits or less, if there is less just apply the pad to the left with zero)
     * 2.- Get 4 bytes (4 groups of 8 bits will give you 4 bytes)
     * 3.- Converts each byte to a decimal number
     * 4.- Apply the ip format to your 4 decimal numbers
     *
     * @param ip is a 32 bits number maximum
     * @return an IP
     */
    public static String longToIP(long ip)
    {
        //yes, can be worse...
    	String Bytes[]=new String[4];							//Contains 4 modules to each byte
    	String strLong = Long.toBinaryString(ip);				//Converting Long to binary
    	int size = strLong.length();							//Size of variable
    	String ipinverted="";									//This help me to add zeros in the correct way
    	String ipcomeback="";		
    	
    	for (int x=strLong.length()-1;x>=0;x--)					//Invert to add zeros to left 
    		ipinverted = ipinverted + strLong.charAt(x);
    	
    	if(size < 32) {											//If the variable doesn't have 32 character we fully with zeros	
    		for(int i=size; i<32;i++) {
    			ipinverted=ipinverted.concat("0");
    		}
    	}
    	
    	for (int x=32-1;x>=0;x--)								//I put 32 cause must tobe in this level.
    		ipcomeback = ipcomeback + ipinverted.charAt(x);		//I retuned the ip to the correct side
    	
    	Bytes[0]= ipcomeback.substring(0, 8);					//Save to 4 in 4 the binary values to a Vector
    	Bytes[1]= ipcomeback.substring(8, 16);
    	Bytes[2]= ipcomeback.substring(16, 24);
    	Bytes[3]= ipcomeback.substring(24, 32);
    	   	
    	long numeroDecimal = Long.parseLong(Bytes[0], 2);		//This help me to convert from binary to decimal
    	long numeroDecimal2 = Long.parseLong(Bytes[1], 2);
    	long numeroDecimal3 = Long.parseLong(Bytes[2], 2);
    	long numeroDecimal4 = Long.parseLong(Bytes[3], 2);
    	
    	//Creating the string 
    	String IPfinal = String.valueOf(numeroDecimal) + "." + String.valueOf(numeroDecimal2) + "." + String.valueOf(numeroDecimal3) + "." + String.valueOf(numeroDecimal4);
    	
    	return IPfinal;							
    }

    /**
     * This method find a shortest word in a text
     *
     * Example
     * in : "When I was young I had a lot of toys" -> out : 1
     *            ^           ^     ^              -> can be any of them
     *
     * in : "The worst part of school was solving problems like this" -> out : 2
     *                      ^^
     *
     * @param s a text to find the shortest word
     * @return a shortest word size in a text
     */
    public static int findShort(String s)
    {
        //have fun!
        String[] palabras = s.split(" ");				//I cut the string 's' delimited by the " " and put each element in a new array
        int smallestSize=0;
        String aux;										//Used to help in the 'bubble sort'
        
        // I used bubble sort to put the word with the smallest size in the position 0, regroup the array
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras.length - i - 1; j++) {
                if (palabras[j + 1].length() < palabras[j].length()) {
                    aux = palabras[j + 1];
                    palabras[j + 1] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        smallestSize=palabras[0].length();					//The size of the first position must be the smallest in all the ways

        return smallestSize;
    }

    /**
     * Find a first number repeated in the array
     *
     * Example
     * in : {1,2,3,8,5,2} -> out : 2
     * in : {5,9,6,7,5,9,9} -> out : 5
     * in : {5,1,6,7,8,9,9} -> out : 9
     *
     * @param values is an int array
     * @return a first number repeated in the array or else return -1
     */
    public static Integer repeated(int[] values)
    {
        //Last one!
    	int counter=0;
    	Integer number=0;
    	int flag = 0;
    	for(int i=0; i < values.length; i++) {
    		counter=0;
    		for(int j=0; j < values.length; j++) {
        		if(values[i] == values[j]) {
        			counter++;
        			if(counter == 2 && flag == 0) {
        				number = values[i];
        				flag=1;
        				break;
        			}
        		}
        	}
    	}
        return number;
    }

}