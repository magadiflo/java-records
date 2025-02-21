package dev.magadiflo.app.record02;

import java.util.Objects;

/**
 * Esta es una clase simple, que tiene muchos campos y es usado
 * para poder transportar datos, desde el backend al cliente.
 * Normalmente, se le agrega la palabra reservada final para
 * que una vez que se cree el objeto evitar que los datos se modifiquen.
 * <p>
 * Para obtener el valor de cada atributo, se agregan sus getters.
 * <p>
 * Además, se implementa el método toString() para ver los valores de los
 * atributos en un formato de cadena legible
 * <p>
 * También se sobreescribirá los métodos hasCode() e equals()
 * <p>
 * Finalmente, luego de haber realizado toda esa implementación de código y métodos,
 * vamos al método principal y usamos nuestra clase Employee.
 * <p>
 * Pero vemos algo increíble, solo hacer esto toma aproximadamente 50 líneas de código
 * para una clase que hace algo tan simple, contener dos atributos, pero así es como
 * se tiene que hacer con una clase tradicional de java.
 */
public class EmployeeClass {
    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass employeeClass = (EmployeeClass) o;
        return employeeNumber == employeeClass.employeeNumber && Objects.equals(name, employeeClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", employeeNumber=").append(employeeNumber);
        sb.append('}');
        return sb.toString();
    }
}
