package swordOffer;
/**
 *这是剑指offer的第二题：实现单例模式
 *线程安全的方式有4种
 *1.饿汉式； 
 *2.双重检查锁（DLC）+volatile关键字； 
 *3.延迟初始化占位类模式（Holder）； 
 *4.枚举。 
 * @author Stephen Huge
 */

public class Ex02Singleton {
	
	private Ex02Singleton(){}
	
	/*
	 * 1.饿汉式
	 * 先实例化一个对象，不存在线程不安全，但是没有延迟加载
	private static Ex01Singleton singleton = new Ex01Singleton();
	public static Ex01Singleton getInstance(){			
		return singleton;
	}*/
	/*
	 * 2.双重检查锁（DLC）+volatile关键字
	 * volatile关键字防止指令重排序，之后双重检查锁（DLC）进行二次判断，能有效避免线程不安全
	private static volatile Ex01Singleton singleton;
	public static Ex01Singleton getInstance(){
		if(singleton == null){
			synchronized (Ex01Singleton.class){
				if(singleton == null){
					singleton = new Ex01Singleton();
				}
			}
		}
		return singleton;
	}*/
	/*
	 * 3.延迟初始化占位类模式（Holder）又称Initialization on Demand Holder (IoDH)
	 * 由静态内部类InstanceHolder负责实例化singleton，不存在线程不安全，也实现了延迟加载
	 private static class InstanceHolder{
		public static Ex01Singleton singleton = new Ex01Singleton();	
	}
	public static Ex01Singleton getInstance(){			
		return InstanceHolder.singleton;
	}*/
	
	/*
	 * 4.枚举
	 * 现实中较少见
	 public enum Singleton{
	  	INSTANCE:
	   	public void whateverMethod(){}
	 }
	 */
	
}
