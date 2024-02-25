package free_trial_ryu;

public class Author {
    private String name;
    private String penname;
    public Author(String name, String penname) {
        this.name = name;
        this.penname = penname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPenname() {
        return penname;
    }
    public void setPenname(String penname) {
        this.penname = penname;
    }
}
