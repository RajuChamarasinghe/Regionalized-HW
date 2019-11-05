import sun.net.www.content.text.plain;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private double targetAdherence;

    public User(String firstName, String lastName, String email, int age, double targetAdherence) {
        this.age = age;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.targetAdherence = targetAdherence;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
    
    public double getTargetAdherence() {
        return targetAdherence;
    }
}