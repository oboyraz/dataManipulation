public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;

    public User(int id, String first_name, String last_name, String email, String gender) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getGender() {
        return gender;
    }
}
