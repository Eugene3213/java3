
public class Class4 {

	public static void main(String[] args) {
		
		Member mb = new Member();		
		//��ü : Member
		//mb : �ν��Ͻ�
		//new Member() :  �޸𸮿� �ν��Ͻ����� �����Ͽ� ����� �� �ְ� ��.
		mb.user_age = 33;
			System.out.println(mb.user_age);
			
		int total = 25 * mb.user_agree;
			System.out.println(total);
			
		final int agree = mb.user_agree;			//Member �ν��Ͻ� �ʵ尪�� �ε��� -> agree��� �ʵ� ��������� ����
		mb.user_agree =80;							//�޸𸮿� ��ϵ� ���ʵ���� �ش� �Ǵ� ���� ����
			System.out.println(mb.user_agree);
			System.out.println(agree);
			
			
		/* �Ϲ� Ŭ���� �޼ҵ� �κ� 
		 �Ϲ� Ŭ���� �޼ҵ� ���� ������ ��ü �� �ν��Ͻ��� ���� �ʿ䰡 �����ϴ�.
		 ��? static ��ü�� �޸� �ν��Ͻ��� ����Ѵٴ� �� �Դϴ�. 
		 * */	
			
		coupon.events();
		Member.member_event();
		
	}

}

class Member{					//Ŭ����

	String user_name;			//���� �ʵ���� ����
	int user_age;
	int user_level;
	int user_agree=6;			//���� �ʵ��(user_agree)�� �ʵ尪(1)�� ����
	
	public static void member_event() {
		coupon.events();		//Ŭ������ ���� �޼ҵ带 �ٷ� ȣ�Ⱑ�� ��, events��� �޼ҵ忡 ���� �ʵ� �� ���� ���尪�� class�� �����ϰ� �Ǹ� �׶��� ��ü+�ν��Ͻ��� �����ؾ߸� �ε尡 ��.
		
	}


}

class coupon{
	public static void events() {
		
		int cp= 30;
			System.out.println(cp);
		
	}
}






/* �ϳ��� project�� ���� �ٸ� pasckage�� �ѹ� ����� Class���� �ٸ� ������ ����Ͻ� �� �����ϴ�.  */





