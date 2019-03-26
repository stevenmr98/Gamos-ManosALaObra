package Domain;

public class Driver extends Employee {
    //Variables

    private int salarioEmpleado;
    private int moneyHour = 0;

//Constructor
    public Driver(String nameEmployee, String lastNameEmployee, int wageEmployee, String idCardEmployee, int codeEmployee, String universityDegree,
            boolean automobileDriver, String machinery) {
        super(nameEmployee, lastNameEmployee, wageEmployee, idCardEmployee, codeEmployee, universityDegree);

    }

    public int estimateSalary(String tipo, int hours, int extraHours) {
        this.salarioEmpleado = 0;
        switch (tipo) {
            case "automobile":
                this.moneyHour = 3;
                if (hours != 0) {
                    this.salarioEmpleado += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salarioEmpleado += extraHours * (moneyHour * 2);
                        
                    }
                }

            case "vagoneta":
                this.moneyHour = 3;
                if (hours != 0) {
                    this.salarioEmpleado += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salarioEmpleado += extraHours * (moneyHour * 2);
                    }
                }

                break;
            case "grua":
                this.moneyHour = 4;
                if (hours != 0) {
                    this.salarioEmpleado += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salarioEmpleado += extraHours * (moneyHour * 2);
                    }
                }

                break;
            case "monta carga":
                extraHours = 7;
                if (hours != 0) {
                    this.salarioEmpleado += hours * moneyHour;
                    if (extraHours != 0) {
                        return this.salarioEmpleado += extraHours * (moneyHour * 2);
                    }
                }
                break;
        }
        return this.salarioEmpleado;
    }

}
