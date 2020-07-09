package com.example.fastcampus.hamburger;

public interface Hamburger {
	// To-DO
	// 모든 햄버거에 필요로 되는 메서드가 정의된 햄버거 인터페이스를 설계합니다.
	void showPrice();		// 가격을 보여주는 메서드
	void showMaterial();	// 재료를 보여주는 메서드
	int getPrice();			// 가격을 반환하는 메서드
	String getBurgerName(); // 버거의 이름을 반환하는 메서드
}
