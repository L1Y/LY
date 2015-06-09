package com.liduan.javase.inherit;

/**
 * 
 * @author liduan
 *
 *抽象类：不具体说明功能实现的类。
 *语法：类：修饰符 abstract class 类名
 *		方法：修饰符 abstract 返回值类型 方法名称();
 *
 *特点：
 *	1，抽象类不能被实例化
 *	2，抽象方法只有声明，没有实现，同时被abstract关键字修饰，就是抽象方法
 *	3，抽象类的子类必须把父类中的抽象方法全部覆盖（重写）才能被实例化。否则，其子类还是抽象类
 *	4，抽象类允许有非抽象方法，非抽象类不能存在抽象方法
 *
 *abstract class 犬科
 *
 *	提问
 *	1，抽象类中能有构造方法吗？
 *		可以有，只能通过子类中的构造方法使用super来调用赋值
 *	2，抽象类可以不定义抽象方法吗？
 *		可以，表示这个只能通过继承来使用。例如：HttpSevlet
 *	3，抽象关键字abstract不能与哪些关键字共存。
 *		final 修饰的类不能被继承与abstract相反
 *		static 修饰的方法或属性，都变成了类方法，类属性。不需要通过实例化来调用该方法或属性
 *		private 把方法隐藏为子类不可见，但是abstract是要求方法是子类可见的
 *	4，抽象类与一般类的异同点？
 *		相同点：都是用来描述事物的，都要以在内部定义方法和实例变量
 *		不同点：
 *			1，一般类是具体描述一个事物，而抽象类是不具体描述。
 *			2，一般类是不定义抽象方法，只能定义非抽象方法。抽象类即可以定义抽象方法，也可以定义非抽象方法。
 *			3，一般类是能够被实例化的，抽象不能。
 *
 *练习
 *	1，定义一个抽象类BaseAdapter,该类有一个返回值为int的抽象方法getCount()，返回值为int的getItem(int position)抽象方法。返回值为void的getView(int position)抽象方法。
 *	2，定义一个类，该继承BaseAdapter。该类有一个int数组，数组有10个元素。
 *
 *
 *	3，定义一个AdapterDemo类。该拥有一个Iterator(BaseAdapter adapter)方法。请在Iterator方法中通过调用getView(int position)方法将数组打印。打印语句只能写在getView方法里，
 *		循环只能写在Iterator方法里
 */

abstract class 犬科{
	private String name;
	
	public 犬科(){
		
	}
	
	public 犬科(String name){
		this.name = name;
	}
	
	/*private*/ abstract void 吼();
	
	
	/*abstract void eat();*/
}

/*abstract*/ class 狗 extends 犬科{
	//修饰符 static 变量类型 变量名称;
	public static int i = 0;//如果是public权限的话，就是全局变量
	public 狗(){
		super();
	}
	
	public 狗(String name){
		super(name);
	}
	
	@Override
	void 吼(){
		System.out.println("汪汪");
	}
}

class 狼 extends 犬科{
	@Override
	void 吼(){
		System.out.println("嗷嗷");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		狗 dog = new 狗();
		dog.吼();
		//dog.i;
		//狗.i
		
		狼 wolf = new 狼();
		wolf.吼();
		
		//犬科 qk = new 犬科("quan");
	}

}
