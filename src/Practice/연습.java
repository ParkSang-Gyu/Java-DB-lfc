package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 연습 {
		
		public static String getScrambledWord(String str) { 
			 Set set = new HashSet();
			 char[] ch = str.toCharArray();
			 for(int i =0; i<ch.length; i++){
			 set.add(ch[i]);
			 }
			 String tt = set.toString();

			 return tt;
		}
	
}
