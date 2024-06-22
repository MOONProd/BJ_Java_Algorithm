import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BJ_2798_BLACKJAK {
	
	static int N;
	static int M;
	static int []arr;
	static int []rel;
	static int DAP;
	static StringBuilder result;
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		result = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		rel = new int[3];
		
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		thr(0,0);
		result.append(DAP);
		System.out.println(result);
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(0));

	}//main

	private static void thr(int cnt, int idx) {
		if(cnt == 3) {
			if(rel[0]+rel[1]+rel[2] <= M) {
				DAP = Math.max(DAP, rel[0]+rel[1]+rel[2]);
			}
			return;
		}
		for(int i=idx; i<N; i++) {
			rel[cnt] = arr[i];
			thr(cnt+1,i+1);
		}
		
	}
	
	

}
