
public class Exam2_1 {

	private int val1;		//pc
	private int val2;		//user
	private String msg;		//����޽���
	
	public  void randomck(int pc,int user) {	//setter(�μ��� ����)
		this.val1=pc;
		this.val2=user;
		
		if(this.val1> this.val2) {
			this.msg="UP";
		}
		else if(this.val1<this.val2) {
			this.msg="DOWN";
		}
		else {
			this.msg="����";
		}
	}
	//getter (�μ���x)
	public String result() {
		return this.msg;
	}
}
