import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 ��ǰ������ 420000 �Դϴ�.
		 ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
		 �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� ���� �ݾ��� ��½�Ű�� extends�� �����Ͻø� �˴ϴ�.
		 ��, 420000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
		 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5�� ���� �Դϴ�;		
		 ������� ���� main method���� ����մϴ� */
	
		
		subb2 sb2=new subb2();
		Scanner sc=new Scanner(System.in);
		
			final int price=420000;
			int w=1;
			
			while( w<6) {
				System.out.println("������ �Է��Ͻÿ�");
				int user=sc.nextInt();
				
				sb2.thing(price,user);
				
				
				w++;
			}
			int result=sb2.rst();
			System.out.println(result);
				
			sc.close();		
	}
}

class subb{
	protected int val=420000;
	private int val2;
	protected int total;
	
	
	public void thing(int price, int user) {
		this.val=price;
		this.val2=user;
		this.total = this.val * this.val2;
		
	}			
}
class subb2 extends subb{
	
	public int rst() {
		
		return this.total;
	}
}
