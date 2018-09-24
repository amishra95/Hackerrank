
public class problem2WithBJClarke {

    static List<Integer> closest(String s, List<Integer> queries) {
        List<Integer> responses = new ArrayList<Integer>();
  
  for (int i = 0; i < queries.size(); i++) {
    int query = queries.get(i);
    char queryChar = s.charAt(query);
    if (s.indexOf(queryChar) == s.lastIndexOf(queryChar)) {
      responses.add(-1);
      continue;
    }
    
    // if true, there is an index > query such that s.charAt(index) == queryChar
    if (query < s.length()-1 && s.indexOf(queryChar, query+1) != -1) {
      
      int index = s.indexOf(queryChar, query+1);
      int diff = index - query;
      
      int leftIndex = s.lastIndexOf(queryChar, query-1);
      if (leftIndex != -1 && query - leftIndex <= diff) {
        responses.add(leftIndex);
      } else {
        responses.add(index);
      }
      continue;
    }
    responses.add(s.lastIndexOf(queryChar, query-1));
  }
  
  return responses;

}
}

