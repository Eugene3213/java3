package Ab2;

public class Example1 {

	public static void main(String[] args) {
		
		home h[] = {new computer(),new monitor()};
		home2 h2[]= {new phone()};		//extends�� home�� �ε��Ͽ���
		
		h[0].broken(40);
		h[1].broken(0);
		h2[0].broken(11);
	
	}

}
class computer implements home{
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�");
	}
	@Override
	public void broken(int n) {
		if(this.bk<=n) {
			System.out.println("��ǻ�� ����!!");
		}
		else if(this.bk>n && n>0){
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
}
class monitor implements home{
	@Override
	public void poweron() {
		System.out.println("����� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�");
	}
	@Override
	public void broken(int n) {
		if(this.bk<=n) {
			System.out.println("����� ����!!");
		}
		else if(this.bk>n && n>0){
			this.poweron();
		}
		else {
			this.poweroff();
		}
	}
	
}
/*	
 �޴����� �߰� ��� �ʿ�:
 �޴��� ����� �ּ����� (20) => �����۵� 40~79, 80�̻�Ǹ� ����
 1.����� ������ ���޵����� ȭ���� ���峯 ��� (���� ������������ �۵� �Ұ�)- 20~39
 2.������ ���޵����� ������ �ȵ� ���(���� ���� �ƿ� �ȵǴ� ���)- 20�̸� ������ ���	 */

class phone implements home, home2{
	@Override
	public void poweron() {
		System.out.println("�޴��� ���� ������");
	}
	@Override
	public void poweroff() {
		System.out.println("�޴��� ���� �ߴ�");
	}
	@Override
	public void broken(int n) {
		if(this.bk<=n) {
			System.out.println("�޴��� ����");
		}
		else if(this.bk>n && n>0){
			
			if(n <20) {
				this.powerchk2();
			}
			else if(n >=20 && n<=39) {
				this.powerchk1();
			}
			else {
				this.poweron();
			}
		}
		else {
			this.poweroff();
		}
	}
	@Override
	public void powerchk1() {
		System.out.println("���� ������, ȭ�� ����");
	}
	@Override
	public void powerchk2() {		//20�̸�
		System.out.println("���� ������, ���͸� ���� �ȵ�");
	}
}