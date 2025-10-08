
package validation;

import main.main;
import config.config;

public class validation {
    
    public void register(){
        config con = new config();
        
        System.out.println("Add user name: ");
        String name = main.inp.nextLine();
        while(true){
            String qry = "SELECT * FROM tbl_user WHERE u_name = ?";
            java.util.List<java.util.Map<String, Object>> result = con.fetchRecords(qry,name);

            if (result.isEmpty()) {
                break;
            } else {
                System.out.print("Username already exists, Enter other Username: ");
                name = main.inp.next();
            }
        }
        main.inp.nextLine();
        System.out.println("Enter user email: ");
        String email = main.inp.nextLine();
        
        System.out.println("Enter password: ");
        String pass = main.inp.nextLine();
        System.out.println("Choose role (1. Admin, 2. User): ");
        int chooseRole = main.inp.nextInt();
        
        String role = "";
        if(chooseRole == 1){
            role = "Admin";
        }else{
            role = "User";
            
        }
        
        
        String sql = "INSERT INTO tbl_user(u_name, u_email, u_pass, u_role, u_status) VALUES(?, ?, ?, ?, ?)";
        con.addRecord(sql, name, email, pass, role, "Pending");
    }

public void login(){

    System.out.println("Enter email: ");
    String email = main.inp.nextLine();
    System.out.println("Enter Password: ");
    String pass = main.inp.nextLine();
    
    config con = new config();
    String role = con.login(email, pass);
    
    if(role != null){
        if (role.equalsIgnoreCase("Admin")){
            main.loginDashboard();
        }else{
            System.out.println("Invalid");
        }
    }


}

}

