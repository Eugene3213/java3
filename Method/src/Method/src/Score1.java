
import java.util.Scanner;

public class Score1 {

	static String[] msg= {"�˻��� ������ �л����� �Է��� �ּ���:","�˻��� ������� �Է��ϼ���[��ü,����,����,����,����]"};
	
	
	public static void main(String[] args) {
		// ����� ���� �Է� �� ������� ���
		
		Score2 sc=new Score2();
		Scanner text =new Scanner(System.in);
			//System.out.println(Arrays.toString(msg));
			System.out.println(msg[0]);
		String name=text.next();
		sc.stdata(name,null);		//scroe2�� �޼ҵ�� ����� �� ���� ����
		
		String check=sc.gtdata();
		if(check.equals("true")) {
			System.out.println(msg[1]);
			
			String subject =text.next();
			sc.stdata(name, subject);
			
			String score=sc.gtdata();
			
			if(subject.equals("��ü")) {			
				String score2[]=score.split(",");
				System.out.printf("���������� : ���� %s ��, ���� %s ��, ���� %s ��, ���� %s��",score2[0],score2[1],score2[2],score2[3]);
			}
			else {
				System.out.println("���������ʹ� : " +subject+ " " + score+ "��");
			}}
		
			else {
				System.out.println("�ش� ����ڴ� �������� �ʽ���");
				System.exit(0);
		}
	
		text.close();
		
	}

}	

