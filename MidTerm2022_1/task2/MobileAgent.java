public class MobileAgent extends Agent implements Movable{
    private int taskId;

    public MobileAgent(String name, int id){
        super(name, id);
        doRemoteTask();

    }
    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void doRemoteTask(){
     taskId=(int)((Math.random()*10)+1);
    }
    @Override
    public String getAgentType(){
        return "mobile agent";
    }
}
