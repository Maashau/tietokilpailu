package program;

public class Randomizer {
	private int st=0, nd=0, rd=0, th=0, n;//globaali muuttujat
	
	public Randomizer(){//luodaan 4 random lukua jotka eroavat toisistaan ja m‰‰ritt‰v‰t vaihtoehtojen j‰rjestyksen
		for(int i = 0;i<4;i++){
			n = (int)(Math.random()*4)+1;
			if(st==0){
				st = n;
			}
			else if(nd==0&&n!=st){
				nd = n;
			}
			else if(rd==0&&n!=st&&n!=nd){
				rd = n;
			}
			else if(th==0&&n!=st&&n!=nd&&n!=rd){
				th = n;
			}
			else{
				i= i-1;
			}
			
		}
	}
	public int getRand(int max){ //getterit random luvuille
		return (int)(Math.random()*max);
	}
	public int getSt() {
		return st;
	}
	public int getNd() {
		return nd;
	}
	public int getRd() {
		return rd;
	}
	public int getTh() {
		return th;
	}
}
