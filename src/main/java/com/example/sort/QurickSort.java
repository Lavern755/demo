package com.example.sort;

/**
 * @author liwen
 */
public class QurickSort {
    public static void main(String[] args) {
        QurickSort qurickSort = new QurickSort();
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        qurickSort.quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
        // 条件
        if (left > right) {
            return;
        }

        int i = left;
        int j = right;
        // 左为基准,先保存起来
        int leftValue = arr[left];
        while (i != j) {
            // 先移动right
            while (arr[j] >= leftValue && i < j) {
                j--;
            }

            while (arr[i] <= leftValue && i < j) {
                i++;
            }

            if (i < j) {
                swap(arr, i, j);
            }

        }
        // 最终将基准归位，因为上面已经实现交换，所以能满足，在左侧leftValue是最大值，交换left和i的位置
        swap(arr, left, i);

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
