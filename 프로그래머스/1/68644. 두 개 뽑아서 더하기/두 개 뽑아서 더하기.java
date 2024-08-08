import java.util.*;
class Solution {
    public void merge(int[] arr, int low, int mid, int high) {
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
            arr[low + idx] = temp[idx--];
        }
    }
    public void mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i; j < numbers.length; j++) {
                if(i == j) {
                    continue;
                }
                set.add(numbers[i]+numbers[j]);
            }
        }

        int[] arr = new int[set.size()];

        Iterator<Integer> iterSet = set.iterator();
        ArrayList<Integer> list = new ArrayList<>();
        while(iterSet.hasNext()) {
            list.add(iterSet.next());
        }

        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        mergeSort(arr, 0, arr.length-1);

        return arr;
    }
}