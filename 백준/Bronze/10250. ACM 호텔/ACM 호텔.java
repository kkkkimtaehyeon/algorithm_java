import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Integer> room = new ArrayList<Integer>();
        for(int i = 0; i < T; i++){
            room.clear();
            int _floor = sc.nextInt();
            int _ho = sc.nextInt();
            int n = sc.nextInt();
            int floor = n % _floor;
            int ho = (int) Math.ceil( (double) n /_floor);
            if(floor == 0){
                floor = _floor;
            }
            room.add(floor);
            if(ho <= 9){
                room.add(0);
            }
            room.add(ho);

            for(Object roomNumber: room){
                System.out.print(roomNumber);
            }
            System.out.print("\n");
        }


    }
}