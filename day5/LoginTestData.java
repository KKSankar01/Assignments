package week3.day5;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Username for this LoginTestData website is Sankar K K");
	}
	
	public void enterPassword() {
		System.out.println("Password for this LoginTestData website is KLSP@family01");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData obj=new LoginTestData();
		obj.enterCredentials();
		obj.enterPassword();
		obj.enterUsername();
		obj.navigateToHomePage();

	}

}
