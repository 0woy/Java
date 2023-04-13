package Week7;

import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[2];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<books.length;i++) {
			System.out.print("제목 >>");
			String title = scanner.nextLine();
			System.out.print("저자 >>");
			String author = scanner.nextLine();
			
			books[i]= new Book(title, author);
		}
		for(int i=0;i<books.length;i++)
			System.out.println("("+books[i].title+","+books[i].author+")");
		scanner.close();
	}
	

}
