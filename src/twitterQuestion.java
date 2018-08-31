 
public class Solution{
// Complete the primeQuery function below.
    static List<Integer> primeQuery(int n, List<Integer> first, List<Integer> second, List<Integer> values, List<Integer> queries) {
				
      	List<Integer> answers = new ArrayList<Integer>();
      	for (int i = 0; i < queries.size(); i++) {
          	int query = queries.get(i); // node number to start at is 'query'
          	int parent;
          
						if (query == 1) {
              	return numOfPrimes(values);
            } else {
              	parent = bfs(1, query, first, second);
            }
          
          	List<Integer> subTreeNodes = getNodesInSubtree(parent, query, first, second);
          	
          	answers.add(numOfPrimes(subTreeNodes));
        }
      
      	return answers;

    }


		public int bfs(int root, int query, List<Integer> first, List<Integer> second){
      List<Integer> children = new ArrayList<Integer>();
      children.add(root);
      
      while (children.size() != 0) {
      	for(int i = 0; i < children.size(); i++){
          List<Integer> nextChildren = new ArrayList<Integer>();
        	List<Integer> tempChildren = getRootChildren(children.get(i), first, second);
          for(int j = 0; j < tempChildren.size(); j++) {
          	if (tempChildren.get(j) == query) {
              	return children.get(i);
            }
          }
          nextChildren.addAll(tempChildren);
      	}
        children = nextChildren;
      }
     
    }

		static List<Integer> getRootChildren(int root, List<Integer> first, List<Integer> second) {
    
		List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < first.size(); i++){
      
      		if(first.get(i) == 1){
      			list.add(second.get(i));  	 	
      }
    }
     
    for(int i = 0; i < second.size(); i++){
    			if(second.get(i) == 1){
      				list.add(first.get(i));  	 	
      }
    }
     return list;
      
    }

		static int numOfPrimes(List<Integer> nodes, List<Integer> values) {
      	int count = 0;
      	for (int i = 0; i < nodes.size(); i++) {
          	if (isPrime(values.get(nodes.get(i)))) {
              	count++;
            }
        }
      	return count;
    }

		static List<Integer> getNodesInSubtree(int parent, int root, List<Integer> first, List<Integer> second) {
      	List<Integer> values = new ArrayList<Integer>();
      
      	List<Integer> children = new ArrayList<Integer>();
      	children.add(root);
      	values.add(root);
      
      	while (children.size() != 0) {
      		for(int i = 0; i < children.size(); i++){
          	List<Integer> nextChildren = new ArrayList<Integer>();
        		List<Integer> tempChildren = getRootChildren(children.get(i), first, second);
          	for(int j = 0; j < tempChildren.size(); j++) {
              if (tempChildren.get(i) != parent) {
          			values.add(tempChildren.get(j));
                nextChildren.add(tempChildren.get(j));
              }
          	}
      		}
        	children = nextChildren;
      	}
      
      	return values;
    }

		static boolean isPrime(int n) {
      	for (int i = 2; i <= math.sqrt(n); i++) {
          	if ((n % i) == 0) {
              	return false;
            }
        }
      	return true;
    }

}
/*
 * 
 * first line
 * n = 10 (10 nodes)
 * 
 * second line
 * m = 9 (9 edges)
 * 
 * next m lines
 * first[i] = {6, 8, 3, 6, 4, 1, 8, 5, 1}
 * 
 * next line
 * m = 9
 * 
 * next m lines
 * second[i] = {9, 9, 5, 7, 8, 8, 10, 8, 2}
 * 
 * next line
 * n = 10
 * 
 * next n lines
 * values[i] = {17, 29, 3, 20, 11, 8, 3, 23, 5, 15}
 * 
 * next line
 * q = 6
 * 
 * next q lines
 * queries[i] = {1, 8, 9, 6, 4, 3}
 * 
 * 
 * EDGES
 * 6 <-> 9
 * 8 <-> 9
 * 3 <-> 5
 * 6 <-> 7
 * 4 <-> 8
 * 1 <-> 8
 * 8 <-> 10
 * 5 <-> 8
 * 1 <-> 2
 * 
 * 
 * 					1
 * 		2						8
 * 					9		4		10		5
 * 					6							3
 * 					7
 * 
 * 
 * 
 * 
 * node values
 * 1  : 17
 * 2  : 29
 * 3  : 3
 * 4  : 20
 * 5  : 11
 * 6  : 8
 * 7  : 3
 * 8  : 23
 * 9  : 5
 * 10 : 15
 * 
 * QUERIES
 * 1. start at node #1 (connected to node #2 and node #8)
 * 			node #1 is 17 (prime)
 * 					node #2 is 29 (prime)
 * 					node #8 is 23 (prime)
 * 							node #4 is 20 (not prime)
 * 							node #5 is 11 (prime)
 * 									node #3 is 3 (prime)
 * 							node #9 is 5 (prime)
 * 									node #6 is 8 (not prime)
 * 									node #7 is 3 (prime)
 * 							node #10 is 15 (not prime)
 * 
 * answer = 7
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */