package $7장.$1번문제.$문제;
import lombok.*;


/*
 * 섯다카드 20장을 포함하는 섯다카드 한 벌을 정의한 것이다.
 * 섯다카드 20장을 담는 SutdaCard 배열을 초기화하시오.
 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
 * 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(KWang)이어야 한다.
 * 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true여야 한다.
 */


public class $1번문제 {
	public static void main(String [] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length; i++){
			System.out.print(deck.cards[i]+", ");
		}
	}
	
}

class SutdaDeck {

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i < cards.length; i++){
			if(i < 10){
				if(i == 0 || i == 2 || i == 7) {
					cards[i] = new SutdaCard(i + 1, true);
				} else {
					cards[i] = new SutdaCard(i + 1, false);
				}
			} else {
				cards[i] = new SutdaCard(i - 9, false);
			}
		}
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