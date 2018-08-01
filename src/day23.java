import java.util.*;
import java.io.*;

public class day23 {
	static void levelOrder(Node root){
	      
	    Queue<Node> queue = new LinkedList<>();
	    
	    if(root == null){
	        return;
	    }
	    queue.add(root);
	    while(!queue.isEmpty()){
	        Node node = queue.remove();
	        System.out.print(node.data + " ");

	            if (node.left != null) {
	                queue.add(node.left);
	            }
	            if (node.right != null) {
	                queue.add(node.right);
	            }

	    }
	    
	    }
}
