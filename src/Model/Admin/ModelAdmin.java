package Model.Admin;

public class ModelAdmin {
    private String username;
    private String password;
    
    public void setUsername(String usernameUser){
        this.username = usernameUser;
    }
    public void setPassword(String passwordUser){
        this.password = passwordUser;
    }
    public String GetUsername(){
        return username;
    }
    public String GetPassword(){
        return password;
    }
    
}


