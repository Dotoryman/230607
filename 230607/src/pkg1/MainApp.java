package pkg1;

public class MainApp {
	public static void main(String[] args) {
		Parent parent = new Parent();
//		parent.name = "King"; // 컴파일에러
		parent.id = "user1";
		parent.pw = "1111";
		parent.addr = "Daegu";
	}
}
