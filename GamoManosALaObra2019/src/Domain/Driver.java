package Domain;

public class Driver extends Employee {
    //Variables

    private int salarioEmpleado;
    private boolean automobileDriver;
    private String machinery;
    private boolean driveNight;

//Constructor
    public Driver(String nameEmployee, String lastNameEmployee, int wageEmployee, String idCardEmployee, int codeEmployee, String universityDegree,
    boolean automobileDriver,String machinery,boolean driveNight) {
        super(nameEmployee, lastNameEmployee, wageEmployee, idCardEmployee, codeEmployee, universityDegree);
        this.automobileDriver=automobileDriver;
        this.machinery=machinery;
        this.driveNight=driveNight;
    }

    public int estimateSalary(){
       
        int temp = super.getWageEmployee();
        int extra;

        if (automobileDriver == true) {
          super.setWageEmployee(temp);
        } else {

                switch (machinery) {
                    case "vagoneta":
                        extra = 6;
                        super.setWageEmployee(temp + extra);
                        break;
                    case "grua":
                        extra = 8;
                        super.setWageEmployee(temp + extra);

                        break;
                    case "monta carga":
                        extra = 14;
                        super.setWageEmployee(temp + extra);
                        break;
                }
            }
           if (driveNight == true) {
                super.setWageEmployee(temp * 2);
            }
        
        return temp;
       
    }// public void driverSalary

}//public class Driver

