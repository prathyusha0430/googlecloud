package oops;

import oops1.*;

interface bike 
{
	void run();
	void drive();
}

abstract class pulsarExtend implements bike {
	
	public void run() {
		System.out.println("to slow");
		
	}
	
	abstract void ABS();
}

 class pulsar extends pulsarExtend
{
	 
	 // u can overide
	public void run() {
		System.out.println("medium");
	}
	
	public void drive() {
		
		System.out.println("started");
		
	}
	 
	public void ABS() {
		
		System.out.println("ABS");
	}
	

}
//class pulsar implements bike
//{
//  public void run()
//  {
//	  
//	  System.out.println("pulsar");
//  }
//  public void drive()
//  {
//	  
//	  System.out.println("too slow");
//  }
//}
class Honda implements bike
{
  public void run()
  {
	  
	  System.out.println("honda");
  }
  public void drive()
  {
	  
	  System.out.println("too fast");
  }

}

interface Car2{
	 
	  void carModel();
}
class EncapsulationCAR implements Car2
{
	String steering;
	int kilometers = 10;
	
	void driving()
	{
		System.out.println("Driving");
	}
   
	int Speed()
	{
		return kilometers;
		
	}
	 public void carModel() {
		 
		 System.out.println();
	 }
	
}

class inheritpc extends StaticClass{
	
	
}

public class FirstOOPS extends ProtectedClass {
int i =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationCAR EC = new EncapsulationCAR();
		EC.driving();
		EC.carModel();
		System.out.println(EC.Speed());
		System.out.println("Hello World");
        Car c  = new Car();
        c.carModel();
        Car1 c1  = new Car1();
        c1.carModel1();
        PrivateClass pc = new PrivateClass();
		System.out.println(pc.preturnvarfun());
		//ProtectedClass ptc = new ProtectedClass();
	    
		FirstOOPS fo = new FirstOOPS();
		System.out.println(fo.ptvarfun());
//STA
		System.out.println(StaticClass.staticvarfunc());
		
		pulsar pl =  new pulsar();
		pl.run();
		
	}

}
