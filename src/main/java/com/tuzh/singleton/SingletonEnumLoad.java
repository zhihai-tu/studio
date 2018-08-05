package com.tuzh.singleton;

/**
 * @author zhihai.tu
 * 枚举模式
 * 线程安全【最推荐】
 */
public class SingletonEnumLoad {
	
	//构造函数私有化
	private SingletonEnumLoad() {}

	//静态工厂方法
	public static SingletonEnumLoad getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
	
	//枚举类
	//三大特性：自由序列化、线程安全、保证单例
	//其它特点：
	//1、只有private构造器
	//2、enum类也不能够被继承，在反编译中，我们会发现该类是final的。例如：public final class T extends Enum
	private enum Singleton {
		INSTANCE;
		
		private SingletonEnumLoad instance;
		
		// JVM保证这个方法绝对只调用一次
		// 每一个枚举类型和枚举变量在JVM中都是唯一的
		// 构造函数前的private可以删略
        Singleton() {
        	instance = new SingletonEnumLoad();
        }
        
        public SingletonEnumLoad getInstance() {
        	return instance;
        }
	}
	
	public static void main(String[] args) {
		
		System.out.println("test");
		System.out.println(SingletonEnumLoad.getInstance());
		System.out.println(SingletonEnumLoad.getInstance());
	}
}
