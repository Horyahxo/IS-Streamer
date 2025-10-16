
package project;

public class Director extends Staff {

    private int yearsOfExperience;

    public Director() {
    }

    public Director(String name, String role, int yearsOfExperience) {
        super(name, role);
        super.setRole("Director");
        setYearsOfExperience(yearsOfExperience);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return String.format("%s The Years Of Experience : %s \n", super.toString(), yearsOfExperience);
    }


}
