//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, count = 0;
		
		System.out.print("정수를 하나 입력하세요: ");
		num = sc.nextInt();
		
		for(int i = 0; i <= num; i++)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0)
					System.out.println();
			}
		}
	}

}
