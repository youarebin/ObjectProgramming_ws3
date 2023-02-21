//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int first, second, third, min;
		
		System.out.println("첫 번째 숫자를 입력하세요: ");
		first = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요: ");
		second = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요: ");
		third = sc.nextInt();
		
		min = first;
		
		if(second < first)
		{
			min = second;
			if(third < second)
				min = third;
		}
		else if(third < first)
		{
			min = third;
		}
		System.out.println("가장 작은 숫자는 " + min + "입니다.");
	}

}
