import java.util.Arrays;
import java.util.Scanner;

public class Main_BJ_15649_NnM {
	
	static int N,M;
	static int []arr;
	static int []answer;
	static boolean []selected;
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		arr = new int[N];
		answer = new int[M];
		selected  = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
//			System.out.println(arr[i]);
		}
		cando(0);
		scan.close();
	}//main
	
	private static void cando(int num) {
		
		if(num == M) {
			System.out.println(Arrays.toString(answer).replace("[", "").replace("]", "").replace(",", ""));
			return;
		}
		
		for(int i=0; i<N; i++) {
			
			if(!selected[i]) {
				selected[i] = true;
				answer[num] = arr[i];
				cando(num+1);
				selected[i] = false;
			}
		}
		
	}//cando

}
