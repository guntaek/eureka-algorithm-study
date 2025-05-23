import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14360 KB , 시간 : 104ms

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		dp[1] = 1;
		if (N > 1) {dp[2] = 2;}
		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i-1]+dp[i-2]) % 10007;
		}
		System.out.println(dp[N]);
		
	}

}