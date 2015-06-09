package com.wangzexin.javase.thread;

class WindowOne extends Thread {

	private String str = "str";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (str) {
				if (TicketSold.ticketNum != 0) {
					System.out
							.println("Window1 has Sold 1 Ticket , now ticket has "
									+ --TicketSold.ticketNum);
				} else
					return;
			}
		}
	}
}

class WindowTwo extends Thread {

	private String str = "str";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (str) {
				if (TicketSold.ticketNum != 0) {
					System.out
							.println("Window2 has Sold 1 Ticket , now ticket has "
									+ --TicketSold.ticketNum);
				} else
					return;
			}
		}
	}
}

class WindowThree extends Thread {

	private String str = "str";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (str) {
				if (TicketSold.ticketNum != 0) {
					System.out
							.println("Window3 has Sold 1 Ticket , now ticket has "
									+ --TicketSold.ticketNum);
				} else
					return;
			}
		}
	}
}

public class TicketSold {

	public static int ticketNum = 100;

	public static void main(String[] args) {
		Thread winOne = new WindowOne();
		Thread winTwo = new WindowTwo();
		Thread winThr = new WindowThree();
		winOne.start();
		winTwo.start();
		winThr.start();
	}
}
