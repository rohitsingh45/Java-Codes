import java.lang.*;

class Employee{
    int empcode;
    String name;
    String address;

    void setter (int code, String empName, String empAddress){
        this.empcode = code;
        this.name = empName;
        this.address = empAddress;
    }
}

class Scientist extends Employee{
    String Subject;
    String publication;
    int noOfProject;
    String typeOfProject;
    void setter(String Subject, String publication, int noOfProject, String typeOfProject){
        this.Subject = Subject;
        this.publication = publication;
        this.noOfProject = noOfProject;
        this.typeOfProject = typeOfProject;
    }
}
class Engineer extends Employee{
    String basicSoftware;
    String basicHardware;
    void setter(String basicSoftware, String basicHardware){
        this.basicSoftware = basicSoftware;
        this.basicHardware = basicHardware;
    }
}
class Worker extends Employee{
    String machineType;
    void setter(String machineType){
        this.machineType = machineType;
    }
}

class Regular extends Worker{
    int basicSalary;
    void setter(int basicSalary){
        this.basicSalary = basicSalary;
    }
}

class DailyWage extends Worker{
    double wages;
    void setter(double wages){
        this.wages = wages;
    }
}

class EmployeeDatabase{
    public static void main(String[] args){
        Engineer er = new Engineer();
        er.setter("Eclipse", "Keyword");
        System.out.println("The software used by engineer is:- " + er.basicSoftware);
    }
}