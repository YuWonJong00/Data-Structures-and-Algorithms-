package DataStructures_Algorithms.sort;

public class MergeSort  {

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            System.out.printf("Divide: left=%d, mid=%d, right=%d\n", left, mid, right);

            // 왼쪽 재귀 호출
            mergeSort(arr, left, mid);

            // 오른쪽 재귀 호출
            mergeSort(arr, mid + 1, right);

            // 병합
            merge(arr, left, mid, right);

            System.out.printf("Merge: left=%d, mid=%d, right=%d → %s\n",
                    left, mid, right, arrayToString(arr, left, right));
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    private String arrayToString(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = start; i <= end; i++) {
            sb.append(arr[i]);
            if (i < end) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 9, 7, 1, 5, 4};

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(arr, 0, arr.length - 1);

        System.out.print("결과: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


