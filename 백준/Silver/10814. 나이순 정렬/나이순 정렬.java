import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        List<User> userList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            userList.add(new User(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        Collections.sort(userList);

        for (User user : userList) {
            System.out.println(user.getAge() + " " + user.getName());
        }
    }

}

class User implements Comparable<User> {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(User user) {
        int comparison = this.age - user.getAge();
//        if (comparison == 0) {
//            return this.name.compareTo(user.getName());
//        }
        return comparison;
    }
}
