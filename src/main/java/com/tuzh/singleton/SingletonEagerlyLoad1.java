package com.tuzh.singleton;

/**
 * @author zhihai.tu
 * 饿汉模式
 * 缺点：单例实例在类装载时进行创建
 * 优点：线程安全
 */
public class SingletonEagerlyLoad1 {

	//构造函数私有化
	private SingletonEagerlyLoad1() {}
	//单例对象
	private static SingletonEagerlyLoad1 instance = new SingletonEagerlyLoad1();
	//静态工厂方法
	public static SingletonEagerlyLoad1 getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println("test");
		System.out.println(SingletonEagerlyLoad1.getInstance());
		System.out.println(SingletonEagerlyLoad1.getInstance());
	}
}
