
public class time3 {

	public static void main(String[] args) {
		/*
		 try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
			
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		 */

		/*q. �ܺ� class�� �ֽ��ϴ�. �� ���� Ŭ�������� �ش� �ܺ� class�� �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�� ���� "ó�����Դϴ�. ��ø� ��ٷ� �ּ���" �ε��� �߻��մϴ�.
		 	8�� ���Ŀ� return���� "�Ա��� ��� ó�� �Ǿ����ϴ�"��� ���ڸ� �޵��� �Ͻʽÿ�.		 */
	
		input ip=new input();
		ip.money();
		
	}

}
class input{
	
	String msg="�Ա��� ��� ó�� �Ǿ����ϴ�";
	
	public void money() {
		try {
			System.out.println("ó�����Դϴ�. ��ø� ��ٷ� �ּ���");
			Thread.sleep(8000);
			String kkk=this.msg();
			System.out.println(kkk);
		}catch(InterruptedException a) {
			System.out.println(a);
		}
}
	public String msg() {
		return "�Ա��� ��� ó�� �Ǿ����ϴ�";
}
}