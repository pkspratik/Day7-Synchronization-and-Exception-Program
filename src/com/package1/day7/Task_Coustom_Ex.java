package com.package1.day7;
import java.util.*;
class Under_Exception extends Exception{
	  public String toString() {
	      return " Under_Age_Exception";
	  }
	}
class Over_Exception extends Exception{
	  public String toString() {
	      return "Over_Age_Exception ";
	  }
	}

class Check_Age{
	int age ;
	
	
	void under_ex_Age() throws Under_Exception ,Over_Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		
		age= sc.nextInt();
	
		if(age < 18) {
			Under_Exception ice = new Under_Exception();
            System.out.println(ice.toString());
            throw ice;
			
		}
		else if(age > 65){
			Over_Exception ice = new Over_Exception();
            System.out.println(ice.toString());
            throw ice;
		}
		else if( age >= 18 && age <=65) {
			System.out.println("Give the licence");
		}
		
		
		
	}
}

class Man_Age{
    void customerCheck() {
        Check_Age c1 = new Check_Age();
       
        try {
        c1.under_ex_Age();
        }
        catch (Exception  e) {
            // TODO: handle exception
           // System.out.println(e.toString());
        }
    }
}

public class Task_Coustom_Ex {

	public static void main(String[] args) {
		
		Man_Age m = new Man_Age();
		m.customerCheck();
		// TODO Auto-generated method stub

	}

}
