package com.lzm.javase.deadlock;


public class DeadLockDemo{

	public static void main(String[] args) {
		new Thread(new LockTest(false)).start();
		new Thread(new LockTest(true)).start();
	}
}

class LockTest implements Runnable{
	private boolean flag;
	public LockTest(boolean flag) {
		this.flag = flag;
	}

	@Override
	/**
	 * test_1：不同锁对象（死锁）
	 */
	/*
	public void run() {
		if (flag) {
			while(true) {
				synchronized (MyDeadLock.lock1) {
					System.out.println(Thread.currentThread().getName() + "----lock_1----");
					synchronized (MyDeadLock.lock2) {
						System.out.println(Thread.currentThread().getName() + "----lock2----");
					}
				}
			}
		} else {
			while(true) {
				synchronized (MyDeadLock.lock2) {
					System.out.println(Thread.currentThread().getName() + "----lock_2----");
					synchronized (MyDeadLock.lock1) {
						System.out.println(Thread.currentThread().getName() + "----lock_1----");
					}
				}
			}
		}
		
	}
	*/
	/**
	 * test_2：同一锁（同步）
	 */
	public void run() {
		if (flag) {
			while(true) {
				synchronized (MySynchroLock.lock) {
					System.out.println(Thread.currentThread().getName() + "----lock_1----");
					synchronized (MySynchroLock.lock) {
						System.out.println(Thread.currentThread().getName() + "----lock2----");
					}
				}
			}
		} else {
			while(true) {
				synchronized (MySynchroLock.lock) {
					System.out.println(Thread.currentThread().getName() + "----lock_2----");
					synchronized (MySynchroLock.lock) {
						System.out.println(Thread.currentThread().getName() + "----lock_1----");
					}
				}
			}
		}
		
	}
	
}

class MyDeadLock {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
}
class MySynchroLock {
	public static Object lock = new Object();
}


