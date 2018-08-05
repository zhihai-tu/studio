package com.tuzh.singleton;

/**
 * @author zhihai.tu
 *
 */
public class SingletonMain {

	public static void main(String[] args) {
		
		System.out.println("test");
		//懒汉模式
		//SingletonLazyLoad1 instance = SingletonLazyLoad1.getInstance();
		//饿汉模式
		//SingletonEagerlyLoad1 instance = SingletonEagerlyLoad1.getInstance();
		//枚举模式
		SingletonEnumLoad instance = SingletonEnumLoad.getInstance();
		System.out.println(instance);
	}

}
