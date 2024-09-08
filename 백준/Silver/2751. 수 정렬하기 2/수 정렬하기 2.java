import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int index = 0;

        while(left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            }
            else {
                temp[index++] = arr[right++];
            }
        }

        while(left <= mid) {
            temp[index++] = arr[left++];
        }

        while(right <= high) {
            temp[index++] = arr[right++];
        }

        index--;
        while(index >= 0) {
            arr[low + index] = temp[index--];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //mergeSort(arr, 0, arr.length - 1);
        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }
}
