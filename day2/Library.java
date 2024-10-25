package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj=new Library();
		obj.addBook("Dr. APJ Abdul kalam");
		obj.issueBook();
	}
	public String addBook(String bookTitle) {
		System.out.println(bookTitle+ " book is added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

}
