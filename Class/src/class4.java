import java.util.ArrayList;
import java.util.Arrays;

public class class4 {

	public static void main(String[] args) {
		/*
		 �迭 ������
		 ȫ�浿,�̼���,������
		 
		 ���� class���� ���ڸ� �ϳ� �����մϴ�. ��, ���ڰ� null�� �ɼ��� �ְ�, �迭 �����Ϳ� ���� ���� ������"�̶�� 
		 ���� ���� �ֽ�����. 
		 �ܺ� Ŭ������: data_list
		 �ֻ� Ŭ������: v_construct
		 �ܺ� Ŭ���� ���� ���� Ŭ������ : check			 
		[���]
		���� class���� �������� ������ ���
		���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�" ��� ���
		���� class���� �̼����� ������ ���
		���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�" ��� ���
		��, ArrayList�� �迭�� �ε� �Ͻʽÿ�. 						*/
		
	
		data_list da=new data_list();
		da.userinput("�̼���");
	}

}
abstract class v_construct{
	String user_name;
	String data_list[];
	public abstract void userinput(String nm);
}
class data_list extends v_construct{
	
	@Override
	public void userinput(String nm) {
		if(nm==null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�");
		}
		else {
			this.user_name=nm;
			check ck = new check();
			ck.db();
		}
	}
	class check{						//�θ� Ŭ�������� ���� �����͸� �ڽ� Ŭ������ �̰�
		String user_name=data_list.this.user_name;
		String data_list[];			//�ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String> ar= null;		//arraylist util�� �ʵ忡 ��ü ����
		public void db() {
			//�ش� �ʵ忡 �ִ� arraylist�� �ν��Ͻ��� ������
			this.data_list=new String[] {"ȫ�浿","�̼���","������"};
			this.ar =new ArrayList<>(Arrays.asList(this.data_list));		//this�� ó��
			this.compare();		//���� DB�� ����� ������ ���ϴ� �޼ҵ�
		}
		public void compare() {
			int ea = this.ar.size();
			int w=0;
			boolean b1=false;		//���Ȯ��
			do {
				if(this.user_name.equals(this.ar.get(w))) {
					b1=true;
				}
				w++;
			}while(w<ea);

			if(b1==true) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
			}
			else {
				System.out.println("�ش� ����ڴ� �����ڰ� �ƴմϴ�");
			}
		}
		
	}
}