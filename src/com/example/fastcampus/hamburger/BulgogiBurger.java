package com.example.fastcampus.hamburger;

public class BulgogiBurger implements Hamburger {
	final static private int price = 2000;
	final static private String ingredient = "Bulgogi";
	final static private String burgetName = "BulgogiBurger";
	@Override
	public void showMaterial() {
		System.out.println("햄버거의 재료는 "+ingredient+"입니다.");
	}
	@Override
	public void showPrice() {
		System.out.println("햄버거의 가격은 "+price+"원 입니다.");
	}
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public String getBurgerName() {
		return burgetName;
	}
}
