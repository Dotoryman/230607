package pkg2;

import pkg1.Parent;

public class Child extends Parent{
	public void print() {
//		this.name = "Queen"; // 상속관계이지만 불가능
//		this.id = "user"; // 패키지가 달라서
		this.pw = "1111"; //protacted속성이라서 사용가능
		this.addr = "Daegu";
	}
}
