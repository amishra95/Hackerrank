//Solving without importing java.util.Arrays.*;
public class Solution {

    static boolean isAnagram(String a, String b) {
       char[] first = a.toLowerCase().toCharArray();
       char[] second = b.toLowerCase().toCharArray();
       
      java.util.Arrays.sort(first);
      java.util.Arrays.sort(second);
      
      return java.util.Arrays.equals(first, second);
       
    }
