import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ������ ���� �ϳ��� �Է��Ͻÿ�");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�");

		} else {
			int w = 1;
			int total;

			do {
				total = w * a;
				System.out.println(a + " * " + w + " = " + total);

				w++;
			} while (w < 10);

		}
		sc.close();

	}

}
