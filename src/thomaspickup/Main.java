package thomaspickup;

public class Main {
	public static void main(String[] args) {
		MorseCode mc = new MorseCode();
		
		System.out.println(mc.toMorseCode("edel egan"));
		System.out.println(mc.toString(mc.toMorseCode("edel egan")));
	}
}
