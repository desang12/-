package $7장.$2번문제.$답안;
import lombok.Data;

/*
 * 문제 7-1의 SutdaDeck 클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트하시오.
 * 1. 메서드명 : shuffle
 * 기능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다. (Math.random() 사용)
 * 반환타입 : 없음
 * 매개변수 : 없음
 * 
 * 2. 메서드명 : pick
 * 기능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
 * 반환타입 : SutdaCard
 * 매개변수 : int index
 * 
 * 3. 메서드명 : pick
 * 기능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
 * 반환타입 : SutdaCard
 * 매개변수 : 없음
 */

public class $2번문제 {
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
		
		return cards[index];
	}
	
	SutdaCard pick() {
		
		int index = (int)(Math.random()*cards.length);
		return cards[index];
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