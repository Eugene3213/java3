package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		//���ڿ� ���� �迭���
		Scanner sc=new Scanner(System.in);
		ArrayList list =new ArrayList();	
		
			int w =0;
			while(w<5) {
				System.out.println("�����͸� �Է��آz��");
				String user=sc.next();
				list.add(user);
				w++;
			}
			Object a= list.get(1);
			System.out.println(list.size());
			
			//���� �Է»��׸� ��� ���� (�ǹ� �ڵ�. Object���)
			int ww=0;
			int total=0;
			do {
				try {
					Object k =list.get(ww);		//�迭�ڷᰡ ����+���� ���·� ������ �Ǿ� ���� ���� Object �Ű�Ÿ������ ���� �մϴ�.
					int numbers=Integer.parseInt(k.toString());	//�ش� �Ű�Ÿ���� ����ȭ�Ͽ� parseInt�� �ٽ� �������.
					total+=numbers;
				}
				catch(Exception aa){ 			//�迭�� �Ű�Ÿ���� ���ڰ� �ƴ� ��� ( ���ܻ�Ȳ �߻�)
					
				}
				ww++;
			}while(ww<list.size());
			
			
			System.out.println("�Է��� ��� �迭�� ����: " + total + "�Դϴ�");
	}

}
