//Avanish Mishra
// Hackerrank

public class day22 {
	public static int getHeight(Node root){
		      if(root == null)
	
	          return -1;
	
	        int left = getHeight(root.left);
	
	        int right = getHeight(root.right);
	
	        
	// Find the max of either the left root side or the right side of the root and then go ahead.
	        return Math.max(left, right) + 1;
	
	        
	
	    }
	
}
