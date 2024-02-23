package day15;
/*
	버튼을 두개를 가지는 창을 만들고
	한 개의 버튼을 클릭하면 창이 닫히고
	다른 한 개를 클릭하면 배경색이 랜덤하게 변경되는
	프로그램을 제작해 보자.
	
	프로그램의 목적
		자바에서 이벤트 처리는 
			1. 운영체제가 이벤트를 인지하고
 			2. 인지된 정보를 JVM(자바가상머신)에게 알려주고
 			3. 전달받은 정보로 자바가상머신이 해당 이벤트의 처리를 해준다.
 				이 때, 자동 호출되는 함수가 있는데
 				그 함수에 대해서 고찰해보자.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame {
	public JFrame frame;
	public JPanel pan, pan1, pan2;
	public JButton btn1, btn2;
	
	
	public MyFrame() {
		// 이 생성자가 실행되는 순간
		// 이 프로그램 윈도우와 버튼이 만들어 져야한다.
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 배경패널
		pan = new JPanel();
		pan.setPreferredSize(new Dimension(300, 450));
		pan.setBackground(Color.WHITE);
		
		// 버튼패널
		pan1 = new JPanel();
		pan1.setPreferredSize(new Dimension(300, 50));
		pan1.setLayout(new GridLayout(1, 2));
		
		// 버튼준비
		btn1 = new JButton("Change!");
		btn1.addActionListener(new ChangeColor(this));
		btn2 = new JButton("Close");
		// 이벤트 등록
//		btn2.addActionListener(new CloseEvt(this));
		// 무명 내부 클래스로 처리
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// pan1에 버튼추가
		pan1.add(btn1);
		pan1.add(btn2);
		
		frame.add(pan,"Center");
		frame.add(pan1, "South");
		
		frame.setSize(300, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	
// 색상변경 이벤트 클래스
	class ChangeColor implements ActionListener {
		public MyFrame f;
		public ChangeColor() {}
		public ChangeColor(MyFrame f) {
			this.f = f;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// 랜덤하게 칼라만들고
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			// 색 만들고
			Color c = new Color(r, g, b);
			
			// f의 pan의 배경색을 변경해준다.
			f.pan.setBackground(c);
			
		}
	}
}

class CloseEvt implements ActionListener {
	// 이 클래스의 역할은 위의 클래스가 객체가 돼서
	// 창이 띄워졌을 때
	// 버튼클릭이 되면 실행되는 기능이다.
	// 실행되는 내용은
	// 띄워진 창을 닫는 역할을 해줘야 한다.
	// 프로그램을 종료하는 기능을 해줘야 한다.
	// 따라서 위의 클래스가 객체가 된 주소를 
	// 이 클래스가 객체가 될 때 기억하고 있어야 한다.
	
	public MyFrame f;
	
	public CloseEvt() {}
	public CloseEvt(MyFrame f) {
		this.f = f;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이 함수는 위의 클래스의 버튼 중 close 버튼이 클릭이 되면
		// 실행되는 함수이다.
//		System.out.println("닫기버튼 클릭~~~~!");
		System.exit(0);
	}
}