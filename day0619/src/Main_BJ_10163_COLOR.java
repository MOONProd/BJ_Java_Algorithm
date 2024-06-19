
import java.util.Scanner;

public class Main_BJ_10163_COLOR {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count[] = new int[N+1];
		int arr[][] = new int[1001][1001]; 
		
		for(int i=1; i<=N; i++) {
			
			int sa = scan.nextInt();
			int sb = scan.nextInt();
			int w = scan.nextInt();
			int h = scan.nextInt();
			
			for(int x=sa; x<(sa+w); x++) {
				for(int y=sb; y<(sb+h); y++) {
					arr[x][y] = i; //색종이 차례대로 1, 2, 3, .... ,N 으로 면적 채워넣기 
				}
			}
		}
		for(int i=0; i<1001; i++) {//색종이가 덮고 있는 면적 계산 
			for(int j=0; j<1001; j++) {
				count[arr[i][j]]++; //이게 무슨 의미지... 아!! 숫자가 1인경우를 모아서 새 배열 해당 index에 카운트 ++ 
			}
		}
		
		for(int i=1; i<=N; i++) //각 색종이의 면적 계산 1로 덮혀있는거 세고.. 2로 덮혀있는거 세고... 
		{
			System.out.println(count[i]);
		}
		
		scan.close();
	}//main

}
