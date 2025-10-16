
package project;


public class Staff extends Person {
    private String role; 

    public Staff() {
        this(null,null);
    }

    public Staff(String name,String role) {
        super(name);
        setRole(role);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    @Override
    public String toString(){
    return String.format("%s The role : %s \n" , super.toString(),role);
    }
}
