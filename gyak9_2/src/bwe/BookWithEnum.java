package bwe;

public class BookWithEnum {
	public enum style {
		SCIFI, COOK, ROMANCE, OTHER
	}

	private style bookStyle;

	public BookWithEnum(String title, String author, int dateOfissue, int price, style bookStyle) {
		super();
		this.bookStyle = bookStyle;
	}

	public String toString() {
		return super.toString() + " style " + this.bookStyle;
	}

	public style getBookStyle() {
		return bookStyle;
	}

	public void setBookStyle(style bookStyle) {
		this.bookStyle = bookStyle;
	}

}
