import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int A = Integer.parseInt(line);

        line = br.readLine();
        int B = Integer.parseInt(line);

        System.out.println(A+B);
    }
}