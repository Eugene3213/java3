package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*q. ����ڰ� ���ڱݾ� �Է��մϴ�.
		 	�ش� ���� �ݾ� Ƚ���� �� 8�� �Դϴ�.
		 	0-n ���� �Է� �����ϸ�, �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��� ��Ű�ÿ�.
		 	ex)�Ա� �� �ݾ��� �������� 500	600 500 400 200 100 50 50
		 	���: �� �Ա� �ݾ���: 2400�� �Դϴ�.		 */
		
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> bank=new LinkedList<>();
		int w=0;
		int total=0;
		do{
			System.out.println("�Ա� �� �ݾ��� �Է��ϼ���");
			String money = sc.next();
			try {
				int addm = Integer.parseInt(money);
				bank.add(addm);
				total+=addm;
				
			}catch(Exception z) {
				System.out.println("�ݾ��� ���ڸ� �Է��ϼ���");
			}
			w++;
		}while(w<8);
		System.out.println("�� �Ա� �ݾ���: " + total + "�Դϴ�");
	
	}

}
