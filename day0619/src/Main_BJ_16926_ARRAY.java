import java.util.Arrays;
import java.util.Scanner;

public class Main_BJ_16926_ARRAY {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[2];
		
		for(int i=0; i<2; i++) {
			arr[i] = scan.nextInt();
		}
		int R = scan.nextInt();
		int A[][] = new int[arr[0]][arr[1]];
		
		for(int i=0; i<arr[0]; i++) {
			for(int j=0; j<arr[1]; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		
		

		
		scan.close();
	}//main

}
