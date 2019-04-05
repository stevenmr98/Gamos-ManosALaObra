package Domain;

public class Driver extends Employee {
    //Variables

    private int salaryEmployee;
    private int moneyHour = 0;

//Constructor
    public Driver(String nameEmployee, String lastNameEmployee, int wageEmployee, String idCardEmployee, int codeEmployee, boolean isGraduated,
            boolean automobileDriver, String machinery) {
        super(nameEmployee, lastNameEmployee, wageEmployee, idCardEmployee, codeEmployee, isGraduated);
    }

    public Driver() {
    }
    

    public int estimateSalary(String tipo, int hours, int extraHours) {
        this.salaryEmployee = 0;
        switch (tipo) {
            case "automobile":
                this.moneyHour = 3;
                if (hours != 0) {
                    this.salaryEmployee += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salaryEmployee += extraHours * (moneyHour * 2);
                        
                    }
                }

            case "vagoneta":
                this.moneyHour = 3;
                if (hours != 0) {
                    this.salaryEmployee += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salaryEmployee += extraHours * (moneyHour * 2);
                    }
                }

                break;
            case "grua":
                this.moneyHour = 4;
                if (hours != 0) {
                    this.salaryEmployee += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salaryEmployee += extraHours * (moneyHour * 2);
                    }
                }

                break;
            case "monta carga":
                extraHours = 7;
                if (hours != 0) {
                    this.salaryEmployee += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salaryEmployee += extraHours * (moneyHour * 2);
                    }
                }
                break;
        }
        return this.salaryEmployee;
    }

}
