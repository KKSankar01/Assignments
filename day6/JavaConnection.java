package week3.day6;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connect with browser");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect with browser");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the update in browser");
		
	}
	
	public static void main(String[] args) {
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeQuery();
		obj.executeUpdate();
	}

}
