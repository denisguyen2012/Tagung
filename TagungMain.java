public class TagungMain {
	
	public static void main (String [] args){
		Tagung <String> tg = new Tagung <String>();
		tg.setTagung("Hamburger Tagung 2013");
		String str = tg.getTagung();
		System.out.println(str);
		Tagung <String[] > tg2 = new Tagung <String[]>();
		
		Tagung<Integer> tg1 = new Tagung <Integer>();
		
	}
}
