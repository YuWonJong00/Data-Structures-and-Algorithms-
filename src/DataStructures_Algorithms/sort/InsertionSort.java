package DataStructures_Algorithms.sort;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) {
            int key = list[i];  // 현재 삽입할 값
            int j = i - 1;

            // 앞쪽 정렬된 부분에서 key보다 큰 값은 오른쪽으로 밀기
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // key를 올바른 위치에 삽입
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 4};

        System.out.println("정렬 전:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("정렬 후:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
