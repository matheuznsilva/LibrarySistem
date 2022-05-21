package exceptions;

public class domineException extends Exception{
    private String userEmail;
	
	public domineException(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getEmail() {
		return userEmail;
	}   
}
