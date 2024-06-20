
public class RecurTest {

	static int arr[] = {10,20,30};
	
	private static void printArray(int n) { //재귀함수 (자신의 메서드를 다시 호출) 
		if(n>=arr.length) //n이 배열의 길이와 같으면 return;
			return; //void의 }로 이동. 
		System.out.println(arr[n]); //배열 원소에서 n index 출력 
		printArray(n+1); //index값 +1해서자신 호출 
	}
	public static void main(String[] args) {
		printArray(0); //0으로 넣고 +1씩 해서 재귀 
	}

}
