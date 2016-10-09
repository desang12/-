package $7장;

/**
 
 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
 
 메서드명 : action
 기능 : 주어진 객체의 메서드를 호출한다.
 		DanceRobot의 경우, dance()를 호출하고,
 		SingRobot의 경우, sing()를 호출하고,
 		DrawRobot인 경우, draw()를 호출한다.
 반환타입 : 없음
 매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스
 
 
 
 */



public class _18번문제 {

	public static void main(String [] args){
		Robot [] arr = {new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for(int i = 0; i < arr.length; i++){
			action(arr[i]);
		}
	}
	
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		} else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		} else {
			DrawRobot dr = (DrawRobot) r;
			dr.draw();
		}
	}
	
}

class Robot {}

class DanceRobot extends Robot {
	void dance(){
		System.out.println("댄싱로봇");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("싱로봇");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("드로잉 로봇");
	}
}