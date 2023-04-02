public abstract class Agent {
    private String name;
    private int ID;
    public Agent(String name, int ID){
        this.name=name;
        this.ID=ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public abstract String getAgentType();

    @Override
    public String toString(){
        return String.format("(name: %s, id: %d)", getName(), getID());
    }
}
