package record02;

import java.io.Serializable;

/**
 * Con los Records hay un pequeño atajo que se puede usar para
 * anular el constructor canónico, es decir, hacer esa anulación
 * del constructor algo diferente a cómo se hace en el EmployeeRecord2.
 * <p>
 * Esta forma de anulación del constructor se llama CONSTRUCTOR COMPACTO,
 * eso es algo único solo para los Records.
 * <p>
 * Un CONSTRUCTOR COMPACTO, es exactamente el mismo constructor, excepto
 * con los parámetros eliminados y las asignaciones donde establecíamos
 * el valor como en el EmployeeRecord2 ya no irían, estas asignaciones
 * serán agregadas automáticamente en el mismo orden y al final del
 * constructor compacto
 */

public record EmployeeRecord3(String name, int employeeNumber) implements Serializable {

    public static final String DEFAULT_EMPLOYEE_NAME = "Martín";

    // Constructor COMPACTO
    public EmployeeRecord3 {
        // Validando
        if (employeeNumber < 0) {
            throw new IllegalStateException("El número del empleado no puede ser negativo");
        }
        // Aquí serán asignados de manera automática los componentes del record (parámetros)
        // a sus correspondientes valores privados finales
    }

    public String nameInUpperCase() {
        return this.name.toUpperCase();
    }

    public static void printWhatever() {
        System.out.println("Imprimiendo lo que sea...");
    }

}
