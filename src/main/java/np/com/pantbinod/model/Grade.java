package np.com.pantbinod.model;

public class Grade {

    private int id;
    private String name;

    public Grade() {
    }


    public Grade( String name) {
        this.name = name;
    }

    public Grade(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Grade setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Grade setName(String name) {
        this.name = name;
        return this;
    }
}
