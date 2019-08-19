
// A binary tree node 
class Node { 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
   
class TreeHeight{ 

    Node root; 
   
    int maxDepth(Node node){ 
        if (node == null) 
            return 0; 

        else{
            
            int lDepth = maxDepth(node.left); //gotta love recursion
            int rDepth = maxDepth(node.right); 
            
            if (lDepth > rDepth)
                return (lDepth + 1); 
            
             else 
                return (rDepth + 1); 
        } 
    } 
       
    public static void main(String[] args) { 
        TreeHeight tree = new TreeHeight(); 
   
        tree.root = new Node(3); 
        tree.root.left = new Node(9); 
        tree.root.right = new Node(20); 
        tree.root.right.left = new Node(15); 
        tree.root.right.right = new Node(7); 
   
        System.out.println("Height of tree is : " + tree.maxDepth(tree.root)); 
    } 
} 