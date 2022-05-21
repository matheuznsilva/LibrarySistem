package exceptions;

public class emailInvalidException extends Exception{
    
    private String userEmail;
	
	public emailInvalidException(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getEmail() {
		return userEmail;
	}    
}
