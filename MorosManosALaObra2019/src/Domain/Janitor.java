
package Domain;

public class Janitor extends Employee {

    private boolean extraHours;
    private int hours;
//Constructores

    public Janitor() {
        super();
        this.extraHours = false;
        this.hours = 0;
    }//Constructor vacio

    public Janitor(String nameEmployee, String lastNameEmployee, String idCardEmployee, int codeEmployee, boolean isGraduated) {
        super(nameEmployee, lastNameEmployee, codeEmployee, idCardEmployee, codeEmployee, isGraduated);
        this.extraHours = extraHours;
        this.hours = hours;
      //  estimateSalary();
    }//Constructor

    public boolean isExtraHours() {
        return extraHours;
    }

    public void setExtraHours(boolean extraHours) {
        this.extraHours = extraHours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int estimateSalary() {
        int temp = this.getWageEmployee();
        int quarter=0;
        if (extraHours == true) {
            quarter= (int) (temp * 0.25);
            temp+=quarter*hours;
     //  this.setWageEmployee(temp);
        }
        return temp;
    }//estimateSalary

}//public class Janitor

