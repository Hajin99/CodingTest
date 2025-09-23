import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int i = Integer.parseInt(s);
        int N = Integer.parseInt(s);

        int cycles = 0;

        while(true) {
            int A = N/10;
            int B = N%10;

            N = B*10 + ((A+B)%10);
            cycles++;
            if(i==N)
                break;
        }
        System.out.println(cycles);
    }
}
