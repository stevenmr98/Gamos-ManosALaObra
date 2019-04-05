
package Domain;


public class UniversityDegree {
    
    //variables
    private String degree;
    private boolean isGraduated;
    
    //constructores
    public UniversityDegree(){
        this.degree = "";    
    }

    public UniversityDegree(boolean isGraduated) {
        this.isGraduated = isGraduated;
    }
    
    public String getDegree() {
        return degree;
    }

    
    public void setDegree(String degree) {
        this.degree = degree;
    }



    public boolean isIsGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(boolean isGraduated) {
        this.isGraduated = isGraduated;
    }

    public UniversityDegree(String degree) {
        this.degree = degree;
    }
 
    
}
