import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        String userInput;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++){
            userInput = bf.readLine();
            operation(userInput, deque);

        }



    }
    public static void operation(String userInput, Deque<Integer> deque){
        String[] input = new String[2];
        input = userInput.split(" ");

        switch (input[0]){
            case "push_back":
                deque.addLast(Integer.parseInt(input[1]));
                break;
            case "push_front":
                deque.addFirst(Integer.parseInt(input[1]));
                break;
            case "pop_front":
                if(deque.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(deque.pollFirst());
                }
                break;
            case "pop_back":
                if(deque.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(deque.pollLast());
                }
                break;
            case "size":
                System.out.println(deque.size());
                break;
            case "empty":
                if(deque.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                break;
            case "front":
                if(deque.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(deque.getFirst());
                }
                break;
            case "back":
                if(deque.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(deque.getLast());
                }
                break;

        }
    }
}
