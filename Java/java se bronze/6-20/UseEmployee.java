class Employee{
    static int totalNumOfEmp = 500;

    public static double baseSalary(double time){
        return 1500*time;
    }
}


public class UseEmployee{
    public static void main(String args[]){
        System.out.println(Employee.totalNumOfEmp + "peple");
        System.out.println(Employee.baseSalary(160.5) + "yen");
    }
}