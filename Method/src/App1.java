
package App;

import App.App2;
import java.util.Arrays;
import java.util.Scanner;

public class App1 {
	String user;
	String user_subject;

	public static void main(String[] args) {
		/*
		 * ����[����������Ʈ] �������� ���� �����Ͱ� ���� �մϴ�. ���α׷� ����� �ش� ����� �̸��� �Է��մϴ�. �ش� ���� ������ �� �����
		 * �̸��� ������ �����͸� ��� �ǵ��� �մϴ�. [���μ��� ���� ���] �˻��� ������ �л����� �Է��� �ּ���? ȫ�浿
		 * 
		 * 
		 * �˻��� ���� ����? [��ü]? ��ü �˻������� �л��� : ȫ�浿 ���������� : ����:55 ����:60 ����:77 ����:90 �˻��� ����
		 * ����? [��ü]? ���� �˻������� �л��� : ȫ�浿 ���������� : ����:60
		 * 
		 * �迭 �����Ͱ� { {"������","�̰���","���","������","������"}, {"80","78","92","67","40"},
		 * {"40","80","80","92","100"}, {"95","30","55","90","65"},
		 * {"20","80","100","95","30"} }; A��Ʈ ����ڰ� �ش� ������ �Է��� �� �ִ� ���μ����� �����ϰ�, ���� ��� ����
		 * return�޾Ƽ� ó���ؾ��մϴ�. ��, �ش� �����Ϳ� ���� ����ڸ� �Է��� ��� �����͸� ã�� ���߽��ϴ�. ��� �Է� �Ǿ�� �մϴ�. ����
		 * ������ ��ü�� �Է��� ��� ����~������� ��� ����մϴ�. �ش� Ư�� ������ �Է��� ��� �ش� ���� ������ ��µǵ��� �մϴ�.
		 * 
		 * B��Ʈ A��Ʈ���� ���޹��� ����� �Է°� ���¿� ���缭 ������� A��Ʈ�� �ٽ� �� ���� �Ͻø� �˴ϴ�.
		 * 
		 * 
		 * A��Ʈ ����ڰ� �Է��ϴ� ��2�� 1�� ����� �̸� -> B��Ʈ 2�� B��Ʈ���� ������� ������ �������� ó���Ͽ� 2��° ���� ��/��4��
		 * ���������� ����� �̸��� �ľ� ->�˻��� ������� �Է��ϼ���[��ü] 5�� ����ڰ� ���������� �̸��� ����� 6�� -A��Ʈ ����� �Է� ��
		 * 2���� ���� ���� ����� ����մϴ�. 8�� ��ü: ����data[0],����data[1],����data[2],����data[3] B��Ʈ A��Ʈ
		 * ����� �̸� ->setter ->�迭�� ���� -> ����� �̸� ��/�� 3�� A��Ʈ ����� �̸�, ����� -> �ڵ��ۼ��Ͽ� �迭����
		 * ����(���ڿ�_ 7�� ���� ��ü ���� ������ 92,80,55,100 �����ϴ� ->A��Ʈ 7��(2)
		 */
		App1 DB = new App1();

		String user_data[][] = { { "������", "�̰���", "���", "������", "������" }, { "80", "78", "92", "67", "40" },
				{ "40", "80", "80", "92", "100" }, { "95", "30", "55", "90", "65" },
				{ "20", "80", "100", "95", "30" } };
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �л����� �Է��� �ּ���?");
		String user = sc.next();
		udata ab = new udata();
		ab.user_name(user);
		
		
		
		System.out.println("�˻��� ���� ������ �����ΰ���?");
		String user_subject = sc.next();
		DB.Data(user_data, user, user_subject);
		sc.close();
	}
	
	public void Data(String[][] user_data1, String user_name, String user_subject) {

		int ea = user_data1[0].length;
		for (int w = 0; w < ea; w++) {
			if (user_name.equals(user_data1[0][w])) {
				if (user_subject.equals("����")) {
					System.out.println(user_data1[1][w]);
				} else if (user_subject.equals("����")) {
					System.out.println(user_data1[2][w]);
				} else if (user_subject.equals("����")) {
					System.out.println(user_data1[3][w]);
				} else if (user_subject.equals("����")) {
					System.out.println(user_data1[4][w]);
				} else {
					if (user_subject.equals("��ü")) {
						for (int ww = 0; ww < ea; ww++) {
							System.out.println(user_data1[w][ww]);
						}
					}
				}
			}else {
				System.out.println("�����͸� ã�� ���߽��ϴ�.");
			}

		}

	}

}
class udata{
	private String user_name;
	public void  user_name(String user) {
		this.user_name=user;
		System.out.println(this.user_name);
	}
}