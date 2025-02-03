import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 주어진 수 N개 중에 소수가 몇 개인지 찾아서 출력하는 프로그램
    // 첫 줄에 100이하로 수의 개수 N이 주어짐. 다음으로 N개의 수가 주어짐. 주어진 수는 1000이하임.
    private int count=0;

    public static void main(String [] args) throws IOException{
        Main prime = new Main();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String s = bf.readLine();

        StringTokenizer st = new StringTokenizer(s); // N개만큼 쪼개기

        for(int i=0; i<N; i++ ){
            int number = Integer.parseInt(st.nextToken()); //numbers 배열에 수 넣기
            if(prime.isPrime(number)==1)
                prime.count++;
        }

        System.out.println(prime.count);
    }

    int isPrime(int number){
        if(number==1)
            return 0;
        for(int i=2; i<number; i++){
            if(number%i==0)
                return 0;
        }
        return 1;
    }

    
}
