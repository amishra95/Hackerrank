//@BJClarke
// @AMishra95
public class problem1withBJClarke {
	   static List<Integer> minimalOperations(List<String> words) {
           // loop through each word
         // loop through each char in each word
             // if the current char equals the previous char, add 1 to the count and skip ahead an index (so you don't count the next one)
     List<Integer> count = new ArrayList<Integer>();
 
     for (int i = 0; i < words.size(); i++) {
     int c = 0;
     for (int j = 1; j < words.get(i).length(); j++) {
       if (words.get(i).charAt(j) == words.get(i).charAt(j-1)) {
             c++;
             j++;
       }
     }
     count.add(c);
   }
 
     return count;

}
}
