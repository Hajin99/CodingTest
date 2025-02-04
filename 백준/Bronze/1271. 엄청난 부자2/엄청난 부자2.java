import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        try{

            BigInteger n = new BigInteger(st.nextToken());
            BigInteger m = new BigInteger(st.nextToken());
          
            BigInteger [] result = n.divideAndRemainder(m);
            System.out.println(result[0]);
            System.out.println(result[1]);

        } catch (NumberFormatException e){
            System.out.println("숫자를 입력하세요.");
        }
    }
}
