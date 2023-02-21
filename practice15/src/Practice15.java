//컴퓨터학과_가유빈_20220740
public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 1; i < 101; i += 3)
		{
			System.out.print(i + "\t");
			count++;
			if(count % 5 == 0)
				System.out.print("\n");
		}
		
		System.out.println("\n");
		
		int j = 1;
		count = 0;
		while(j < 101)
		{
			System.out.print(j + "\t");
			count++;
			if(count % 5 == 0)
				System.out.print("\n");
			
			j += 3;
		}
	}

}
