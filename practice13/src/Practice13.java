//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.print("x갑을 입력하세요: ");
		x = sc.nextDouble();
		
		if(x <= 0)
			x = x * x * x - 9 * x + 2;
		else
			x = 7 * x + 2;
		
		System.out.println("f(x) = " + x);
	}

}
