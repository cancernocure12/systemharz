
package main;

import config.config;
import dashboard.dashboard;
import java.util.Scanner;


public class main {
    public static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
    config con = new config();
    
        String response;
        do{
            System.out.println("=====WELCOME TO MY SYSTEM=====");
            System.out.println("1. Add user: ");
            System.out.println("2. View user: ");
            System.out.println("3. Update user: ");
            System.out.println("4. Delete user: ");

            System.out.println("\nChoose an Option: ");
            int option = inp.nextInt();
            inp.nextLine();

            dashboard cd = new dashboard();

            switch(option){

                case 1: 
                    cd.addUser();
                    break;

                case 2:
                    cd.viewUser();
                    break;

                case 3:
                    cd.viewUser();
                    cd.updateUser();
                    break;

                case 4:
                    cd.viewUser();
                    cd.deleteUser();
                    break;
                
       
        }
        
            System.out.println("Do you want to continue(yes/no): ");
            response = inp.nextLine();
        }while(response.equals("yes") );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
