/* Question: Write a GUI application in JAVA which uses several AWT components to gather info from the user and dsiplays the same, */

import java.awt.*;
import java.awt.event.*;


class AWTComponentsDemo extends Frame{
	Label l1, l2, l3, l4, l5, l6;
	Panel text;
	Panel checkbox;
	Panel radiobutton;
	Panel list;
	Panel button;

	TextField tf;
	TextArea ta;
	Checkbox c1, c2, c3, c4;
	Checkbox r1, r2;
	CheckboxGroup bg;

	List ls;
	Choice c;

	Button submit, exit;

	AWTComponentsDemo(){
		super("AWTComponentsDemo Example");

		l1 = new Label("Name",Label.RIGHT);
		l2 = new Label("Address",Label.RIGHT);
		l3 = new Label("Operating Systems", Label.RIGHT);
		l4 = new Label("Subject", Label.RIGHT);
		l5 = new Label("Languages", Label.RIGHT);
		l6 = new Label("Gender", Label.RIGHT);

		text = new Panel();
		checkbox = new Panel();
		checkbox.setBackground(Color.YELLOW);
		radiobutton = new Panel();
		list = new Panel();
		list.setBackground(Color.GREEN);
		button = new Panel();
		button.setBackground(Color.BLUE);

		text.setLayout(new GridLayout(2,2));
		checkbox.setLayout(new GridLayout(0,1));
		radiobutton.setLayout(new GridLayout(0,1));
		list.setLayout(new GridLayout(0,1));

		tf= new TextField(20);
		ta = new TextArea();
		ta.setFont(new Font("Lucida Sans Typewriter", Font.BOLD, 25));

		text.add(l1);
		text.add(tf);
		text.add(l2);
		text.add(ta);

		c1 = new Checkbox("Windows");
		c2 = new Checkbox("Linux");
		c3 = new Checkbox("Mac Os");
		c4 = new Checkbox("Chrome OS");
		c3.setState(true);
		checkbox.add(l3);
		checkbox.add(c1);
		checkbox.add(c2);
		checkbox.add(c3);
		checkbox.add(c4);

		r1 = new Checkbox("Male");
		r2 = new Checkbox("Female");
		bg = new CheckboxGroup();
		r1.setState(true);
		r1.setCheckboxGroup(bg);
		r2.setCheckboxGroup(bg);
		radiobutton.add(r1);
		radiobutton.add(r2);

		ls = new List();
		ls.add("Java");
		ls.add("C++");
		ls.add("Python");
		ls.add("C#");
		ls.add("Ruby");
		ls.add("Javascript");
		ls.setMinimumSize(new Dimension(200, 200));

		c = new Choice();
		c.addItem("Computer Science");
		c.addItem("Artificial Intelligence");
		c.addItem("Mathematics");
		c.addItem("Robotics");
	
		ls.setMultipleMode(true);
		c.select(2);

		list.add(l5);
		list.add(ls);
		list.add(l4);
		list.add(c);

		submit = new Button("Submit");
		exit = new Button("Exit");
		button.add(submit);
		button.add(exit);

		setLayout(new GridLayout(0,1));

		add(text);
		add(checkbox);
		add(radiobutton);
		add(list);
		add(button);

		setSize(350, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}
		});

		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String s, l = "", g = "";
				System.out.println("User Details are as follows");
				System.out.println("Name:" + tf.getText());
				System.out.println("Address:" + ta.getText());
				s = "";
				if(c1.getState()){
					s = s + "" + c1.getLabel();
				} 
				if(c2.getState()){
					s = s + "" + c2.getLabel();
				}
				if(c3.getState()){
					s = s + "" + c3.getLabel();
				}
				if(c4.getState()){
					s = s + "" + c4.getLabel();
				}
				System.out.println("Operating Systems:" + s);
				if(r1.getState()){
					g = "Male";
				}
				if(r1.getState()){
					g = "Female";
				}
				System.out.println("Gender:" + g);
				Object obj[] = ls.getSelectedObjects();
				for(int i = 0;i < obj.length; ++i){
					l = l + "" + (String)obj[i];
				}
				System.out.println("Languages: " +l);
				System.out.println("Subject: " + c.getSelectedItem());
			}
		});
	}
	public static void main(String[] args){
		AWTComponentsDemo obj = new AWTComponentsDemo();
	}
}
