import java.util.*;

public class lowestcommonancestor {
    public static int nodeDepths(BinaryTree root) {
        if (root == null)
            return -1;

        int left = nodeDepths(root.left);
        int right = nodeDepths(root.right);

        return Math.max(left, right) + 1;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static BinaryTree buildTree(int[] nodes) {
        if (nodes.length == 0)
            return null;

        BinaryTree root = new BinaryTree(nodes[0]);
        BinaryTree[] treeNodes = new BinaryTree[nodes.length];
        treeNodes[0] = root;
        for (int i = 1; i < nodes.length; i++) {
            if (nodes[i] != -1) {
                BinaryTree newNode = new BinaryTree(nodes[i]);
                treeNodes[i] = newNode;
                if (i % 2 == 1) {
                    treeNodes[(i - 1) / 2].left = newNode;
                } else {
                    treeNodes[(i - 2) / 2].right = newNode;
                }
            }
        }
        return root;
    }

    public static boolean nodeToRootPath_(BinaryTree root, int data, ArrayList<BinaryTree> ans) {
        if (root == null)
            return false;

        if (root.value == data) {
            ans.add(root);
            return true;
        }

        boolean res = nodeToRootPath_(root.left, data, ans) || nodeToRootPath_(root.right, data, ans);
        if (res)
            ans.add(root);
        return res;
    }

    public static BinaryTree lowestCommonAncestor(BinaryTree root, BinaryTree p, BinaryTree q) {
        ArrayList<BinaryTree> l1 = new ArrayList<>();
        nodeToRootPath_(root, p.value, l1);

        ArrayList<BinaryTree> l2 = new ArrayList<>();
        nodeToRootPath_(root, q.value, l2);

        int i = l1.size() - 1, j = l2.size() - 1;

        BinaryTree ans = null;
        while (i >= 0 && j >= 0) {
            if (l1.get(i--) != l2.get(j--))
                break;

            ans = l1.get(i + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide the number of nodes:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Provide the node values (use -1 for null nodes):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BinaryTree root = buildTree(arr);

        System.out.println("Enter the values of two nodes to find their LCA:");
        int pVal = sc.nextInt();
        int qVal = sc.nextInt();

        BinaryTree p = new BinaryTree(pVal);
        BinaryTree q = new BinaryTree(qVal);

        BinaryTree lca = lowestCommonAncestor(root, p, q);

        if (lca != null) {
            System.out.println("The lowest common ancestor of " + pVal + " and " + qVal + " is: " + lca.value);
        } else {
            System.out.println("One or both nodes are not present in the tree.");
        }

        sc.close();
    }
}
