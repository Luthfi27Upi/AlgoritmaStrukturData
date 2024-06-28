
public class BinaryTree17 {

    Node17 root;

    public BinaryTree17() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node17(data);
        } else {
            Node17 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node17(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node17(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node17 current = root;

        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return result;
    }

    void traversePreOrder(Node17 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node17 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node17 getSuccessor(Node17 del) {
        Node17 successor = del.right;
        Node17 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node17 successor = getSuccessor(current);
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }

    // Latihan Praktikum

    void addRecursively(int data) {
        root = addRecursively(root, data);
    }

    Node17 addRecursively(Node17 current, int data) {
        if (current == null) {
            return root = new Node17(data);
        }

        if (data < current.data) {
            current.left = addRecursively(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursively(current.right, data);
        }

        return current;
    }

    void findMaxMin() {
        int min = findMin();
        int max = findMax();

        System.out.println("Nilai terkecil yang ada di dalam tree : " + min);
        System.out.println("Nilai terbesar yang ada di dalam tree : " + max);
    }

    int findMin() {
        Node17 current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    int findMax() {
        Node17 current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    void printLeaves(Node17 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }

            printLeaves(node.left);
            printLeaves(node.right);
        }
    }

    int countLeaves(Node17 node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return countLeaves(node.left) + countLeaves(node.right);
    }

    void countLeaves() {
        System.out.println("Jumlah leaf dalam tree = " + countLeaves(root));
    }
}