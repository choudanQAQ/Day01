package cuishihao.bawie.com.day01;


public class User {
    private String title;

    @Override
    public String toString() {
        return "User{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User(String title) {

        this.title = title;
    }
}