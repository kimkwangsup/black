package day24;

import java.io.*;

public class BlackPink implements Serializable{ 
	// 이 클래스가 직렬화가 되려면 반드시 직렬화 가능한 클래스가 되어야 한다.
	private String name, tel, mail;
	private int age;
	private double height;
	public BlackPink() {}
	public BlackPink(String name, String tel, String mail, int age, double height) {
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
