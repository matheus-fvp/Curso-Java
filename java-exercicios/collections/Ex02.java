import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for(int i = 0; i < q; i++) {
            String query = sc.next();
            if(query.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            }else {
                int x = sc.nextInt();
                list.remove(x);
            }
        }

        System.out.println(list);
        list.stream().forEach(i -> System.out.println(i));

        sc.close();
    }
}
