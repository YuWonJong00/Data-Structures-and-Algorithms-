package DataStructures_Algorithms.tree;

public class ArrayBinaryTree {
    private int[] tree;
    private int size;

    public static void main(String[] args) {
        ArrayBinaryTree sample=new ArrayBinaryTree(8);
        sample.add(4);
        sample.add(3);
        sample.add(7);
        sample.add(2);
        sample.add(1);
        sample.add(5);
        sample.add(5);
        sample.add(2);
        sample.printStructure();

    }

    public ArrayBinaryTree(int capacity) {
        tree = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size >= tree.length) {
            throw new IllegalStateException("Tree is full");
        }
        tree[size++] = value;
    }

    public void printTree() {
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + tree[i]);
        }
    }

    // 부모, 왼쪽 자식, 오른쪽 자식 인덱스 접근
    public int getLeftChild(int index) {
        int leftIndex = 2 * index + 1;
        return (leftIndex < size) ? tree[leftIndex] : -1;
    }

    public int getRightChild(int index) {
        int rightIndex = 2 * index + 2;
        return (rightIndex < size) ? tree[rightIndex] : -1;
    }

    public int getParent(int index) {
        if (index == 0) return -1;
        return tree[(index - 1) / 2];
    }
    public void printStructure() {
        for (int i = 0; i < size; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            System.out.print("Node " + tree[i] + ": ");
            if (left < size) System.out.print("Left=" + tree[left] + " ");
            if (right < size) System.out.print("Right=" + tree[right]);
            System.out.println();
        }
    }
}
