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
		Button firstb = new Button("버튼1");
		add(firstb);
		Button secondb = new Button("버튼2");
		add(secondb);
		add(new Button("버튼3"));
		add(new Button("버튼4"));
		add(new Button("버튼5"));
	}
	public static void main(String[] args) {
		new AWT_FlowLayout();
	}
}


