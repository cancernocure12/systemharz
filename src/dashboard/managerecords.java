
package dashboard;

    import main.main;
    import config.config;


public class managerecords {
    
    public void managehazard(int uid){
        
        
        
            String response;
    
        do{
           System.out.println("\n\n====================================");
            System.out.println("=========| MANAGE RECORDS |========");
            System.out.println("====================================");
            System.out.println("1. Add Records    ");
            System.out.println("2. View Records   ");
            System.out.println("3. Update Records ");
            System.out.println("4. Delete Records ");
            System.out.println("5. Exit ");

            System.out.print("\nChoose an option: ");
            int option = main.inp.nextInt();
            main.inp.nextLine();
            
            switch(option){
                
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    
                    break;    
                    
                case 4:
                    
                    
                    break;    
                case 5:    
                    main.adminDashboard(uid);
                    break;
                    
                    default: System.out.println("\nInvalid input, Try Again."); 
            }
    
            System.out.print("\nDo you want to continue (yes / no): ");
            response = main.inp.next();
            }while(response.equals("yes") || response.equals("1"));
            main.adminDashboard(uid);
        
        
        
        
    }
}
