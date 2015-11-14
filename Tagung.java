import java.util.Scanner;

//Leider nicht vervollständigen können..
public class Tagung<Tagung> {
	private Tagung tagung;
	private Tagung [] teilnehmer;
	private Tagung [] workshops;
	private Tagung[] rahmenprogramm;
	private Tagung [] referent;
	private Tagung wert;
	
	Scanner scanner = new Scanner(System.in);
	public Tagung(){
		
	}
	public Tagung(Tagung tagung){
		this.wert=wert;
		this.tagung=tagung;
		
	}

	
	public Tagung getTagung(){
		return tagung;
	}
	public void setTagung(Tagung tagung){
		this.tagung=tagung;
	}

	public void addTeilnehmer(Tagung[] teilnehmer){
		System.out.println("Bitte einen Teilnehmernamen eingeben: ");
		String tn = scanner.next();
		for(int i =0; i<teilnehmer.length;i++){
			
			teilnehmer[i]=(Tagung) tn;
			System.out.println(i);

		}

	}
	public void addWorkshops(Tagung[] workshops){
	}
	public void addRahmenprogramm(Tagung[] rahmenprogramm){
	}
	public void addReferent(Tagung[] referent){
	}
	


}
