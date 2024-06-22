import java.util.Scanner;

public class Main_BJ_3040_SnowWhite {
	
	static int[] arr;
	static int[] res;
	static int room;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		arr = new int[9];
		res = new int[7];
		room = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
		}
		
		real(0,0);
		scan.close();
	}//main

	private static void real(int cnt, int idx) {
		
		if(cnt == 7) {
//			System.out.println(room);
			if(room == 100) {
				for(int s : res) System.out.println(s);
//				System.out.println(Arrays.toString(res));
				System.exit(0);
			}
			return;
		}
		
		for(int i=idx; i<9; i++) {
			res[cnt] = arr[i];
			room += res[cnt];
			real(cnt+1,i+1);
			room -= res[cnt];
		}
		
		
	}//real
	
	

}
