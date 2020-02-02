package program;

public class Checker {
	private Boolean getAnswer;//globaali muuttujat
	private int points=0;
	
	public void check(int answer, int st, int nd, int rd, int th){//tarkastetaan onko vastaus oikein
		if(answer == 1){ //vastausten j‰rjestyksen randomoinnista johtuen joudutaan tarkastamaan mit‰ nappia on painettu eik‰ voida suoraan l‰hett‰‰ numeroa
			answer = st;
		}
		else if(answer == 2){
			answer = nd;
		}
		else if(answer == 3){
			answer = rd;
		}
		else if(answer == 4){
			answer = th;
		}
		if(answer==1){
			getAnswer=true;
			points++;
		}
		else{
			getAnswer=false;
		}
	}
	public boolean getAnswer(){//getteri vastaukselle ja pisteille
		return getAnswer;
	}
	public int getPoints(){
		return points;
	}
}
