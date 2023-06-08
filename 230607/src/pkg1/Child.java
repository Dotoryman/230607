package pkg1;

public class Child extends Parent{
	
	public Child() {
		super();
	}
	
	
	public void print() {
//		this.name = "King"; // 컴파일에러
		this.id = "user1";
		this.pw = "1111";
		this.addr = "Daegu";
	}
}
