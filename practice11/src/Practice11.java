//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double height;
		double weight;
		double correct;
		
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		weight = sc.nextDouble();
		
		correct = (height - 100) * 0.9;
		System.out.println("표준체중은 "+ correct + "입니다.");
		
		if(weight < correct)
			System.out.print("저체중입니다.");
		else if(weight == correct)
			System.out.print("정상체중입니다.");
		else
			System.out.print("과체중입니다.");
	}

}
