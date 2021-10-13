package MyClass;

public class WebMaster extends User implements Cloneable {
    private String url;

    public WebMaster(int id, String login, String password, String url) {
        super(id, login, password);
        this.url = url;
    }

    public WebMaster() {
        super();
        this.url = "wwww.google.ru";
    }

    @Override
    public void printUser() {
        System.out.println(super.getTextInfo() + "; ссылка = " + getUrl());
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUrl() {
        this.url = "wwww.google.ru";
    }

    public String getUrl() {
        return url;
    }

    public String getTextInfo() {
        return super.getTextInfo() + "; ссылка = " + getUrl();
    }

    @Override
    public String toString() {
        return super.getTextInfo() + "; ссылка = " + getUrl();
    }

    public WebMaster clone (){
        return  new WebMaster(this.getId(), this.getLogin(), this.getPassword(), this.url);
    }
}
