package midterm;

public class NonFiction extends Book implements iBorrowable {
    private int borrowDate;
    private int returnDate;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle() + " all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if (day >= this.borrowDate && day <= this.returnDate) {
            return false;
        } else {
            return true;
        }
    }
}
