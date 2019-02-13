/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oguzhan
 */
public class SystemClass {
  static  ArrayList <Person> PersonList;
  static  ArrayList <Person> EmployeeList;
    File input = new File("Customer'sList.txt");
    File emp = new File("Employee'sList.txt");
   
    public SystemClass(){
    PersonList = new  ArrayList<>();
    Scanner s;
    String Line;
    String []t = null;
    try{    
     s = new Scanner(input);
     
     while(s.hasNext())
     {
        Line = s.nextLine();
        t = Line.split(", ");
       
         
   PersonList.add(Person.create(Integer.parseInt(t[0]),t[1],t[2],Long.parseLong(t[3]),t[4],t[5],t[6],t[7],Double.parseDouble(t[8]),t[9]));
     }
    s.close();
    }catch(FileNotFoundException e){
    e.printStackTrace();
    }catch(ExceptionInInitializerError e){
    e.printStackTrace();
    }
    }
    
    public SystemClass(String P){
        String []t ;
     EmployeeList = new  ArrayList<>();
     Scanner sc;
    String name,surname,date1,date2,tel,address,nation,lang,department;
    long tc;
    String salary,Line;
    try{    
     sc = new Scanner(emp);
     while(sc.hasNext())
     {
         Line = sc.nextLine();
         t = Line.split(", ");
         
   EmployeeList.add(Person.create(t[0],t[1],Long.parseLong(t[2]),t[3],t[4],t[5],t[6],t[7],t[8],t[9],t[10]));
     }
    sc.close();
    }catch(FileNotFoundException e){
    e.printStackTrace();
    }catch(ExceptionInInitializerError e){
        
    e.printStackTrace();

    }
    }
    public void updateFile()
    {
    try {
	PrintWriter pr = new PrintWriter(input);
	    for(int i=0;i<PersonList.size();i++)
	      {
 
            pr.print(PersonList.get(i).getcustomerNO()+", ");
                 
            pr.print(PersonList.get(i).getName()+", ");
             
            pr.print(PersonList.get(i).getSurName()+", ");
             
            pr.print(PersonList.get(i).getTC()+", ");
             
            pr.print(PersonList.get(i).getTelNo()+", ");
             
            pr.print(PersonList.get(i).getDate()+", ");
             
            pr.print(PersonList.get(i).getDateOut()+", ");
            
            pr.print(PersonList.get(i).getRoomType()+", ");
             
            pr.print(PersonList.get(i).getLoan()+", ");
       
            pr.print(PersonList.get(i).getRoomNumber()+", ");
             
            pr.println();
		}
                        pr.close();
			} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
    }
    public void updateEmpFile()
    {
    try {
	PrintWriter pr = new PrintWriter(emp);
	    for(int i=0;i<EmployeeList.size();i++)
	      {
 
            
            pr.print(EmployeeList.get(i).getName()+", ");
            pr.print(EmployeeList.get(i).getSurName()+", ");
            pr.print(EmployeeList.get(i).getTC()+", ");
            pr.print(EmployeeList.get(i).getTelNo()+", ");
            pr.print(EmployeeList.get(i).getDate()+", ");
            pr.print(EmployeeList.get(i).getDateOut()+", ");
            pr.print(EmployeeList.get(i).getSalary()+", ");
            pr.print(EmployeeList.get(i).getNation()+", ");
            pr.print(EmployeeList.get(i).getLang()+", ");
            pr.print(EmployeeList.get(i).getDepart()+", ");
            pr.print(EmployeeList.get(i).getAddress()+", ");
            pr.println();
		}
                        pr.close();
			} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
    }
    public boolean searchForRoom(String roomNumber)
    {
    for(int i = 0;i< PersonList.size();i++)
    {
   if( PersonList.get(i).getRoomNumber().equals(roomNumber) )
       return false;
    }
    return true;
    }
    public boolean addNewCustomer(Person newCustomer)
    {
      if(findPerson( newCustomer.getTC() ) >= 0 )
       return false;
        
      else{
          for(int i=0;i<PersonList.size();i++){
          if(newCustomer.getcustomerNO() == PersonList.get(i).getcustomerNO())
              newCustomer.setCustomerNO(PersonList.get(PersonList.size()).getcustomerNO()+1);
              }
              
    this.PersonList.add(newCustomer);     
    return true;
     
      
     }
    }
    public boolean addNewEmployee(Person newEmp)
    {
      if(findEmp(newEmp.getTC() ) >= 0 )
       return false;
        
      else{
    this.EmployeeList.add(newEmp);     
    return true;
      }
    }
     public int findEmp(long TcNo)
    {
      for(int i = 0;i<this.EmployeeList.size();i++){
        Person thatPerson = this.EmployeeList.get(i);
        if(thatPerson.getTC() == TcNo)
            return i ;
                                                 }
     return -1;
    }
    public int findPerson(int custNO)
    {
      for(int i = 0 ; i< this.PersonList.size(); i++)
      {
        Person  thatPerson = this.PersonList.get(i);
        if(thatPerson.getcustomerNO()==custNO)
          return i ;
      }
      return -1 ;  
    }
    public int findPerson(long TcNo)
    {
      for(int i = 0;i<this.PersonList.size();i++){    
        Person thatPerson = this.PersonList.get(i);
        if(thatPerson.getTC() == TcNo)
            return i ;
                                                 }
     return -1;
    }
    
    public int delTheCustomer(int customerNO)
    {
       int i = findPerson(customerNO);
        if(i == -1 )
            return -1;
       else
       {
         PersonList.remove(i);
          return i;
        }
    
    }
    public int EditTheCustomer(int customerNO,Person edit)
    {
       
        int i = findPerson(customerNO);
       if(i == -1 )
           return -1;
       else
       {
           
           PersonList.set(i, edit);
           PersonList.get(i).setCustomerNO(customerNO);
          
          return i;
       }
      
        }
   public int inquireCustomer(int customerNO)
    {
     int i = findPerson(customerNO);
     if(i == -1)
            return -1;
     else
     {
         return i;
         
     }
    }
}


