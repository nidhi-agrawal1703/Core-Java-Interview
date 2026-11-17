package com.rays.oop.Interfaces;

public class Businessman implements SocialWorker,Richman {

	@Override
	public void earnMoney() {
		System.out.println("Earn Money");
	}

	@Override
	public void donation() {
		System.out.println("Donation");
	}

	@Override
	public void party() {
		System.out.println("Party");
	}

	@Override
	public void helpOthers() {
		System.out.println("HelpOthers");
	}

}
