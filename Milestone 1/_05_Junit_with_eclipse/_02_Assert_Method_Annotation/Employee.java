package _02_Assert_Method_Annotation;

import java.util.ArrayList;

public class Employee {
	public String findName(ArrayList<String> employees,String name){
		
		  String result="";
		  if(employees.contains(name)){
		   result="FOUND";
		  }else{
		   result="NOT FOUND";
		  }
		  return result;
		 }

	public static void main(String[] args) {
		Employee obj=new Employee();
		ArrayList<String> str123=new ArrayList<String>();
		str123.add("Aravinth");
		str123.add("Mahi");
		str123.add("Dhoni");
		System.out.println(obj.findName(str123,"Mahi"));
		System.out.println(obj.findName(str123,"Aravind"));
	}
}
