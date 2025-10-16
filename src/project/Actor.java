package project;

public class Actor extends Staff {

    private int numOfAwards;
    private String agentName;

    public Actor() {
    }

    public Actor(String name, String role, String agentName, int numOfAwards) {
        super(name, role);
        super.setRole("Actor");
        setAgentName(agentName);
        setNumOfAwards(numOfAwards);
    }

    public int getNumOfAwards() {
        return numOfAwards;
    }

    public void setNumOfAwards(int numOfAwards) {
        this.numOfAwards = numOfAwards;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    @Override
    public String toString() {
        return String.format("%s The Number Of Aeards : %d \n The Agent Name : %s \n", super.toString(), numOfAwards, agentName);
    }
}
