//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main_BJ_11659_SUM {
//
//	public static void main(String[] args) throws Exception {
//		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		int []arr = new int[N+1];
//		
//		st = new StringTokenizer(bf.readLine());
//		for(int i=1; i<=N; i++) {
//			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken()); //N+1 배열이라 i-1부터 누적해서 누적합 배열 저장 
//		}
//		
//		StringBuilder result = new StringBuilder();
//		for(int i=0; i<M; i++) {
//			st = new StringTokenizer(bf.readLine());
//			int I = Integer.parseInt(st.nextToken());
//			int J = Integer.parseInt(st.nextToken());
//			
//			result.append(arr[J]-arr[I-1]).append('\n');
//		}
//		System.out.println(result);
//		
//
//
//	}//main
//
//}

// ====================================================================
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_11659_SUM {
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
 		
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
//			System.out.println(arr[i]);
		}
		
		for(int i=1; i<=N; i++) {
			dp[i] = arr[i-1];
			arr[i] = dp[i]+arr[i];
//			System.out.println(dp[i]);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(int i=1; i<=M; i++) {
			st = new StringTokenizer(bf.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			result.append(dp[J]-dp[I-1]).append('\n');
		}
		System.out.println(result);
		
		

	}//main
}