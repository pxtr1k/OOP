public class MultiAgentSystem {
    private  static int generatedId;
    private Agent[] agents;

    public MultiAgentSystem(int numberOfAgents){
        if(numberOfAgents<1)
            numberOfAgents=1;
        agents=new Agent[numberOfAgents];
    }
    public Agent[] getAgents() {
        return agents;
    }
    public void setGeneratedId(int generatedId) {
        this.generatedId = generatedId;
    }
    public int getGeneratedId() {
        return generatedId;
    }
    public void setAgents(Agent[] agents) {
        this.agents = agents;
    }
    public int getNumberOfAgents(){
        return agents.length;
    }
    public static int generateId(){
        return generatedId++;
    }
    public void addAgent(Agent agent){
        if(agent.getID()<agents.length){
            agents[agent.getID()]=agent;
        }
    }
    public void systemInfo(){
        for(Agent agent:agents){
            if(agent==null)
                continue;
            else
                System.out.format("%s %s\n", agent.getAgentType(), agent.toString());
        }
    }

}
