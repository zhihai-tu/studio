package com.tuzh.singleton;

/**
 * @author zhihai.tu
 * 懒汉模式->双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 * 使用volatile，线程安全
 */
public class SingletonLazyLoad3 {

	//构造函数私有化
	private SingletonLazyLoad3() {}
	//单例对象
	private volatile static SingletonLazyLoad3 instance = null;
	
    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // 单例对象 volatile + 双重检测机制 -> 禁止指令重排
	
	//静态工厂方法
	public static SingletonLazyLoad3 getInstance() {
		if(instance == null) { // 双重检测机制 
			synchronized (SingletonLazyLoad3.class) { // 同步锁
				if(instance == null) {
					instance = new SingletonLazyLoad3();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonLazyLoad3.getInstance());
		System.out.println(SingletonLazyLoad3.getInstance());
	}
}
