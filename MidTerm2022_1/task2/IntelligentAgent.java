public class IntelligentAgent extends Agent{
    private IntelligentAgentType type;
    public IntelligentAgent(String name, int id, IntelligentAgentType type){
        super(name, id);
        this.type=type;
    }
    public void setType(IntelligentAgentType type) {
        this.type = type;
    }
    public IntelligentAgentType getType() {
        return type;
    }
    @Override
    public String getAgentType(){
        return "intelligent agent";
    }
}
