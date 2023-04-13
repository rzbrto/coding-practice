package secondJavaCourse.Assignment6;

public class DVD {
    private String title, category, year;
    private int time;
    private float price;

    public DVD(String title, String category, int time, String year, float price) {
        this.title = title;
        this.category = category;
        this.time = time;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getYear() {
        return year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return """
                Title:    %s
                Category: %s
                Time:     %s
                Year:     %s
                Price:    $%.2f
                """.formatted(title, category, time, year, price);
    }
}
