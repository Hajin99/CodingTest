// 백준 2292번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int a = 1; // 루틴 시작작값
        int i = 1; // 방문 확인 수

        while(n>a){ // 범위를 넘어가기 직전까지 반복.
            a=a+6*i;
            i++;
        }
        if (n==0)
            System.out.println("그럴 수는 없음.");
        System.out.println(i); // 방문한 수
    }
}