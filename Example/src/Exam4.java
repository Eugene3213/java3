
public class Exam4 {

	public static void main(String[] args) {
		/*q.
		 �ΰ��� ���� �ܺ� Ŭ������ �����ϴ�.
		 �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�.
		 ������� ������ �����ϴ�.
		 3,10�� ������ �Ǹ� �ΰ��� ���� ���� ���մϴ�.
		 ������ �ܺ� Ŭ�������� �ٽ� ������� ����ϴµ�
		 �ΰ��� �� ���� ¦��, Ȧ�������� ����ϴ� extneds�� �����Ͻÿ�	 */
		
		
		sub2 sb=new sub2();
		sb.number(3, 10);
		sb.number2();
	}

}
class sub{
	private int aa;
	private int bb;
	protected int cc;
	
	public void number(int a,int b) {
		this.aa=a;
		this.bb=b;
		this.cc= this.aa + this.bb;
	}
}
class sub2 extends sub{
	
	public void number2() {
		if(this.cc%2==0) {
			System.out.println("¦���Դϴ�");
		}
		else {
			System.out.println("Ȧ���Դϴ�");
		}
	}

}