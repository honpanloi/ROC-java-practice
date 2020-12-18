package custom_demo;

public class Validdation {

	public boolean isValid(int age) throws InvalidAgeException {
		
		if(age <= 0) {
			throw new InvalidAgeException("Age cannot be zero or -ve");
		}
		
		if(age <=18 || age > 40) {
			throw new InvalidAgeException("Only users between age 18 and 40 are accepted");
		}
		
		return true;
	}
	
	public boolean isValidMobileNumber(String mobileNumber) throws BusinessException{
		
		if(!mobileNumber.matches("\\+1-[0-9]{10}")) {
			throw new BusinessException("Entered Mobile Number "+mobileNumber+" is inbalid");
		}
		
		return true;
	}

}
