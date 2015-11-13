//Leider nicht vervollständigen können..
public class Tagung {
	private Tagung tagung;
	private Tagung [] teilnehmer;
	private Tagung [] workshops;
	private Tagung[] rahmenprogramm;
	private Tagung [] referent;
	private int wert;

	public void setTagung(Tagung tagung){
		this.tagung=tagung;
	}
	
	public Tagung getTagung(){
		return tagung;
	}

	public void addTeilnehmer(Tagung[] teilnehmer){
	}
	public void addWorkshops(Tagung[] workshops){
	}
	public void addRahmenprogramm(Tagung[] rahmenprogramm){
	}
	public void addReferent(Tagung[] referent){
	}
	
	public static void main (String [] args){
		Tagung tg = new Tagung();

	}
}
