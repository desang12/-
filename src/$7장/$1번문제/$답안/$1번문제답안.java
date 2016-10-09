package $7장.$1번문제.$답안;

import lombok.Data;



public class $1번문제답안 {
	public static void main(String [] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length; i++){
			System.out.print(deck.cards[i]+", ");
		}
	}
}

class SutdaDeck {
	
/*
 * SutdaDeck 클래스에 cards라는 SutdaCard배열이 정의되어 있다.
 * 이 배열을 생성했다고 해서 SutdaCard인스턴스가 생성된 것은 아니다. 
 * 그저 SutdaCard인스턴스를 저장하기 위한 공간을 생성한 것 뿐이다.
 * 객체배열열을 생성할 때, 배열만 생성해 놓고 객체를 생성하지 않는 실수를 하지 않도록 하자.
 * SutdaCard[] cards = new SutdaCard[CARD_NUM];
 * 
 */	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
/*
 * 생성자를 통해 객체배열 SutdaCard에 SutdaCard인스턴스를 생성해서 저장.
 * 반복문을 이용해서 배열의 크기만큼 SutdaCard인스턴스를 생성하면 된다.
 * boolean isKwang = (i < 10) && (num == 1||num==3||num==8);
 * AND가 우선순위가 높기 때문에 괄호를 꼭 사용해야 한다.
 */
	SutdaDeck() {
		for(int i = 0; i < cards.length; i++){
			int num = i%10 + 1;
			boolean isKwang = (i < 10) && (num == 1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
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

