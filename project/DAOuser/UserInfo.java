package project.DAOuser;

public class UserInfo {
    
    private int id;
    private  String name;
    private String email;
    private String password;
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    
    public String getEmail(){
        return email;
    }
    
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
