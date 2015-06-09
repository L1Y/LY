package com.wangzexin.javase.thread;

class Window extends Thread {

	private String str = "str";
	private int size ;
	public Window(int size){
		this.size = size;
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (str) {
				if (TicketSold1.ticketNum != 0) {
					System.out
							.println("Window "+size+" has Sold a Ticket , now ticket has "
									+ --TicketSold1.ticketNum);
				} else
					return;
			}
		}
	}
}

public class TicketSold1 {
	public static int ticketNum = 1000;
	public static void main(String[] args){
		new Window(1);
		new Window(2);
		new Window(3);
	}
}
