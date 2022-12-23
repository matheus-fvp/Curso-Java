import java.util.Scanner;
import java.util.Stack;

public class Ex03 {
    public static boolean canWin(int leap, int[] game) {
        boolean result = true;
        Stack<Integer> indexs = new Stack<>();
        boolean[] visited = new boolean[game.length];
        indexs.push(0);
        while(!indexs.isEmpty()) {
            int i = indexs.peek();
            if(i + 1 >= game.length || i + leap >= game.length) {
                result = true;
                break;
            }else if(!visited[i + 1] && game[i+1] == 0) {
                i++;
                indexs.push(i);
                visited[i] = true;
            }else if(!visited[i+leap] && game[i+leap] == 0) {
                i += leap;
                indexs.push(i);
                visited[i] = true;
            }else if(i - 1 >= 0 && !visited[i-1] && game[i-1] == 0) {
                i--;
                indexs.push(i);
                visited[i] = true;
            }else {
                result = false;
                indexs.pop();
            }
            
        }

        return result;
              
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
