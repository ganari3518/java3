package AWT_Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class AWT_BorderLayout extends Frame{
	AWT_BorderLayout(){
		setTitle("AWT 예제");
		BorderLayout border = new BorderLayout(2,2);
		setLayout(border);
		Init();
		setSize(500, 500);
		setVisible(true);
	}
	public void Init() {
		add(new Button("버튼1"));
		add(new Button("버튼2"));
		add(new Button("버튼3"),"East");
		add(new Button("버튼4"),"South");
		add(new Button("버튼5"),"Center");
	}
	public static void main(String[] args) {
		Frame f =new AWT_BorderLayout();
	}

}
