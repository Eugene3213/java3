package Ab;

import java.util.Arrays;
import java.lang.reflect.Member;

public class method_1 extends ide_mth1{	//pakage Ab2���� import�� �� �ֵ��� �ϸ�, �ܺ� Ŭ������ �����ϰ� ��� ����������
	
	public void recall() {	//
		System.out.println("TEST");
	}
	protected static void name() {
		System.out.println("ȫ�浿");
	}
	
	

	public static void main(String[] args) {
		//Array.sort :  �迭 �������� ����(����,�ѱ�,����) ��, ������ ��� �빮�ڰ� ���� ���� �������������� ���� ��.
	
		/*int number_data[]= {5,7,1,4,9,2};
		Arrays.sort(number_data);		//sort : ��������
		System.out.println(Arrays.toString(number_data)); */
		
		/*String user_data[]= {"ȫ�浿","�庸��","������","�̼���"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data)); */
		
		/*q.������ 2�� �����ؼ� �ϴ� ����, ���� ���� ���Ե� ����ڿ� ���̵带 Ȯ�� �� �ش� ����Ʈ�� ���� �ǵ��� �մϴ�.
		 ��, ���� ����Ʈ + ������ ����Ʈ�� ���� ����� ����ϼž� �մϴ�.
		 ����� main class���� �����
		 �迭: */
		String a= "park";
		int b=2000;
		String c="����";
		
		ide_mth1 m1=new ide_mth1();
		m1.setter(a,b);
	}
}



class ide_mth1 extends mth1{
	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total=0;
	private String msg;
	
	public ide_mth1() {
		this.member_ship=new String[][]{
		 	{"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
		 	{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}
		 };
		 this.ea=this.member_ship[0].length;
		 
	}
	
	@Override
	public void setter(String data1, int data2) {
		this.data1=data1;
		this.data2=data2;
		this.loops(this.data1,this.data2,this.ea);
		
	};
	public static void loops(String a, int b, int c) {
		int w=0;
		int total=0;
		while(w<c) {
			if(this.member_ship[0][w].equals(a)) {
				this.total=Integer.parseInt(this.member_ship[1][w])+data2;
			}
			w++;
		}
		this.msg="����";
	}
	@Override
	public void setter(int data3[]) {
		
	};
	@Override
	public String getter() {
		String print = this.data1+"�� ����Ʈ��"+this.total+"���� �Ǿ����ϴ�";
		return null;
	};
}