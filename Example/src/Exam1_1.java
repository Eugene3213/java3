import java.util.Random;
import java.util.Scanner;

public class Exam1_1 {

	public static void main(String[] args) {

		/* �Ϲ� random���� (random double �ڷ���)
		 int pc =(int)(math.random()*10+1); */
		 
		Exam2_1 ex2=new Exam2_1();
		
		Scanner sc=new Scanner(System.in);
		//util�� �̿��� random����
		Random r=new Random();
		int pc= r.nextInt(10)+1;
		
		int w=5;
		do {
			System.out.println("�� ��ȸ�� 5�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ");
			int user=sc.nextInt();
			ex2.randomck(pc,user);
			
			String out =ex2.result();
			System.out.println(out);
		
			int check=out.indexOf("����");	//indexof �ܾ� �˻��� ���.-1:���� , 0:����
			if(check==0) {
				break;
			}
			
			w--;
		}while(w>0);
				
sc.close();
	}

}
