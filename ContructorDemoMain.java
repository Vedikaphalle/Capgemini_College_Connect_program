package com.contructor;
class Student{
	String sname;
	int sid;
	
	public Student(int sid, String sname) {
		this(10);
		//this and supper must in first line in constructor
		//super();
		
		System.out.println("sid :"+this.sid);
		System.out.println("sname :"+this.sname);
		
		this.sid = sid;
		this.sname = sname;
		System.out.println("preent Oject :"+this);
		
	}
	
	public Student(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("no argument constructor");
		System.out.println(this);
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
}

public class ContructorDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student(10,"abc");
		Student std1=new Student(11,"xyz");
		
		//Student std3=new Student();
		
		System.out.println("sid "+std.sid);
		System.out.println("sname :"+std.sname);
		//System.out.println("sid "+std3.sid);
		//System.out.println("sname :"+std3.sname);
	
	}

}
