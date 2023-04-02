public abstract class Agent {
    private String name;
    private final int id;

    public Agent(String name, int id){
        this.name=name;
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract String getAgentType();

    @Override
    public String toString(){
        return String.format("(name: %s, id: %d)", getName(), getId());
    }
}
