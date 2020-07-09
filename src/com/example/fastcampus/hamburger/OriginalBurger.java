package com.example.fastcampus.hamburger;

public class OriginalBurger implements Hamburger {
	final static private int price = 1000;
	final static private String ingredient = "Ham";
	final static private String burgerName = "OriginalBurger";
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
		return burgerName;
	}
	
}
