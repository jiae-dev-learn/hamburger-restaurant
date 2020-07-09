package com.example.fastcampus.machin;

import java.util.ArrayList;
import java.util.List;

import com.example.fastcampus.hamburger.Hamburger;

public class HamburgerOrderMachine {
	private List<Hamburger> hamburgerList;

	public HamburgerOrderMachine() {
		hamburgerList = new ArrayList<Hamburger>();
	}

	public void order(Hamburger hamburger) {
		hamburgerList.add(hamburger);
	}

	
	 // 햄버거 리스트를 순회하며 Burger의 가격과 재료를 출력하고, 총 합산 가격을 반환합니다. 
	public int completeOrder() {
		int totalPrice = 0;

		for(Hamburger hamburger : hamburgerList) {
			System.out.println("["+hamburger.getBurgerName()+"]");
			hamburger.showPrice();
			hamburger.showMaterial();
			totalPrice += hamburger.getPrice();
		}
		return totalPrice;
	}

}
