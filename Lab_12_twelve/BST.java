import java.util.ArrayDeque;


//"http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html"

public class BST<T extends Comparable<T>> implements BSTInterface<T> {

    private class Node<T> {
        private T data;
        private Node<T> left, right;

        public Node(T data, Node<T> l, Node<T> r) {
            left = l;
            right = r;
            this.data = data;
        }

        public Node(T data) {
            this(data, null, null);
        }

        /**
         * recursive depth-first PreOrder traversal
         */
        public void DFS_PreOrder_Display() {

            System.out.print(this.data + " ");

            if (this.left != null) {
                this.left.DFS_PreOrder_Display();
            }

            if (this.right != null) {
                this.right.DFS_PreOrder_Display();
            }
        }

        /**
         * recursive depth-first InOrder traversal
         */
        public void DFS_InOrder_Display() {

            if (this.left != null) {
                this.left.DFS_InOrder_Display();
            }

//            System.out.print(this.data + " ");
            System.out.println(this.data);

            if (this.right != null) {
                this.right.DFS_InOrder_Display();
            }
        }

        /**
         * recursive depth-first PostOrder traversal
         */
        public void DFS_PostOrder_Display() {

            if (this.left != null) {
                this.left.DFS_PostOrder_Display();
            }

            if (this.right != null) {
                this.right.DFS_PostOrder_Display();
            }

            System.out.print(this.data + " ");
        }
    }

    private Node<T> root;


    public BST() {
        root = null;
    }

    @Override
    public boolean search(T toSearch) {
        return search(root, toSearch);
    }

    private boolean search(Node<T> p, T toSearch) {
        if (p == null)
            return false;
        else if (toSearch.compareTo(p.data) == 0)
            return true;
        else if (toSearch.compareTo(p.data) < 0)
            return search(p.left, toSearch);
        else
            return search(p.right, toSearch);
    }

    @Override
    public void insert(T toInsert) {
        root = insert(root, toInsert);
    }

    private Node<T> insert(Node<T> p, T toInsert) {
        if (p == null)
            return new Node<T>(toInsert);

        if (toInsert.compareTo(p.data) == 0)
            return p;

        if (toInsert.compareTo(p.data) < 0)
            p.left = insert(p.left, toInsert);
        else
            p.right = insert(p.right, toInsert);

        return p;
    }

    @Override
    public void delete(T toDelete) {
        root = delete(root, toDelete);
    }

    private Node<T> delete(Node<T> p, T toDelete) {
        if (p == null)
            throw new RuntimeException("cannot delete.");
        else if (toDelete.compareTo(p.data) < 0)
            p.left = delete(p.left, toDelete);
        else if (toDelete.compareTo(p.data) > 0)
            p.right = delete(p.right, toDelete);
        else {
            if (p.left == null)
                return p.right;
            else if (p.right == null)
                return p.left;
            else {
                p.data = retrieveData(p.left);
                p.left = delete(p.left, p.data);
            }
        }
        return p;
    }

    private T retrieveData(Node<T> p) {
        while (p.right != null)
            p = p.right;

        return p.data;
    }

    public void DFS_PreOrder_Display() {
        this.root.DFS_PreOrder_Display();
        System.out.println();
    }

    public void DFS_InOrder_Display() {
        this.root.DFS_InOrder_Display();
        System.out.println();
    }

    public void DFS_PostOrder_Display() {
        this.root.DFS_PostOrder_Display();
        System.out.println();
    }


    public void BFS_LevelOder_Display() {

        if (root == null) {
            System.out.println("empty tree");
            return;
        }

        ArrayDeque<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> node = queue.remove();
            System.out.println(node.data);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }
//        System.out.print("==>");
    }
}