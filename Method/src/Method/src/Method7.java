import java.util.Arrays;

public class Method7 {

	public static void main(String[] args) {
		

		apink ap = new apink("ȫ�浿",25,"test@test.com",-1000);
		System.out.println(ap.data());
		System.out.println(ap.data2());
		System.out.println(ap.data3());
	}

}
class apink{
	//private������ class �ʵ忡�� �����ؾ� �մϴ�.
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
		if(this.nm=="ȫ�浿") {
			this.nm="hong";
			String e[] =this.email.split("@");		//�̸��� �߿� �̸��� ȸ�� ������ ������������ �迭�� ������ �۾�
			//System.out.println(Arrays.toString(e));
			this.email_cp =e[1];
		
		}
			
	}
	public apink(String nm1, int age1, String email1, int point1) {			//private �ȿ��� ������� ����
		//setter ����
		this.nm =nm1;
		this.email=email1;
		
		if(point1<0) {
			this.point =0;
		}
		else {
			this.point =point1;
		}
		names();
		
	}
	public String data() {
		return this.email_cp;
		//return �ؿ��� �ٸ� �ڵ� ��� �Ұ� ������. �������� ����ϴ� �ڵ�
	}
	public String data2() {
		//getter ����
		return this.email;
	}
	public int data3() {
		return this.point;
	}
}