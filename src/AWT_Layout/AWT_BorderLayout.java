package AWT_Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class AWT_BorderLayout extends Frame{
	AWT_BorderLayout(){
		setTitle("AWT ����");
		BorderLayout border = new BorderLayout(2,2);
		setLayout(border);
		Init();
		setSize(500, 500);
		setVisible(true);
	}
	public void Init() {
		add(new Button("��ư1"));
		add(new Button("��ư2"));
		add(new Button("��ư3"),"East");
		add(new Button("��ư4"),"South");
		add(new Button("��ư5"),"Center");
	}
	public static void main(String[] args) {
		Frame f =new AWT_BorderLayout();
	}

}