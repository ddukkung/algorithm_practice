import java.util.*;

public class Practice1122_no2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			if(h == 0) {
				h = 24 - 1;
				m = 60 - Math.abs(m - 45);
				System.out.println(h + " " + m);
			} else {
				m = 60 - Math.abs(m - 45);
				h -= 1;
				System.out.println(h + " " + m);
			}
		} else {
			m -= 45;
			System.out.println(h + " " + m);
		}

	}

}
