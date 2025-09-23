import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String left = br.readLine();
        String right = new StringBuilder(left).reverse().toString();

        while(true){
            if (left.equals(right)) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
            left = br.readLine();
            right = new StringBuilder(left).reverse().toString();
            if(left.equals("0"))
                break;
        }

    }
}
