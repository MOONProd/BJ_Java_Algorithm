import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//import java.util.Scanner;

public class Main_BJ_15651_NnM3 {
	
	static int N;
	static int M;
	static int []arr;
	static int []answer;
	static StringBuilder sb;
//	static boolean []selected;

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		answer = new int[M];
		sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		NnM(0);
		System.out.println(sb);
	}//main
	
	private static void NnM(int num) {
		if(num==M) {
//			System.out.println(Arrays.toString(answer).replace("[", "").replace("]","").replace(",", ""));
			sb.append(Arrays.toString(answer).replace("[", "").replace("]","").replace(",", "")).append('\n');
			return;
		}
		
		for(int i=0; i<N; i++) {
			answer[num] = arr[i];
			NnM(num+1);
		}
	}

}
