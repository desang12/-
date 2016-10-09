package $7장.$5번문제;

/*
 * 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를
 * 어떻게 바꿔야 하는가?
 */

public class $5번문제 {
	public static void main(String [] args) {
		Tv t = new Tv();
	}
}

class Product {
	int price;
	int bonusPoint;
	
//	 Product() {}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {}
	
	public String toString() {
		return "TV";
	}
}

/*
 * Product 클래스에 기본 생성자 Product()가 없기 때문에 에러가 발생한다.
 * Product 클래스에 기본 생성자 Product() {}를 추가해 줘야 한다.
 * 
 *  Tv클래스의 인스턴스를 생성할 때, 생성자 Tv()가 호출되고 Tv()는 조상 생성자 super()를 호출한다.
 *  실제 코드에서는 super()를 호출하는 곳이 없지만 컴파일러가 자동적으로 추가해준다.
 *  그래서 컴파일을 하고 나면 아래의 코드와 같이 변경된다.
 *  Tv() {
 *  	super();
 *  }
 *  
 *  추가된 super()는 조상클래스인 Product의 기본 생성자 Product를 호출하는 것인데,
 *  Product클래스에는 기본 생성자 Product가 정의되어 있지 않다.
 *  정의되어 있지 않은 생성자를 호출하니까 에러가 발생하는 것이다.
 *  Product 클래스에는 이미 Product(int price)라는 생성자가 정의되어 있기 때문에
 *  컴파일러가 자동적으로 추가해 주지도 않으므로 직접 Product 클래스에 Product(){}를
 *  넣어주면 문제가 해결된다.
 */
