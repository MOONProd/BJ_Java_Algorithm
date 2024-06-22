import java.util.Arrays;
import java.util.Scanner;

public class DiceTest {
	
	static int N, numbers[]; //N: 주사위 던지는 수, numbers: 던져진 주사위 수들(?)
	static boolean []isSelected; //이전에 선택했던 값인지 체크 

	public static void main(String[] args) throws Exception {
		
		//입력으로 주사위 던지는 횟수, 주사위 던지기 모드 (1,2,3,4) 
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt(); // 주사위 던지는 횟수 (0<N<7)
		int M = scan.nextInt(); // 주사위 던지기 모드 
		numbers = new int[N]; // 결과값 받아오기 
		isSelected = new boolean[7]; //6개의 수에 대한 중복(선택)확인 
		
		switch(M) {
			case 1: { //중복순열 
				dice1(0);
			}break;
			case 2: { //일반순열 
				dice2(0);
			}break;
			case 3: {
				dice3(0,1);
			}break;
			case 4: {
				dice4(0,1);
			}break;
		}
		
		scan.close();
	}//main


	private static void dice1(int cnt) { //6*6*6 - 중복순열 
		
		//끝마칠 조건(수의 조합이 끝났어요~) 
		if(cnt == N) { //원하는 만큼 주사위를 던졌다면 => 숫자 조합이 완성 되었다면 
			System.out.println(Arrays.toString(numbers));
			return;
		}
		//=======================
		//공통적 반복문
		for(int i=1; i<=6; i++) {//무슨 데이터를 뽑을 건지 
			
			numbers[cnt] = i; //순열/조합저장변수 = 데이터; 
			dice1(cnt+1);
		} //복붙 복붙 복붙 머라고 햇는뎅..
	}
	
	private static void dice2(int cnt) { // 6*5*4 - 일반순열 
		
		//끝마칠 조건(수의 조합이 끝났어요~) 
				if(cnt == N) { //원하는 만큼 주사위를 던졌다면 => 숫자 조합이 완성 되었다면 
					System.out.println(Arrays.toString(numbers));
					return;
				}
				//=======================
				//공통적 반복문
				for(int i=1; i<=6; i++) {//무슨 데이터를 뽑을 건지 
					if(!isSelected[i]) { //아직 선택되지 않은 수라면 
						numbers[cnt] = i; //순열/조합저장변수 = 데이터;  //수를 선택 
						isSelected[i] = true;
						dice2(cnt+1);
						isSelected[i] = false; //생성되어진 순열 숫자의 사용이 끝났다면 다시 false로 
					}
				} //기본 중복순열에서 복붙 복붙 복붙 필요한 조건들을 추가시켜서 구현할 수 있다. 
		
	}
	
	private static void dice3(int cnt,int idx) { //idx: 시작 주사위눈의 수 // 중복조합 
		
		//끝마칠 조건(수의 조합이 끝났어요~) 
		if(cnt == N) { //원하는 만큼 주사위를 던졌다면 => 숫자 조합이 완성 되었다면 
			System.out.println(Arrays.toString(numbers));
			return;
		}
		//=======================
		//공통적 반복문
		for(int i=idx; i<=6; i++) {
			numbers[cnt] = i;
			dice3(cnt+1,i);
		}
		
		//기본 중복순열에서 복붙 복붙 복붙 필요한 조건들을 추가시켜서 구현할 수 있다. 
		
	}
	
	private static void dice4(int cnt, int idx) {
		//끝마칠 조건(수의 조합이 끝났어요~) 
				if(cnt == N) { //원하는 만큼 주사위를 던졌다면 => 숫자 조합이 완성 되었다면 
					System.out.println(Arrays.toString(numbers));
					return;
				}
				//=======================
				//공통적 반복문
				for(int i=idx; i<=6; i++) {
					numbers[cnt] = i;
					dice3(cnt+1,i+1);
				}
				
				//기본 중복순열에서 복붙 복붙 복붙 필요한 조건들을 추가시켜서 구현할 수 있다. 
		
	}
}
