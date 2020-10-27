package company;

public class Books {
    public String title;
    public String author;
    boolean borrowing;
    private String borrower;
    private int borrowerId;

    public Books(String title, String author, boolean borrowing, String borrower, int borrowerId) {
        this.title = title;
        this.author = author;
        this.borrowing = borrowing;
        this.borrower = borrower;
        this.borrowerId = borrowerId;
    }

    public static void main(String[] args) {
        Books bookOne = new Books("Pan Tadeusz", "Adam Mickiewicz", true, "Jan Kowalski", 1);

        if (bookOne.borrowing = true) {
            System.out.println("Książka " + bookOne.title + " jest wypożyczona");
        } else {
            System.out.println("Możesz wypożyczyć książkę " + bookOne.title);
        }
    }
}

