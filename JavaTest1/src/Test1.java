import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
			System.out.println("ON OFF �� �ϳ��� �Է��Ͻÿ�");
			String a=sc.next();
			
			
			if(a.equals("on")) {
				System.out.println("true");
			}
			else if(a.equals("off")) {
				System.out.println("false");
			}
			sc.close();
		
		
		
	}

}
