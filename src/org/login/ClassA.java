package org.login;

public class ClassA implements Vellalar,Bvb

{
	public void studentAruna()
	{
		System.out.println("My name is Aruna. I am from Class A, I am from Vellalar school");
	}
	public void studentAnusha()
	{
		System.out.println("My name is Anusha. I am from Class A, I am from Vellalar school");
	}
	
	public void studentAjay() 
	{
		System.out.println("My name is Ajay I am from Vellalar");		
	}
	public void studentAshish()
	{
		System.out.println("My name is Ashish I am from Vellalar");	
	}
	public void studentAnjana() 
	{
		System.out.println("My name is Anjana I am from Bvb");	
	}
	public void studentAkila() 
	{
		System.out.println("My name is Akila I am from Bvb");
	}
	
public static void main(String [] args)
{
	ClassA v = new ClassA();
	ClassB x = new ClassB();
	v.studentAnusha();
	v.studentAruna();
	v.studentAjay();
	v.studentAshish();
	x.studentYuvashree();
	x.studentShunmathi();
	v.studentAnjana();
	v.studentAkila();
	
}


}
