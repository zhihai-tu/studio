package com.tuzh.singleton;

/**
 * @author zhihai.tu
 * 懒汉模式
 * 单例实例在第一次使用时进行创建
 * 使用了synchronized，线程安全，不推荐
 */
public class SingletonLazyLoad2 {

	//构造函数私有化
	private SingletonLazyLoad2() {}
	//单例对象
	private static SingletonLazyLoad2 instance = null;
	//静态工厂方法
	public static synchronized SingletonLazyLoad2 getInstance() {
		if(instance == null) {
			instance = new SingletonLazyLoad2();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonLazyLoad2.getInstance());
		System.out.println(SingletonLazyLoad2.getInstance());
	}
}
