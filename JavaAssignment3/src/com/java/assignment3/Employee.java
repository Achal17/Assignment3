//write a java program that should be able to- 

//1.    Retrieve list of all junior employees for the given name
//2.    Retrieve manager for a particular employee

// I have a blocker in this program i will talk to my mentor and will resolve it.
package com.java.assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee {    
    public  void findEmployee(Map<Employee_info, Employee_info> dataset)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the manager name ");
        String manager_name=sc.nextLine();

        Map<Employee_info, List<Employee_info> > map=new HashMap<Employee_info, List<Employee_info>>();
        
        
         for(Employee_info employee: dataset.keySet())
         {
        	 Employee_info manager=dataset.get(employee);
                 
                 if(!manager.equals(employee))
                 {
                     
                     if(map.containsKey(manager))
                     {
                         List<Employee_info> emp=map.get(manager);
                         emp.add((Employee_info) employee); 
                     }
                     else
                     {
                         List<Employee_info> SortedEmp=new ArrayList<>();
                         SortedEmp.add((Employee_info) employee);
                         map.put(manager, SortedEmp);
                     }
                 }
         }
        
         for(Employee_info employee : map.keySet()) {
                if(manager_name.equals(employee.getName())) {
                    System.out.println("Junior employees are: "  +map.get(employee).toString());
                }
         }
    }
    
    public  void findManager(Map<Employee_info, Employee_info> dataset)
    {
         
        Scanner sc=new Scanner(System.in);
         System.out.print("enter name of employee : ");
         String emp_name=sc.nextLine();
         
         for(Employee_info emp: dataset.keySet())
             {
                 if(emp_name.equals(emp.getName()))
                 {
                     System.out.println("manager of "+emp_name+" => "+ dataset.get(emp).toString());
                 }
                 
             }
        
        
    }
}
         
 



