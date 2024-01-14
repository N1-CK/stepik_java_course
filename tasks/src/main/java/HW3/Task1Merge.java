package HW3;

// Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)
class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 6, 2, 3, 4 };
        arr = mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, mid, right, 0, right.length);
        left = mergeSort(left);
        right = mergeSort(right);
        arr = merge(left, right);
        return arr;
    }

    public static int[] merge(int[] left, int[] right) {

        int[] sortedArr = new int[left.length + right.length];
        int leftCnt = 0;
        int rightCnt = 0;

        while (leftCnt < left.length && rightCnt < right.length) {
            if (left[leftCnt] < right[rightCnt]) {
                sortedArr[leftCnt + rightCnt] = left[leftCnt];
                leftCnt++;
            } else {
                sortedArr[leftCnt + rightCnt] = right[rightCnt];
                rightCnt++;
            }
        }
        while (leftCnt < left.length) {
            sortedArr[leftCnt + rightCnt] = left[leftCnt];
            leftCnt++;
        }

        while (rightCnt < right.length) {
            sortedArr[leftCnt + rightCnt] = right[rightCnt];
            rightCnt++;
        }
        return sortedArr;
    }
}