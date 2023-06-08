package pkg2;

import pkg1.Parent;

public class MainApp {
	public static void main(String[] args) {
		Parent parent = new Parent(); //다른패키지라도 접근가능
//		parent.name = "King"; 
//		parent.id = "user1";
//		parent.pw = "1111";
		parent.addr = "Daegu";
	}
}
