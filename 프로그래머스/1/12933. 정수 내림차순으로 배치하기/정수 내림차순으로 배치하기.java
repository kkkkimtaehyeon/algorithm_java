class Solution {
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int idx = 0;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            }
            else {
                temp[idx++] = arr[right++];
            }
        }

        while(left <= mid) {
            temp[idx++] = arr[left++];
        }
        while(right <= high) {
            temp[idx++] = arr[right++];
        }

        idx--;
        while(idx >= 0) {
            arr[low + idx] = temp[idx];
            idx--;
        }
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    
    public long solution(long n) {
        String stringN = String.valueOf(n);
        int[] arr = new int[stringN.length()];

        for(int i = 0; i < stringN.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(stringN.charAt(i)));
        }

        StringBuilder sb = new StringBuilder();
        mergeSort(arr, 0, arr.length-1);
        for(int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.toString());
    }
}