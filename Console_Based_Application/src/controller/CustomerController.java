package controller;
import java.util.*;
import java.util.Scanner;

import model.CustomerModel;
import services.CustomerService;

public class CustomerController implements CustomerService{
    ArrayList<CustomerModel> cusArr=new ArrayList<>();
    
    int id=0;
     
	public void createCustomer() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the name:");
		String name =in.nextLine();
		System.out.println("Enter the email :");
		String email = in.nextLine();
		CustomerModel cm=new CustomerModel(name,email,id);
		cusArr.add(cm);
		System.out.println("Customer succesfully created");
		id++;
	}
	
	
	public void displayCustomer() {
		for(CustomerModel cm : cusArr) {
			System.out.println("Email :"+cm.getName());
			System.out.println("Name: "+cm.getMailid());
			System.out.println("Cus id : "+cm.getId());
		}
			
		}
	
	public void changeName() {
		Scanner in =new Scanner(System.in);
		System.out.println("1.Name \n2.email");
		int n=in.nextInt();
		System.out.println("Enter the id:");
		int id=in.nextInt();
		switch(n) {
		case 1:{
			System.out.println("Enter the customer name to change");
			in.nextLine();
			String name=in.nextLine();
			cusArr.get(id).setName(name);
			System.out.println("Name changed Succesfully");
			break;
		}
		
		case 2:{
			System.out.println("Enter the customer Email id to change");
			in.nextLine();
			String email=in.nextLine();
			cusArr.get(id).setMailid(email);
			System.out.println("Email changed Succesfully");
			break;
			
		}
		case 3:{
			return;
		}
		}
	
		
	}
	
	public void deleteCustomer() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=in.nextInt();
		int index=0;;
		for(CustomerModel cus:cusArr) {
			if(cus.getId()==id) {
				cusArr.remove(index);
				System.out.println("removed successfully");
				break;
			}
			index++;
		}
		
	}
}
