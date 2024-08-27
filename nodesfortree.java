import java.util.*;
public class nodesfortree{
    public static int nodedepts(Binarytree root){
        if(root==null)
        return -1;

        int left = nodedepts(root.left);
        int right = nodedepts(root.right);

        return Math.max(left,right) +1;
    }
    static class Binarytree{
        int value;
        Binarytree left;
        Binarytree right;

        public Binarytree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }
    public static Binarytree buildtree(int[] nodes){
        if(nodes.length==0)
        return null;

        Binarytree root = new Binarytree(nodes[0]);
        Binarytree[] treeNodes = new Binarytree[nodes.length];
        treeNodes[0] = root;
        for(int i=1;i<nodes.length;i++){
            if(nodes[i] != -1){
                Binarytree newnode = new Binarytree(nodes[i]);
                treeNodes[i] = newnode;
                if(i % 2 == 1){
                    treeNodes[(i-1)/2].left = newnode;

                }
                else{
                    treeNodes[(i-2)/2].right = newnode;
                }
            }
        }
        return root;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        System.out.println("provide the numbers of nodes");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("provide the nodes values");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        Binarytree root = buildtree(arr);
        int dept = nodedepts(root);
        System.out.println("the height of the tree is "+ dept);
        sc.close();
    }
}