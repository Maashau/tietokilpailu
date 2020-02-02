package program;

import java.io.FileNotFoundException; // Tuodaan FileReader kirjastot .json tiedoston avaamista varten
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray; // Tuodaan json simple parserin kirjastot json tiedoston lukemista varten
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader { 
	private Object opt1, opt2, opt3, opt4, right, state;//globaali muuttujat
	private String file = "qaa.json"; //qaa.json on JSON tiedosto joka sisältää kysymykset
    JSONParser parser = new JSONParser(); //JSONParser on jsonista lukemisee tehty parser JSON Simple kirjastosta
    public JSONReader(){
    	
    }
	public void read(int st, int nd, int rd, int th, Object next){//methodi joka lukee json tiedostosta kysymyksen ja vastuakset
		try{
			Object obj = parser.parse(new FileReader(file));
        	JSONObject jsonObject = (JSONObject) obj;
        	JSONArray kysArray=(JSONArray) jsonObject.get("kysymys"+next);
        	opt1 = kysArray.get(st); //vastaukset
        	opt2 = kysArray.get(nd);
        	opt3 = kysArray.get(rd);
        	opt4 = kysArray.get(th);
        	right = kysArray.get(1); //oikea vastaus
        	state = kysArray.get(0); //kysymys
		}
		catch(FileNotFoundException e) { e.printStackTrace(); }//error handlingiä jos tiedostoa ei löydy
        catch(IOException e) { e.printStackTrace(); }
        catch(ParseException e) { e.printStackTrace(); }
        catch(Exception e) { e.printStackTrace(); }
	}
	public Object getOpt1() { //getterit
		return opt1;
	}
	public Object getOpt2() {
		return opt2;
	}
	public Object getOpt3() {
		return opt3;
	}
	public Object getOpt4() {
		return opt4;
	}
	public Object getRight() {
		return right;
	}
	public Object getState() {
		return state;
	}
}
