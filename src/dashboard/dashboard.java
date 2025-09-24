
package dashboard;

 import main.main;
 import config.config;


public class dashboard {
    
    public void addUser(){
    
        System.out.println("\nAdd User");
        System.out.println("Add user Name: ");
        String name = main.inp.nextLine();
        
        System.out.println("Enter user Contact: ");
        String contact = main.inp.nextLine();
        
        System.out.println("Enter user Address: ");
        String address = main.inp.nextLine();
    
        System.out.println("Enter Role: ");
        String role = main.inp.nextLine();
        
        config con = new config();
        String sql = "INSERT INTO tbl_user (u_name, u_contact, u_address, role) VALUES(?, ?, ?, ?)";
        con.addRecord(sql, name, contact, address, role);
    }    
    
    public void viewUser(){
    
        config con = new config();
        String hazardQuery = "SELECT * FROM tbl_user";
        String[] hazardHeaders = {"ID", "NAME", "CONTACT", "ADDRESS", "ROLE"};
        String[] hazardColumns = {"u_id", "u_name", "u_contact", "u_address", "role" };
        con.viewRecords(hazardQuery, hazardHeaders, hazardColumns);
    
    }
    
    public void updateUser(){
    
        System.out.println("Enter id to update: ");
        int uid = main.inp.nextInt();
        main.inp.nextLine();
        
        System.out.println("Add new User Name: ");
        String name = main.inp.nextLine();
        System.out.println("Enter new user Contact: ");
        String contact = main.inp.nextLine();
        
        System.out.println("Enter new user Address: ");
        String address = main.inp.nextLine();
    
        System.out.println("Enter new Role: ");
        String role = main.inp.nextLine();
        
        config con = new config();
        String sqlUpdate = "UPDATE tbl_user SET u_name = ?, u_contact = ?, u_address = ?, role = ? WHERE u_id = ? ";
        con.updateRecord(sqlUpdate, name, contact, address, role, uid);
    
    
    }
    
    public void deleteUser(){
    
        System.out.println("Enter id to Delete ");
        int did = main.inp.nextInt();
        
        config con = new config();
        String sqlDelete = "DELETE FROM tbl_user WHERE u_id = ?";
        con.deleteRecord(sqlDelete, did);
    
    
    
    }
    
    
    
    
    
    
    
}
