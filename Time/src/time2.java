import java.util.Timer;
import java.util.TimerTask;

public class time2{

	public static void main(String[] args) {
		Timer timer = new Timer();	//Timer util�� �̿��Ͽ� �ð��Լ��� ����մϴ�.
		//timer.scheduleAtFixedRate(new gogo(),0, 5000);		//rate�� �˻�
		//timer.scheduleAtFixedRate(���� �� �޼ҵ�&Ŭ����, ���� �� ����, �ݺ��ð�)
		//timer.scheduleAtFixedRate : ���������� �ݺ� �۾��� �� ���
	
		TimerTask tk =new TimerTask() {
			int a=0;
			String adata[]= {"ȫ�浿","�̼���","������","������"};
			
			@Override
			public void run() {
				if(a>=4) {
					System.exit(0);
				}
				System.out.println(adata[a]);
				a++;
			}
		};	
		timer.scheduleAtFixedRate(tk, 0, 1000);
	}

}
class gogo extends TimerTask{	//TimeTask : �ð��۾�
	public void run() {		//Task���� �����ϴ� �޼ҵ� �Դϴ�.
		//System.out.println("�ð� �Լ� �� �۵��� �ɱ��?");
	}
}