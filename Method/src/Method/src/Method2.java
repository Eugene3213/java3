
public class Method2 {

	public static void main(String[] args) {
		/* default package�� ���� �ش� class���� ȣ�� �ϸ� ��
		  package�� ���� ���� ���� ���� ��ܿ� package�� �����ؾ���
		 
		tests ts=new tests();
		ts.a2++;
		System.out.println(ts.a2);
		*/
		
		info i =new info();
		/* error
		System.out.println(i.data1(20));
		System.out.println(i.data2(20)); */
		
		//success
		System.out.println(i.data3(20));
		
		
		String result = i.data4("ȫ�浿");
		System.out.println(result);				//data4 �޼ҵ� return���� result������ �޾Ƽ� ó��
		
		
	}

}
class info{
	//static �Ǵ� void �޼ҵ忡�� return�̶�� ��ɾ ������� ����
	public static void data1(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		//return z;				return ��� �Ұ�
	}
	public void data2(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		//retrun z;				return ��� �Ұ�
	}
	
	
	
	
	
	public int data3(int abc) {				//�ڷ��� �޼ҵ��� ���ϸ� ������ return ���. ��, sysout ��� �Ұ�
		int z=abc +20;
		//System.out.println(z); sysout ��� �Ұ�
		return z;
	}
	public String data4(String abc) {
		String z=abc + "�� ȯ���մϴ�.";
		return z;
		
	}
	
}