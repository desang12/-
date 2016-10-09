package $7장.$14번문제;

import java.util.*;


/*
 * 문제 7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 한 번 값이 지정되면 변경되어서는 안되는 값이다.
 * 카드의 숫자가 한 번 잘못 바뀌면 똑같은 카드가 두 장이 될 수도 있기 때문이다.
 * 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시오.
 * 
 */
public class $14번문제 {

	public static void main(String[] args) {
		
		SutdaCard card = new SutdaCard(1, true);
		System.out.println(card.NUM);
		
	}

}

class SutdaCard {
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	public String toString() {
		return NUM + (IS_KWANG ? "K" : "");
	}
}

/*
 * 원래 변수 앞에 final을 붙일 때는 선언과 초기화를 동시에 해야 한다.
 * 그러나 인스턴스 변수의 경우, 선언 시에 초기화 하지 않고, 생성자에서 초기화 할 수 있다.
 * 생성할 때 지정된 값이 변하지 않도록 할 수 있는 것이다.
 * 상수이므로 한 번 초기화한 이후로는 값을 바꿀 수 없다.
 */
