
public class Method6 {

	public static void main(String[] args) {
		// private�� ���� ��ü ���� ����2

		String userid="hong";
		String skey="a1234567";
		insert i=new insert();
		//i.userid="admin";
		String result =i.checks(userid,skey);
			System.out.println(result);
		
		
	}

}
class insert{
	//String userid=null;
	private String key=null;		//�ش� Ŭ��������  ����Ǵ� key��
	
	public String checks(String aa, String bb) {
		this.key=bb;
		String msg=null;
			if(key.equals("a1234567")) {		//�ش� key��(private)�� �ܿ� class���� �Ѿ���� �μ����� ��
				if(aa.equals("hong")) {				//���̵� Ȯ��
					msg="�����͸� Ȯ���߿� �ֽ��ϴ�";
				}
				else {
					msg="�ش� ������ ���� Ȯ���Ͻÿ�";
				}
			}
			else {		//�ܺ� class���� �ùٸ� key���� ���޵��� ���� ���
				msg="error";
			}
		return msg; 	//���� ����� ���� return���� ȸ��
	}
}