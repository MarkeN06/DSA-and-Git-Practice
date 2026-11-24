package tree;


import com.sun.source.tree.Tree;

public class BinaryTree {
    public TreeNode root;

    public void insert(int data){
        TreeNode newNode= new TreeNode(data,null,null);
        if(root == null){
            root=newNode;
            return;
        }
        TreeNode temp=root;
        while (true){
            if(temp.val==data)
                return;

            if(temp.val > data){
                if(temp.left == null) {
                    temp.left = newNode;
                    return;
                }
                temp=temp.left;

            }
            else{
                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                }
                temp=temp.right;
            }
        }
    }

    public BinaryTree(int[] niz){
        for (int n : niz){
            insert(n);
        }
    }

    public void print(){
        inOrder(root);
        System.out.println();

    }

    private void inOrder(TreeNode root){
        if(root==null)
            return;

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }


    public int maxDepth(TreeNode root){
        if(root==null)
            return  0;

        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
