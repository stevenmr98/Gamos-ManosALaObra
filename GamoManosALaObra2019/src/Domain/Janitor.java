
package Domain;

public class Janitor extends Employee {

    public boolean extraHours;
    public int hours;
//Constructores

    public Janitor() {
        super();
        this.extraHours = false;
        this.hours = 0;
    }//Constructor vacio

    public Janitor(String nameEmployee, String lastNameEmployee, String idCardEmployee, int codeEmployee, String universityDegree, boolean extraHours, int hours) {
        super(nameEmployee, lastNameEmployee, 120, idCardEmployee, codeEmployee, universityDegree);
        this.extraHours = extraHours;
        this.hours = hours;
      //  estimateSalary();
    }//Constructor

    @Override
    public int estimateSalary() {
        int temp = this.getWageEmployee();
        int wage;
        if (extraHours == true) {
            temp += hours * 0.25;
            this.setWageEmployee(temp);
        }
        return temp;
    }//estimateSalary

}//public class Janitor

