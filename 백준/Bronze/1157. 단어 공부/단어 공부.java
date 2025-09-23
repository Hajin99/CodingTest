import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase(); // 입력을 모두 대문자로 변환
        int[] count = new int[26];              // A~Z 알파벳 개수 저장 배열

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'A']++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < 26; i++) {
            if(count[i] > max) {
                max = count[i];
                result = (char)(i + 'A');
            }
            else if(count[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
