import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���");
			int a=sc.nextInt();
			
			
			if(a>60) {
				System.out.println("�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�");
			}
			if(a<=60) {
				
				if(a%2==0) {
					System.out.println("¦���Դϴ�");
				}
				else {
					System.out.println("Ȧ���Դϴ�");
				}
			}
			
			sc.close();
				
			

	}

}
