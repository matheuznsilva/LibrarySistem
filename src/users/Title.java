package users;
import exceptions.domineException;
import exceptions.emailInvalidException;

public class Title extends User{
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws domineException, emailInvalidException {
        if(!email.contains("@")){
            throw new emailInvalidException(email);
        } else if (!email.contains(".com")){
            throw new domineException(email);
        } 
        this.email = email;
    }

    public String toString() {
        return "USER: " + name + " - EMAIL: " + email;
    } 
    
}
