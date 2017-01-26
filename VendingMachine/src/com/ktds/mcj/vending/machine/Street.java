package com.ktds.mcj.vending.machine;

public class Street {

	public void start() {
		Buyer buyer = new Buyer(10000);   // buyer는 10000의 money를 가지고 있음.
		VendingMachine vendingMachine = new VendingMachine(100, 10, 10, 10);
		// 자판기는 처음부터 100원을 가지고 있음. 각각 음료 10개씩 가지고 있음.
		buyer.buy(vendingMachine, 10000);
		
		System.out.println(buyer);
		System.out.println(vendingMachine);
	}
	
	public static void main(String[] args) {
		new Street().start();
	}
	
}
