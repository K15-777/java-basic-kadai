package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();
		
		String myHand = janken.getMyChoice();
		
		String opponentHand = janken.getRandom();
		
		janken.playGame(myHand, opponentHand);

	}
}