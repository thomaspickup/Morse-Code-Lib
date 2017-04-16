package thomaspickup;

/*
 * MorseCode Class used for translating morse code into english and back again.
 * @author Thomas Pickup
 */
public class MorseCode {
	/*
	 * Holds the dictionary array
	 */
	String[][] dict = new String[2][37];

	/*
	 * Creates a new instance of MorseCode and loads in the dictionary
	 */
	public MorseCode() {
		dict = loadDictionary();

		/**
		 * for (int c = 0; c < 37; c++) { System.out.println(dict[0][c] + " = "
		 * + dict[1][c]); }
		 **/
	}

	public String toMorseCode(String text) {
		String morseCode = "";
		text = text.toUpperCase();

		for (int c = 0; c < text.length(); c++) {
			String ch = Character.toString(text.charAt(c));

			for (int i = 0; i < 37; i++) {

				if (ch.equals(dict[0][i])) {
					morseCode = morseCode + dict[1][i] + " ";
				}
			}
		}

		return morseCode;
	}

	public String toString(String morseCode) {
		String text = "";
		int stringLength = morseCode.length();
		int count = 0;
		String tester = "";

		do {
			if (count < morseCode.length()) {
				if ((morseCode.charAt(count) == ' ') | (stringLength == 0)) {
					stringLength -= 1;

					for (int i = 0; i < 37; i++) {
						if (tester.equals(dict[1][i])) {
							text = text + dict[0][i];
						}
					}

					tester = "";

					if (stringLength == 0) {
						return text;
					}
				} else {
					stringLength -= 1;
					tester += Character.toString(morseCode.charAt(count));
				}
				/**
				 * System.out.println(tester); System.out.println(text);
				 **/
				count += 1;
			}
		} while (stringLength >= 0);

		return text;
	}

	public String lookup(int type, int position) {
		if ((type < 2) && (type > -1) && (position < 37) && (position > -1)) {
			return dict[type][position];
		}
		return "";
	}

	public String printDictionary() {
		String out = "";

		for (int c = 0; c < 37; c++) {
			out += dict[0][c] + " : " + dict[1][c] + "|";
		}

		return out;
	}

	private String[][] loadDictionary() {
		String[][] mcDict = new String[2][37];

		mcDict[0][0] = "A";
		mcDict[1][0] = "._";

		mcDict[0][1] = "B";
		mcDict[1][1] = "_...";

		mcDict[0][2] = "C";
		mcDict[1][2] = "_._.";

		mcDict[0][3] = "D";
		mcDict[1][3] = "_..";

		mcDict[0][4] = "E";
		mcDict[1][4] = ".";

		mcDict[0][5] = "F";
		mcDict[1][5] = ".._.";

		mcDict[0][6] = "G";
		mcDict[1][6] = "__.";

		mcDict[0][7] = "H";
		mcDict[1][7] = "....";

		mcDict[0][8] = "I";
		mcDict[1][8] = "..";

		mcDict[0][9] = "J";
		mcDict[1][9] = ".___";

		mcDict[0][10] = "K";
		mcDict[1][10] = "_._";

		mcDict[0][11] = "L";
		mcDict[1][11] = "._..";

		mcDict[0][12] = "M";
		mcDict[1][12] = "__";

		mcDict[0][13] = "N";
		mcDict[1][13] = "_.";

		mcDict[0][14] = "O";
		mcDict[1][14] = "___";

		mcDict[0][15] = "P";
		mcDict[1][15] = ".__.";

		mcDict[0][16] = "Q";
		mcDict[1][16] = "__._";

		mcDict[0][17] = "R";
		mcDict[1][17] = "._.";

		mcDict[0][18] = "S";
		mcDict[1][18] = "...";

		mcDict[0][19] = "T";
		mcDict[1][19] = "_";

		mcDict[0][20] = "U";
		mcDict[1][20] = ".._";

		mcDict[0][21] = "V";
		mcDict[1][21] = "..._";

		mcDict[0][22] = "W";
		mcDict[1][22] = ".__";

		mcDict[0][23] = "X";
		mcDict[1][23] = "_.._";

		mcDict[0][24] = "Y";
		mcDict[1][24] = "_.__";

		mcDict[0][25] = "Z";
		mcDict[1][25] = "__..";

		mcDict[0][26] = "1";
		mcDict[1][26] = ".____";

		mcDict[0][27] = "2";
		mcDict[1][27] = "..___";

		mcDict[0][28] = "3";
		mcDict[1][28] = "...__";

		mcDict[0][29] = "4";
		mcDict[1][29] = "...._";

		mcDict[0][30] = "5";
		mcDict[1][30] = ".....";

		mcDict[0][31] = "6";
		mcDict[1][31] = "_....";

		mcDict[0][32] = "7";
		mcDict[1][32] = "__...";

		mcDict[0][33] = "8";
		mcDict[1][33] = "___..";

		mcDict[0][34] = "9";
		mcDict[1][34] = "____.";

		mcDict[0][35] = "0";
		mcDict[1][35] = "_____";

		mcDict[0][36] = " ";
		mcDict[1][36] = "/";

		return mcDict;
	}
}
