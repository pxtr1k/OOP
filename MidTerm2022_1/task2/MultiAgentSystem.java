public class MultiAgentSystem {
    private static int generatedId;
    private Agent[] agents;

    public MultiAgentSystem(int numberOfAgents){
        if(numberOfAgents<1)
            numberOfAgents=1;
        agents=new Agent[numberOfAgents];
    }
    public Agent[] getAgents() {
        return agents;
    }
    public void setAgents(Agent[] agents) {
        this.agents = agents;
    }
    public int getGeneratedId() {
        return generatedId;
    }
    public void setGeneratedId(int generatedId) {
        this.generatedId = generatedId;
    }
    public int getNumberOfAgents(){
        return agents.length;
    }
    public static int generateId(){
        return generatedId++;
    }
    public void addAgent(Agent agent){
     if(agent.getId()<agents.length)
         agents[agent.getId()]=agent;
    }
    public void printSystemInfo(){
        for(Agent agent:agents) {
            if (agent == null)
                continue;
            else
                System.out.format("%s %s\n", agent.getAgentType(), agent);
        }

    }
}
