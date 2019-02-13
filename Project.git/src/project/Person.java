/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author oguzhan
 */
public class Person {
    private String Name;
    private String SurName;
    private long TC;
    protected int customerNO = 195970;
    private String Date;
    private String DateOut;
    private static int num= 0;
    private double loan;
    private String roomType;
    private String telNo;
    private String roomNumber; 
    private String depart;
    private String address;
    private String lang;
    private String nation;
    private String salary;
            
    
    public Person (String Name, String SurName,long TC,String telNo, String Date,String DateOut,String price,String nation,String lang,String department,String address)// for employee
    {
       this.Name = Name;
       this.SurName = SurName;
       this.TC = TC;  
       this.Date = Date;
       this.DateOut = DateOut;
       this.telNo = telNo;
       this.salary = price;
       this.nation = nation;
       this.lang = lang;
       this.address = address;
       this.depart = department;
    
    }

    public String getSalary() {
        return salary;
    }
    public Person(String Name, String SurName, long TC,String telNo, String Date,String DateOut,String roomType,double price,String roomNumber) { // for customers
        this.Name = Name;
        this.SurName = SurName;
        this.TC = TC;  
        this.customerNO += num ;
        num++;
        this.Date = Date;
        this.DateOut = DateOut;
        this.telNo = telNo;
       this.roomType = roomType;
       this.loan = price;
       this.roomNumber = roomNumber;
    }
    public Person(int CustNo ,String Name, String SurName, long TC,String telNo, String Date,String DateOut,String roomType,double price,String roomNumber) {
        this.Name = Name;
        this.SurName = SurName;
        this.TC = TC;  
        this.customerNO = CustNo ;
        num++;
        this.Date = Date;
        this.DateOut = DateOut;
        this.telNo = telNo;
       this.roomType = roomType;
       this.loan = price;
       this.roomNumber = roomNumber;
    }
   public Person(String Name, String SurName, long TC, String Date,String DateOut,String telNo,String roomNumber) {
        this.Name = Name;
        this.SurName = SurName;
        this.TC = TC;  
        this.customerNO += num ;
        num++;
        this.Date = Date;
        this.DateOut = DateOut;
       this.telNo = telNo;
       this.roomNumber = roomNumber;
    }

    public String getDateOut() {
        return DateOut;
    }
    public void setCustomerNO(int customerNO) {
        this.customerNO = customerNO;
    }

    public String getDepart() {
        return depart;
    }

    public String getAddress() {
        return address;
    }

    public String getLang() {
        return lang;
    }

    public String getNation() {
        return nation;
    }

    
    public String getTelNo() {
        return telNo;
    }

    public String getName() {
        return Name;
    }

    public String getSurName() {
        return SurName;
    }

    public long getTC() {
        return TC;
    }

    public int getcustomerNO() {
        return customerNO;
    }

    public String getDate() {
        return Date;
    }

    public double getLoan() {
        return loan;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "Name: "+this.Name+"\nSurname: "+this.SurName+"\nTC/ID: "+this.TC+"\nTelephone: "+this.telNo+"\nBirthDate: "+this.Date+"\nRegistrationDate: "+this.DateOut+"\nSalary: "+this.salary+"\nAddress: "+this.address+"\nNationality: "+this.nation+"\nLanguages: "+this.lang+"\nDepartment: "+this.depart+"\n";                                         
    }
    
  public static Person create(int id,String Name, String SurName, long TC,String telNo,String Date,String DateOut,String type,double price,String roomNumber)
   {
       return new Person( id,Name,  SurName, TC,telNo, Date,DateOut, type, price,roomNumber);
   }
    
  public static Person create2(String Name, String SurName, long TC,String telNo,String Date,String DateOut,String type,double price,String roomNumber)
   {
       return new Person( Name,  SurName, TC,telNo, Date,DateOut, type, price,roomNumber);
   }
   public static Person create3(String Name, String SurName, long TC,String telNo,String Date,String DateOut,String roomNumber)
   {
       return new Person( Name,  SurName, TC, Date,DateOut,telNo,roomNumber);
   }
    public static Person create(String name,String surname,long tc,String tel,String date1,String date2,String salary,String nation,String lang,String department,String address)
   {
       return new Person( name,surname,tc,tel,date1,date2,salary,nation,lang,department,address);
   }
}
