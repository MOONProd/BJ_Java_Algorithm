/*
5
667767
054060
101123
123123
777777
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BabyGinTest {
	
	static int N = 6; //요소 개수 
	static int[] numbers; //실행 중 입력 
	static int[] ans; //생성된 순열을 저장 
	static boolean[] selected; //뽑은 수는 다시 뽑지 않음 => 중복제거 
	
	
	public static void main(String[] args) throws Exception {		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		ans = new int[N];
		selected = new boolean[N];
		numbers = new int[N];
		//667767 => 문자열임 String => {'6', '6', '7', '7', '6', '7'} => {6,6,7,7,6,7}
		Permu(0);
		
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean flag = Permu(0);
		if(flag)
			System.out.println("Baby-Gin");
		else
			System.out.println("Not Baby-Gin");

	}//main

	//연속된 3개의 수 즉, run인지 검사!!!
	static boolean run(int[] cards) {
//		if(cards[2] == cards[1]+1 && cards[1] == cards[0]+1)
//			return (cards[2] == cards[1]+1 && cards[1] == cards[0]+1);
		return cards[2] == cards[1]+1 && cards[1] == cards[0]+1;
	}
	//동일한 3개의 수 즉, triplelet인지 검사!!
	static boolean triple(int[] cards) {
//		if(cards[2] == cards[1] && cards[1] == cards[0])
//			return (cards[2] == cards[1]+1 && cards[1] == cards[0]+1);
		return cards[2] == cards[1] && cards[1] == cards[0];
	}
	//뭐가 순열 배열
	static boolean isBabyGin() {
		int[] leftCards = new int[] {ans[0], ans[1],ans[2]}; //좌측 카드 
		int[] rightCards = new int[] {ans[3], ans[4],ans[5]}; //우측 카드 
		
		return (run(leftCards) || triple(leftCards) && (run(rightCards) || (run(leftCards))));
		
	}
	
	//순열을 뽑는 함수 
	private static boolean Permu(int num) {
		
		if(num==N) { //순열의 조합이 끝났다면 
//			isBabyGin();
//			return true;
			if(isBabyGin()) return true;
		}
		
		for(int i=0; i<N; i++) {
			if(!selected[i]) {
				selected[i] = true; //선택체크 
				ans[num] = numbers[i];
				if(Permu(num+1)) return true;
				selected[i] = false;
			}
		}
		return false; //기본값 
		
			
	}//Permu
}
