package WhyWeUseextends;

public class Media {
	private int id;
	private String title;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + "]";
	}

	
}

//Here is the notes:-

//What is extends and why we use it?

//1. Extends is the keyword, which is used t access the properties of parent class to its child class.
//2. Technically, we can say that inheriting the properties of super-class to its child-class is known as extends.
//3. Derived class can have only one base class because, because in java it does not support multiple inheritance.
//4. Derived is nothing but its known as child-class or sub-class.

//see the above example carefully and now we need to create one more class where we can extends the parent class properties
//to its child class....so here Media is the parent class and Audio is its child class and more child class called Media .....let see:-
