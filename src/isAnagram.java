//Mot efficient method, which also involved O(N) func.
static boolean isAnagram(String a, String b) {
        
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
        
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        
        for(char c: first){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(char c: second){
            map.put(c, map.getOrDefault(c,0)-1);
        }
        
        for(int count: map.values()){
            if(count != 0){
                return false;
            }
            
        }
        return true;

    }

//Solving without importing java.util.Arrays.*;
public class Solution {

    static boolean isAnagram(String a, String b) {
       char[] first = a.toLowerCase().toCharArray();
       char[] second = b.toLowerCase().toCharArray();
       
      java.util.Arrays.sort(first);
      java.util.Arrays.sort(second);
      
      return java.util.Arrays.equals(first, second);
       
    }
