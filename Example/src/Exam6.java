import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		/*
		 ��ǰ������ 420000 �Դϴ�.
		 ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
		 �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� ���� �ݾ��� ��½�Ű�� extends�� �����Ͻø� �˴ϴ�.
		 ��, 420000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5�� ���� �Դϴ�;		
		 ������� ���� main method���� ����մϴ� */

		number_2 nb=new number_2();
		
		Scanner sc=new Scanner(System.in);
			System.out.println("��ǰ ������ �Է��ϼ���");
			int a=sc.nextInt();
			
		
		
		
	}

}
class number{
	
	private int w1;
	private int e1;
	protected int r;
	
	public void price(final int w, int e) {
		this.w1=w;
		this.e1=e;
		this.r=this.w1*this.e1;
	}
}
class number_2 extends number{
	
	public void pric2() {
		
		
	}
}