package com.tuzh.singleton;

/**
 * @author zhihai.tu
 * 懒汉模式->双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 * 线程不安全
 */
public class SingletonLazyLoad4 {

	//构造函数私有化
	private SingletonLazyLoad4() {}
	//单例对象
	private static SingletonLazyLoad4 instance = null;
	
    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // JVM和cpu优化，发生了指令重排

    // 1、memory = allocate() 分配对象的内存空间
    // 3、instance = memory 设置instance指向刚分配的内存
    // 2、ctorInstance() 初始化对象
	
	//静态工厂方法
	public static SingletonLazyLoad4 getInstance() {
		if(instance == null) { // 双重检测机制 
			synchronized (SingletonLazyLoad4.class) { // 同步锁
				if(instance == null) {
					instance = new SingletonLazyLoad4();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonLazyLoad4.getInstance());
		System.out.println(SingletonLazyLoad4.getInstance());
	}
}
