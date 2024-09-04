import java.sql.*;
public class Customer {




    
    private int cus_id;
    private String name;
    private String cus_add;
    private int cus_mo_no;
    private int cus_gend;
    private String cus_dob;
    private String cus_email;
    public Customer(){}
    public Customer(int cus_id,String name,String cus_add,String cus_mo_no,int cus_gend,String cus_dob,String cus_email){
        this.cus_id=cus_id;
        this.name=name;
        this.cus_add=cus_add;
        this.cus_mo_no=cus_mo_no;
        this.cus_gend=cus_gend;
        this.cus_dob=cus_dob;
        this.cus_email=cus_email;
    }

}
