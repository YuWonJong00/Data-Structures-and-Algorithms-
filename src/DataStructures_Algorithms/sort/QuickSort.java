package DataStructures_Algorithms.sort;

public class QuickSort {


        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high); // 피벗 기준으로 분할
                quickSort(arr, low, pivotIndex - 1);  // 왼쪽 부분 재귀 정렬
                quickSort(arr, pivotIndex + 1, high); // 오른쪽 부분 재귀 정렬
            }
        }

        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; // 마지막 원소를 피벗으로 선택
            int i = low - 1;       // 작은 원소들의 끝 인덱스

            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }



            // 피벗을 정렬된 위치로 이동
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1; // 피벗 인덱스 반환
        }

        // 테스트용 main 메서드
        public static void main(String[] args) {
            int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
            quickSort(arr, 0, arr.length - 1);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


