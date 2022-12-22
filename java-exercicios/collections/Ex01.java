import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ex01
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<List<Integer>> lines = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            lines.add(row);
        }
         
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            try {
                List<Integer> row = lines.get(x);
                System.out.println(row.get(y));
            }catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
    
}