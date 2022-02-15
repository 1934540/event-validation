public class Event {
    private String title;
    private int realiseYear;
    private int age;

    public Event(String title, int realiseYear, int age) {
        this.title = title;
        this.realiseYear = realiseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRealiseYear() {
        return realiseYear;
    }

    public void setRealiseYear(int realiseYear) {
        this.realiseYear = realiseYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("title='").append(title).append('\'');
        sb.append(", realiseYear=").append(realiseYear);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
