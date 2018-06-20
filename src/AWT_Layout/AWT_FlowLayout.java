package AWT_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class AWT_FlowLayout extends Frame{
	AWT_FlowLayout(){
		setTitle("FlowLayout");
		setLayout(new FlowLayout());
		Init();
		setSize(350, 350);
		setVisible(true);
	}
	public void Init() {
		Button firstb = new Button("��ư1");
		add(firstb);
		Button secondb = new Button("��ư2");
		add(secondb);
		add(new Button("��ư3"));
		add(new Button("��ư4"));
		add(new Button("��ư5"));
	}
	public static void main(String[] args) {
		new AWT_FlowLayout();
	}
}


