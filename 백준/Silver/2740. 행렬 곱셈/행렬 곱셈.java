import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 행렬 A 입력
        int N = scanner.nextInt(); // A의 행 개수
        int M = scanner.nextInt(); // A의 열 개수
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 행렬 B 입력
        int M2 = scanner.nextInt(); // B의 행 개수 (A의 열 개수와 동일)
        int K = scanner.nextInt(); // B의 열 개수
        int[][] B = new int[M2][K];

        for (int i = 0; i < M2; i++) {
            for (int j = 0; j < K; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 결과 행렬 C 초기화
        int[][] C = new int[N][K];

        // 행렬 곱셈 수행
        for (int i = 0; i < N; i++) { // 행렬 A의 행
            for (int j = 0; j < K; j++) { // 행렬 B의 열
                for (int k = 0; k < M; k++) { // 공통 차원 M
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
