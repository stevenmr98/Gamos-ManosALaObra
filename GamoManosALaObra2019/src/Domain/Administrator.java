
package Domain;

import java.io.Serializable;


public class Administrator extends Employee implements Serializable {
//Variables

    private short category;

    public Administrator() {
        super();
        this.category = 0;
    }//  Constructor

    public Administrator(short category, String nameEmployee, String lastNameEmployee, 
            String idCardEmployee, int codeEmployee, String universityDegree) {

        super(nameEmployee, lastNameEmployee, 250, idCardEmployee, codeEmployee, universityDegree);
        this.category = category;
        
        //estimateSalary();
    }//  Constructor

    public Administrator(short category) {
        this.category = category;
    }

    @Override
    public int estimateSalary() {
        int temp = this.getWageEmployee();
        int wage;
        if (category == 1) {
            return 250;

        }
        if (category == 2) {
            temp += 250 * 0.2;
           // this.setWageEmployee(temp);
        }
        return temp;
    }//estimateSalary

  
    

}//public class Administrative extends Employee {
