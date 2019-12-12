package np.com.pantbinod.enumlist;

public enum  ActionList {
    ADD("ADD"),
    DELETE("DELETE"),
    UPDATE("UPDATE"),
    ALL("ALL");

    private String action;

    ActionList(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


}
