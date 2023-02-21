//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요: ");
		String s = sc.next();
		
		switch(s) {
		case "a":
			System.out.println("모음입니다.");
			break;
		case "e":
			System.out.println("모음입니다.");
			break;
		case "i":
			System.out.println("모음입니다.");
			break;
		case "o":
			System.out.println("모음입니다.");
			break;
		case "u":
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
			break;
		}
	}

}
