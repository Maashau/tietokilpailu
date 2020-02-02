package program;
//tuodaan tarvittavat kirjastot
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {//main
        Print prt = new Print();//luodaan scanneri, printti, randomizer, hashset, checker ja jsonread
        Randomizer rng = new Randomizer();
        HashSet<Integer> hs = new HashSet<Integer>();
        Checker ch = new Checker();
        JSONReader json = new JSONReader();
       
		while(hs.size()<10){ //luodaan randomoitu hashset, siksi hashset ett‰ sinne ei voi tallentaa samaa arvoa kahdesti.
    		hs.add(rng.getRand(49));
    	}
    	
		Iterator<Integer> it = hs.iterator(); //iteraattori luoddan l‰pi jotta voidaan k‰yd‰ l‰pi hashsetin arvot
    
    	while(it.hasNext()){ //looppi joka k‰y l‰pi hashetin arvot
    		rng = new Randomizer(); //randomizer joka arpoo vastausten j‰rjestyksen
    		json.read(rng.getSt(),rng.getNd(),rng.getRd(),rng.getTh(),it.next()); //json.read lukee tiedostosta musistiin halutut kysymykset
    		int answer = 6; //alustaa while looppia varten answer arvoksi 6
    		while(answer == 6) { //while looppi jolla odotetaan k‰ytt‰j‰n vastausta
    			answer = prt.question(json.getState(),json.getOpt1(),json.getOpt2(),json.getOpt3(),json.getOpt4());
    		}
    		prt.setAnswer(); //annetaan prt:n kautta Guissa olevalle answer muuttujalle uudestaa arvo 6 yll‰ olevaa while looppia varten.
    		ch.check(answer, rng.getSt(), rng.getNd(), rng.getRd(), rng.getTh()); //l‰hetet‰‰n arvot tarkastajalle joka tarkastaa arvot
    		prt.answer(ch.getAnswer(), json.getRight());//l‰hetet‰‰n printtiin checkerilt‰ saadut arvot oliko vastaus oikein ja oikea vastaus
    	} 
		
		prt.theEnd(ch.getPoints()); //l‰hetet‰‰n printtiin pisteet checkerilt‰
	}	
}
