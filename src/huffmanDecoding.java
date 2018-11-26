import java.util.*;
 
abstract class Node implements Comparable<Node> {
    
  	public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right; 
    public Node(int freq) { 
    	frequency = freq;
   	}
 
    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
  
}
 
class HuffmanLeaf extends Node {
    
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
  
}
 
class HuffmanNode extends Node {
    
    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}


class Decoding {

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

    void decode(String s, Node root) {
       StringBuilder output = new StringBuilder();
       Node base = root;

    while(!s.isEmpty()){
        if(s.charAt(0) == '1'){
            base = base.right;
            s = s.substring(1);
        }
        else{
            base = base.left;
            s = s.substring(1);
        }

        if(base.left == null && base.right == null){
            output.append(base.data);
            base = root;
        }
    }

    System.out.println(output.toString());
    }

