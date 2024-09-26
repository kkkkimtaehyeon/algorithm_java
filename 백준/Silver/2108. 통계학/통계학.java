import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int average(int[] arr) {
        double sum = 0;

        for (int n : arr) {
            sum += n;
        }

        double n = arr.length;

        return (int) Math.round(sum / n);
    }

    public static int mid(int[] arr) {
        return arr[arr.length / 2];
    }

    public static int frequency(int[] arr, HashMap<Integer, Integer> map) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }

        ArrayList<Counter> list = new ArrayList<>();
        for (int n : set) {
            list.add(new Counter(n, map.get(n)));
        }

        Collections.sort(list);

        int maxCount = list.get(0).count;

        if (list.size() > 1 && list.get(1).count == maxCount) {
            return list.get(1).num;
        }
        return list.get(0).num;
    }

    public static int range(int[] arr) {
        return arr[arr.length - 1] - arr[0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer count;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if ((count = map.get(arr[i])) != null) {
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Arrays.sort(arr);

        System.out.println(average(arr));
        System.out.println(mid(arr));
        System.out.println(frequency(arr, map));
        System.out.println(range(arr));


    }
}

class Counter implements Comparable<Counter> {
    int num;
    int count;

    public Counter(int num, int count) {
        this.num = num;
        this.count = count;
    }


    @Override
    public int compareTo(Counter o) {
        int comparison = o.count - this.count;
        if (comparison == 0) {
            return this.num - o.num;
        }
        return comparison;
    }
}