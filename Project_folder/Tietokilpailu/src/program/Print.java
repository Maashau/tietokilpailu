package program;

public class Print {
    Gui ui = new Gui();//k‰ynnistett‰n Gui
    
	public Print(){ //tulostetaan otsikko
		ui.setRight("Tietokilpailu");
	}
	public void answer(Boolean answer, Object right){ //tulostetaan vastaukesta riippuen oikein tai v‰‰rin ja kerrotaan oikea vastaus jos v‰‰rin
		if(answer==true){
			ui.setRight("Oikein!");
		}
		else if(answer==false){
			ui.setRight("V‰‰rin! Oikea vastaus olisi ollut " + right);
		}
	}
	public int question(Object state, Object opt1, Object opt2, Object opt3, Object opt4){ //tulostetaan kysymys + vaihtoehdot nappeihin
		ui.setQuestion("Mik‰ on osavaltion " +state+ " isoin kaupunki?");
		ui.setOpt1(""+opt1);
		ui.setOpt2(""+opt2);
		ui.setOpt3(""+opt3);
		ui.setOpt4(""+opt4);
		return ui.getAnswer();
	}
	public void theEnd(int points){ //tulostetaan loppun‰kym‰
		ui.endQuiz("Vastasit oikein " + points + "/10 kysymykseen, Paina X poistuaksesi");
	}
	public void setAnswer() {//osa mainista lˆytyv‰‰ looppia joka v‰litt‰‰ answer muuttujalle arvon, siksi n‰in ettei jouduta aina avaamaan uutta guita
		ui.setAnswer();
	}
}
