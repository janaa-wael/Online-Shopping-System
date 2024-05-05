/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Jana Wael
 */
public class Admin extends User{
    
    private HashMap<String, String> CustomersList;
    private ArrayList <Double> Percentages;
    private int step;
    private int base;
    
    private void set_admin_name(String name)
    {
        super.name = name;
    }
    
    private void set_admin_email(String email)
    {
        super.email = email;
    }
    
    private void set_admin_password(String password)
    {
        super.password = password;
    }
    
    private void setCustomersList(HashMap<String,String> hm)
    {
        CustomersList = hm;
    }
    private void setBase(int base)
    {
        this.base = base;
    }
    
    private void setStep(int step)
    {
        this.step = step;
    }
    
    private void setPercentages()
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double p;
        do
        {
            System.out.println("Would you like to add new percentages?1-Yes\n2-No");
            choice = scanner.nextInt();
           
            if(choice==1)
            {
                System.out.println("Enter new percentage for the following range : " + (base+step*(Percentages.size())) + "-->" + (base+step*(Percentages.size()+1)));
                p = scanner.nextDouble();
                Percentages.add(p);
            }
        }while(choice==1);
    }
    
    public String getName()
    {
        return super.name;
    }
    
    public int getStep()
    {
        return step;
    }
    
    public ArrayList<Double> getPercentages()
    {
        return Percentages;
    }
    
    
    public String getAdminPassword() //I don't whether the method is logical
    {
        return super.password;
    }
    
    public HashMap<String,String> getCustomersList()
    {
        return CustomersList;
    }
    
    public void addUser()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Customer Name : ");
        String name = scanner.nextLine();
        
        System.out.println("Enter Customer Username : ");
        String username = scanner.nextLine();
       
        System.out.println("Enter Customer Password : ");
        String user_password = scanner.nextLine();
       
        CustomersList.put(username, user_password);
        customers.add(name);
    }
    
    public void findUser(String name)
    {
         if(CustomersList.containsValue(name))
         {
             System.out.println("Customer already exists in the system.\n");
         }
         else
         {
             System.out.println("Customer doesn't exist in the system.\n");
         }
    }
    
    public void removeUser(String username, String name) //shall i remove the user by his id (his index in the hashmap and arraylist) instead of passing his name and username?
    {
        CustomersList.remove(username);
        customers.remove(name);
    }
    
    public void addProduct(Products p)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product Nme: ");
        String username = scanner.nextLine();
        p.setName(username);
        
        System.out.println("Enter Product Price: ");
        int price = scanner.nextInt();
        p.setPrice(price);
        
        System.out.println("Enter Product Id: ");
        int id = scanner.nextInt();
        p.setId(id);
        
        System.out.println("Enter Product Description: ");
        String description = scanner.nextLine();
        p.setDescription(description);
        
        products.add(p);
    }
    
    public void removeProduct(Products p)
    {
        products.remove(p);
    }
    
    public void editProduct(Products p) //shall we pass the product as object or pass the id?
    {
        int choice;
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which field would you like to edit:\n1-Name\n2-Price\n3-Id\n4-Description\n5-All Product Info");
            choice = scanner.nextInt();
            switch(choice)
                {
               case 5 : 
               case 1 :
                    System.out.println("Enter Product Nme: ");
                    String name = scanner.nextLine();
                    p.setName(name);
                    if(choice!=5)
                        break;
                 case 2 : 
                    System.out.println("Enter Product Price: ");
                    int price = scanner.nextInt();
                    p.setPrice(price);
                    if(choice!=5)
                        break;
                case 3 :
                    System.out.println("Enter Product Id: ");
                    int id = scanner.nextInt();
                    p.setId(id);
                    if(choice!=5)
                        break;
                    
                 case 4 : 
                    System.out.println("Enter Product Description: ");
                    String description = scanner.nextLine();
                    p.setDescription(description);
                        break;
            
                default :
                    System.out.println("Invalid Input, please try again.\n");
            }
        }while(choice>5 || choice<1);
      
    }
    
    public boolean authenticate()
    {
        Scanner scanner = new Scanner(System.in);
             
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
            
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        return (CustomersList.get(username)).equals(password); 
    }
    
    public int getNumberOfCustomers()
    {
        return customers.size();
    }
    
    public int getNumberOfProducts()
    {
        return products.size();
    }
    
    
    
}
