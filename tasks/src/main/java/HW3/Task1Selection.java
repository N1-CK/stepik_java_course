package HW3;

// Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)
class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] sorted_arr = selectionSort(arr);
        for (int i : sorted_arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }

}
