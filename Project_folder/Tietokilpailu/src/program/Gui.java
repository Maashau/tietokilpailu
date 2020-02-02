package program;
//tuodaan tarvittavat kirjastot
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Gui { 
	//tehd‰‰n gloobalit muutujat
		JFrame frame = new JFrame();
		JPanel title = new JPanel();
		JPanel question = new JPanel();
		JPanel buttons = new JPanel();
		JPanel check = new JPanel();
		JLabel label = new JLabel("Tietovisa");
		JLabel lquestion = new JLabel("question");
		JButton opt1 = new JButton("answer1");
		JButton opt2 = new JButton("answer2");
		JButton opt3 = new JButton("answer3");
		JButton opt4 = new JButton("answer4");
		JLabel lright = new JLabel("testi");
		int uAnswer = 6;
	
	public Gui() { //Gui konstruktori k‰ynnist‰‰ createView methodin
		createView();
	}
	
	private void createView() { //createView method rakentaa alkuun Guin.
	   //JFrame
	   frame.setSize(new Dimension(500, 400));
	   frame.setLocationRelativeTo(null);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setTitle("Tietovisa");
	   frame.setResizable(false);
	   frame.setVisible(true);
	   //JPanel
	   title.setBackground(Color.white);
	   title.setSize(500, 40);
	   title.setLocation(0, 0);
	   frame.getContentPane().add(title);
	   label.setFont(new Font("Arial", Font.PLAIN, 16));
	   title.add(label);
	   
	   question.setBackground(Color.white);
	   question.setSize(500, 160);
	   question.setLocation(0, 40);
	   frame.getContentPane().add(question);
	   lquestion.setFont(new Font("Arial", Font.PLAIN, 18));
	   question.add(lquestion);
	   
	   buttons.setBackground(Color.white);
	   buttons.setSize(500, 140);
	   buttons.setLocation(0, 200);
	   frame.getContentPane().add(buttons);
	   opt1.addActionListener( //opt1,2,3,4 napeille on kaikille tehty samanlaiset actionListenerit jotka yksinkertaisesti palauttavat arvon
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						uAnswer = 1;
					}
				}	
			);
	   buttons.add(opt1);
	   opt2.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						uAnswer = 2;
					}
				}	
			);
	   buttons.add(opt2);
	   opt3.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						uAnswer = 3;
					}
				}	
			);
	   buttons.add(opt3);
	   opt4.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						uAnswer = 4;
					}
				}	
			);
	   buttons.add(opt4);
	   
	   check.setBackground(Color.white); //t‰m‰ paneeli on j‰‰nne ohjelman ensimm‰isest‰ versiosta mutta jostain syyst‰ poistaminen aiheuttaa ongelmia.
	   check.setSize(500, 40);
	   check.setLocation(0,340);
	   frame.getContentPane().add(check);
	}
	public void setOpt1(String answer) { //setterit joilla nappeihin saadaan kaupunkien nimet
		opt1.setText(answer);
	}

	public void setOpt2(String answer) {
		opt2.setText(answer);
	}

	public void setOpt3(String answer) {
		opt3.setText(answer);
	}

	public void setOpt4(String answer) {
		opt4.setText(answer);
	}

	public void setQuestion(String question) { //setteri jolla tuodaan kysymys labeliin
		lquestion.setText(question);
		
	}public void setRight(String right) { //setteri jolla tuodaan kysymys labeliin
		label.setText(right);
	}
	public void setAnswer() { //setAnswer on tehty vain ainoastaan mainista lˆytyv‰‰ while looppia varten joka mahdollistaa inputin odotuksen
		uAnswer = 6;
	}
	public void endQuiz(String points) { //endQuiz poistaa napit n‰kyvist‰ tietovisan p‰‰tytty‰ ja tulostaa pisteet
		buttons.setVisible(false);
		lquestion.setText(points);
	}
	public int getAnswer() { //getAnswer palauttaa painetun napin numeron
		return uAnswer;
	}
}