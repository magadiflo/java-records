package record02;

public class Main {
    public static void main(String[] args) {
        // Clase tradicional
        EmployeeClass employeeClass = new EmployeeClass("Martín", 125);
        System.out.println(employeeClass);
        System.out.println(employeeClass.getName());

        System.out.println("---");

        // Usando Record
        EmployeeRecord employeeRecord = new EmployeeRecord("Gaspar", 126);
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.name());

        System.out.println("---");
        EmployeeRecord2 employeeRecord2 = new EmployeeRecord2("Tinkler", 127);
        System.out.println(employeeRecord2.nameInUpperCase());
        EmployeeRecord2.printWhatever();
    }
}