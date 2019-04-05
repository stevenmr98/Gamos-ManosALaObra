
package Domain;

import java.io.Serializable;

public class Employee implements Serializable{
//Variables

    private String nameEmployee;
    private String lastNameEmployee;
    private int wageEmployee;
    private String idCardEmployee;
    private int codeEmployee;
    private UniversityDegree universityDegree;
//constructor
    public Employee(String nameEmployee, String lastNameEmployee, int wageEmployee,
            String idCardEmployee, int codeEmployee, boolean isGraduated) {
        this.nameEmployee = nameEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.wageEmployee = wageEmployee;
        this.idCardEmployee = idCardEmployee;
        this.codeEmployee = codeEmployee;
        this.universityDegree = new UniversityDegree(isGraduated);
    }//Constructor
        public Employee() {
        this.nameEmployee = "";
        this.lastNameEmployee ="";
        this.wageEmployee = 0;
        this.idCardEmployee = "";
        this.codeEmployee = 0;
        this.universityDegree = new UniversityDegree();
    }//Constructor
//Getters and Setters

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public void setLastNameEmployee(String lastNameEmployee) {
        this.lastNameEmployee = lastNameEmployee;
    }

    public int getWageEmployee() {
        return wageEmployee;
    }

    public void setWageEmployee(int wageEmployee) {
        this.wageEmployee = wageEmployee;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public int getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(int codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public UniversityDegree getUniversityDegree() {
        return universityDegree;
    }

    public void setUniversityDegree(UniversityDegree universityDegree) {
        this.universityDegree = universityDegree;
    }

    public int estimateSalary() {
       return 0;
    }

    @Override
    public String toString() {
        return "Employee{" + "nameEmployee=" +"\n"+ nameEmployee + "\n lastNameEmployee=" + lastNameEmployee + 
                "\n idCardEmployee=" + idCardEmployee + "\n codeEmployee=" + codeEmployee + "\n universityDegree=" + 
                universityDegree + '}';
    }

}//public class Employee

