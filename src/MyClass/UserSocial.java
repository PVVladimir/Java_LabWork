package MyClass;

public class UserSocial extends User implements Cloneable {

    private String name;
    private int age;

    public UserSocial(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;
    }

    public UserSocial() {
        super();
        this.name = "Default name";
        this.age = 18;
    }

    @Override
    public void printUser() {
        System.out.println(super.getTextInfo() + "; имя = " + getName() + "; возраст = " + getAge());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getTextInfo() {
        return super.getTextInfo() + "; имя = " + getName() + "; возраст = " + getAge();
    }

    @Override
    public String toString() {
        return super.getTextInfo() + "; имя = " + getName() + "; возраст = " + getAge();
    }

    public UserSocial clone() {
        return new UserSocial(this.getId(), this.getLogin(), this.getPassword(), this.getName(), this.getAge());
    }
}
