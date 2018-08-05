package com.tuzh.singleton;

/**
 * @author zhihai.tu
 * 饿汉模式
 * 单例实例在类装载时进行创建
 * 线程安全
 */
public class SingletonEagerlyLoad2 {

	//构造函数私有化
	private SingletonEagerlyLoad2() {}
	//单例对象
	private static SingletonEagerlyLoad2 instance = null;
	
	static {
		instance = new SingletonEagerlyLoad2();
	}
	
	//静态工厂方法
	public static SingletonEagerlyLoad2 getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonEagerlyLoad2.getInstance());
		System.out.println(SingletonEagerlyLoad2.getInstance());
	}
}
