
package dashboard;

 import main.main;
 import config.config;


public class dashboard {
    
    public void addUser(){
    
        System.out.println("\nAdd User");
        
        System.out.println("Add user Name: ");
        String name = main.inp.nextLine();
        
        System.out.println("Enter Email: ");
        String email = main.inp.nextLine();
        
        System.out.println("Enter Password : ");
        String pass = main.inp.nextLine();
    
        System.out.println("Choose Role (1. Admin, 2. User): ");
        int chooseRole = main.inp.nextInt();
        
        String role = "";
        if(chooseRole == 1) {
            role = "Admin";
        } else{
            role = "User";
        }
        
        config con = new config();
        String sql = "INSERT INTO tbl_user (u_name, u_email, u_pass, u_role, u_status) VALUES(?, ?, ?, ?, ?)";
        con.addRecord(sql, name, email, pass, role, "Pending");
    }    
    
    public void viewUser(){
    
        config con = new config();
        String hazardQuery = "SELECT * FROM tbl_user";
        String[] hazardHeaders = {"ID", "NAME", "EMAIL", "PASSWORD", "ROLE", "STATUS" };
        String[] hazardColumns = {"u_id", "u_name", "u_email", "u_pass", "u_role", "u_status" };
        
        con.viewRecords(hazardQuery, hazardHeaders, hazardColumns);
    
    }
    
    public void updateUser(){
    
        System.out.println("Enter id to update: ");
        int uid = main.inp.nextInt();
        main.inp.nextLine();
        
        System.out.println("Add new User Name: ");
        String name = main.inp.nextLine();
        System.out.println("Enter new user Email: ");
        String email = main.inp.nextLine();
        
        System.out.println("Enter new user Password: ");
        String pass = main.inp.nextLine();
    
        config con = new config();
        String sqlUpdate = "UPDATE tbl_user SET u_name = ?, u_email = ?, u_pass = ?, WHERE u_id = ? ";
        con.updateRecord(sqlUpdate, name, email, pass, uid);
    
    }
    
    public void deleteUser(){
    
        System.out.println("Enter id to Delete ");
        int did = main.inp.nextInt();
        
        config con = new config();
        String sqlDelete = "DELETE FROM tbl_user WHERE u_id = ?";
        con.deleteRecord(sqlDelete, did);
    
    
    
    }
    
    public void approveUser(){
    
        System.out.println("Enter id to approve: ");
        int id = main.inp.nextInt();
        
        config con = new config();
        String sqlUpdate = "Update tbl_user SET c_status = ?, WHERE c_id = ?";
        con.updateRecord(sqlUpdate, "Approve" , id );
    
    
    }
    
}
