import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		

		/* up down game
		 A��Ʈ: PC����,Scanner 5��
		 B��Ʈ:PC���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ��� ó��
		 		  
		 ��ȸ�� �� �ټ� �� 
		 1.Pc�� ���ڸ� �ϳ� ����. random 1~10
		 2.�� ��ȸ�� 5�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 3.���࿡ pc�� 7�� ���� �� ���ؿ��� ����� ���ڿ� ��
		 -PC:7 �����:2 ===> ���: UP
		 4.�� ��ȸ�� 4�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 -PC:7 �����:4 ===> ���: UP
		 5.�� ��ȸ�� 3�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 -PC7 �����:7 ===> ���: �����Դϴ�. ���μ��� ����		 */
	
	Exam2 ex=new Exam2();
	Scanner sc=new Scanner(System.in);

	int pc=((int)(Math.random()*10)+1);
	
	int w=5;
	while(w>0) {
		
		System.out.printf("�� ��ȸ�� %d�� ���ҽ��ϴ�.���ڸ� ������ 1~10����",w);
		int user=sc.nextInt();
		ex.Random(pc, user);
		
		w--;
	}
		sc.close();

	}

}
