package AWT_Layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

public class AWT_GridLayout extends Frame{
	AWT_GridLayout(){
		setTitle("AWT 예제");
		setLayout(new GridLayout(2, 3, 50, 50));
		Init();
		setSize(250, 200);
		setVisible(true);
	}
	public void Init() {
		Button btn = new Button("버튼1");
		btn.setBackground(Color.CYAN);
		add(btn);
		add(new Button("버튼2"));
		add(new Button("버튼3"));
		add(new Button("버튼4"));
		add(new Button("버튼5"));
	}
	public static void main(String[] args) {
		Frame f =new AWT_GridLayout();
	}
}

