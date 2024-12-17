package com.logesh.assignment;
import com.logesh.assignment.employees.Manager; 
import com.logesh.assignment.employees.Developer; 
import com.logesh.assignment.utilities.Employeeutilities;
public class Assignment {
	  public static void main(String[] args) { 
	        Manager manager = new Manager("John", 101, 90000, "Sales"); 
	        Developer developer = new Developer("Alice", 102, 80000, "Java"); 
	        EmployeeUtilities.printEmployeeDetails(manager); 
	        EmployeeUtilities.printEmployeeDetails(developer); 
	    }

}
