package com.designModel;
/**
 * 饿汉模式
 * @author jackie202333
 *
 */
public class SingleTon {
	private SingleTon(){}
	private static SingleTon singleTon = new SingleTon();
	public static SingleTon getInstance(){
		return singleTon;
	}

}
/**
 * 懒汉模式
 * @author jackie202333
 *
 */
class SingleTon01 {
	private SingleTon01(){}
	private static SingleTon01 singleTon01;
	public static SingleTon01 getInstance(){
		if(singleTon01 == null){
			singleTon01 = new SingleTon01();
		}
		return singleTon01;
	}
	
}
