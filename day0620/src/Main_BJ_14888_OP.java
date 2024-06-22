import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_14888_OP {
	
	public static int N;
	public static int []numbers;
	public static int []ops;
	public static int []sen;

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder result = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		numbers = new int[N];
		ops	= new int[4];
		sen = new int[N*2-1];
		
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<4; i++) {
			ops[i] = Integer.parseInt(st.nextToken());
		}
		

	}//main
	
	private static void go() {
		
	}

}
