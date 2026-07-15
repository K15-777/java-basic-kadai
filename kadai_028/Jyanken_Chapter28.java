package kadai_028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	
	public String getMyChoice() {
		
		System.out.println("じゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String input = scanner.next();
		
			if(input.equals("r")  || input.equals("s") || input.equals("p")) {
				scanner.close();
				return input;
			}	
		
		System.out.println("正しい値を入力してください");
		}
	}
	
	public String getRandom() {
		ArrayList<String> opponentList = new ArrayList<String>();
		opponentList.add("r");
		opponentList.add("s");
		opponentList.add("p");
		
		int index = (int) Math.floor(Math.random()*3);
		
		return opponentList.get(index);
	}
	
	public void playGame(String myHand, String opponentHand) {
		
		HashMap<String, String> jankenMap = new HashMap<String, String>();
		jankenMap.put("r","グー");
		jankenMap.put("s","チョキ");
		jankenMap.put("p","パー");
		
		System.out.println("自分の手は" + jankenMap.get(myHand) + ", 対戦相手の手は" + jankenMap.get(opponentHand));
		
		if(myHand.equals(opponentHand)) {
			System.out.println("あいこです");
		}else if((myHand.equals("r") && opponentHand.equals("s")) ||
				 (myHand.equals("s") && opponentHand.equals("p")) ||
				 (myHand.equals("p") && opponentHand.equals("r"))) {
			System.out.println("自分の勝ちです");	
		}else {
			System.out.println("自分の負けです");
		}
	}
	

}
