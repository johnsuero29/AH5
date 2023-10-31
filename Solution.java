import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import javax.xml.transform.Source;

class Solution {
    public static String mostFrequentChar(String s) {
      
      ArrayList<Character> array = new ArrayList<Character>(); 
      
      for(int i = 0; i< s.length(); i++)
      {
        array.add(s.charAt(i));
      }

      int charCount = 0;
      HashMap<Character, Integer> mostFrequent = new HashMap<Character, Integer>();
      
      for(Character x : array)
      {
        int newCharCount = Collections.frequency(array, x);
        if(newCharCount > charCount)
        {
          charCount = newCharCount;
          mostFrequent.clear();
          mostFrequent.put(x, charCount);
        }
      }

      String result = mostFrequent.toString();
      return result;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
      System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

  }
