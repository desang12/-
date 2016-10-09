package $7장.$2번문제.$문제;
import lombok.Data;

public class $2번문제답안 {
	public static void main(String [] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++){
			System.out.print(deck.cards[i]+", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

class SutdaDeck {

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i < cards.length; i++){
			int num = i%10 + 1;
			boolean isKwang = (num < 10) && (num == 1||num == 3||num == 8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle() {
		
		for (int i = 0; i < cards.length; i++) {
			SutdaCard tmp = cards[i];
			int random = (int)(Math.random()*cards.length);
			cards[i] = cards[random];
			cards[random] = tmp;
		}
		
		
		
	}
	
	SutdaCard pick(int index) {
		//유효성 검사!!
		//매개변수가 있는 메서드는 반드시 작업 전에 유효성 검사를 해야한다는 것을 기억하자!!!
		if(index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		
		int index = (int)(Math.random()*cards.length);
		return pick(index);/*pick() 메서드 재사용*/
	}
}

@Data
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
	
}