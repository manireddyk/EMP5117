//EMP5117
//Winter 2019
//Assignment-2

public class Library {

	Book[] books = null;
	int bookPointer = 0;
	public Library(int size){

		books = new Book[size];
	}

	void addBook(Book book){
		if(bookPointer == (books.length -1)){
			System.out.println("The library is full");
		}
		else{
			books[bookPointer] = book;
			bookPointer++;
		}
	}

	void printLibrary(){
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null){
				System.out.println(books[i].toString());
			}
		}
	}

	void searchAuthor(String author){
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].author.equals(author)){
				System.out.println(books[i].toString());
			}
		}
	}

	void searchTitle(String title){
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].title.equals(title)){
				System.out.println(books[i].toString());
			}
		}
	}

	void searchYear(int year){
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].year == year){
				System.out.println(books[i].toString());
			}
		}
	}


}
