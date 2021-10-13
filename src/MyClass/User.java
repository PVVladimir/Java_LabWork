package MyClass;

public abstract class User implements PrintData{
    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
    }

    public User(){
        this.id=0;
        this.login="guest";
        this.password="";
    }

    //public abstract void printUser();

    public void setId(int id){
        this.id=id;
    }

    public void setId(){
        setId(0);
    }

    public void setLogin(String login){
        this.login=login;
    }

    public void setLogin(){
        setLogin("guest");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword(){
        setPassword("");
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getTextInfo(){
        return "id = "+getId()+"; логин = " + getLogin()+"; password = "+getPassword();
    }

}
