import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class awt6_abstract {

	public abstract 
	
	Frame fr= new Frame();
	Button bt=null;		
	Button ckbt=null;
	Button close=null;
	TextField tf=null;
	Label lb=new Label();
	
	public void design() {
		this.fr.setBounds(200,200,350,180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.bt=new Button("������ȣ �߼�");
		this.ckbt=new Button("����Ȯ��");
		this.close = new Button("X");
		this.tf=new TextField();
		this.lb.setBackground(Color.blue);
		this.lb.setBounds(25,200,250,25);
		this.tf.setBounds(25,160,140,25);
		this.bt.setBounds(190,160,100,25);
		this.ckbt.setBounds(190,160,100,25);
		this.close.setBounds(190,160,30,25);
		this.fr.add(this.lb);
		this.fr.add(this.lb);
		this.fr.add(this.bt);
		this.fr.add(this.ckbt);
		this.fr.add(this.close);
		this.click();
	}
	
	public void click() {
		
		this.bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userid =awt6_abstract.this.lb.getText();
				
				
				
			}
		});
		this.ckbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	
				Integer user =awt6_abstract.this.tf.getText();
				
				if(user.equals("")) {
					lb.setText("������ȣ ���ڸ��� �Է��ϼ���");
				}
				else {
					
				}
					
				
				
			}
		});
		this.close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
}
