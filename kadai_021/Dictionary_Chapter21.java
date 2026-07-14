package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> wordMap = new HashMap<String,String>();
	
	public void createMap() {
		wordMap.put("apple","りんご");
		wordMap.put("peach","桃");
		wordMap.put("banana","バナナ");
		wordMap.put("lemon","レモン");
		wordMap.put("pear","梨");
		wordMap.put("kiwi","キウィ");
		wordMap.put("strawberry","いちご");
		wordMap.put("grape","ぶどう");
		wordMap.put("muscat","マスカット");
		wordMap.put("cherry","さくらんぼ");
	}
	
	public void checkWord(String[] searchWords) {
		for(int i=0; i<searchWords.length; i++) {
		
			String word = searchWords[i];
			
			String meaning = wordMap.get(word);
			
			if(meaning != null){
				System.out.println(word + "の意味は" + meaning + "です");
			}else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
	
}

		

