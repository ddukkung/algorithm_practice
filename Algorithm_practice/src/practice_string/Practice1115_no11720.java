package practice_string;

import java.util.*;

public class Practice1115_no11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		String num = sc.next();
		sc.close();
		
		int total = 0;
		
		// 나는 스트링으로 받아서 그걸 int형으로 변환하고 거기서 또 mod를 해서 나머지를 토탈에 누적시키고
		// 받은 숫자값에는 나누기 10을해서 끝자리 하나를 없애는 식으로 반복문을 돌렸는데...
		// 비효율적이었군
		for(int i = 0; i < n; i++) {
			// charAt() 메소드는 해당 문자의 아스키코드값을 리턴하기 때문에 
			// 반드시 -48 또는 -'0'을 해주어야 입력받은 숫자값을 그대로 사용할 수 있다.
			total += num.charAt(i) - '0';
		}
		
		System.out.println(total);
		

	}

}
