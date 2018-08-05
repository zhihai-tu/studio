package com.tuzh.singleton;

/**
 * @author zhihai.tu
 * 懒汉模式
 * 优点：单例实例在第一次使用时进行创建
 * 缺点：线程不安全
 */
public class SingletonLazyLoad1 {
	
	//构造函数私有化
	private SingletonLazyLoad1() {}
	//单例对象
	private static SingletonLazyLoad1 instance = null;
	//静态工厂方法
	public static SingletonLazyLoad1 getInstance() {
		if(instance == null) {
			instance = new SingletonLazyLoad1();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println("test");
		System.out.println(SingletonLazyLoad1.getInstance());
		System.out.println(SingletonLazyLoad1.getInstance());
	}
}
