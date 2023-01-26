package record02;

import java.io.Serializable;

/**
 * Como cualquier clase, puede crear:
 * - Métodos normales
 * - Métodos estáticos
 * - Variables estáticas
 * - No puede definir variables de instancia, es decir
 * variables que no sean estáticas.
 * <p>
 * - Los Records no pueden extender de ninguna otra clase.
 * - Los Records son clases finales, están de forma implícita, por
 * lo que colocar un ...final record... sería redundante.
 * - Sí puede implementar interfaces.
 * <p>
 * Recordar que el Record nos proporciona por defecto un CONSTRUCTOR CANÓNICO,
 * es decir, un constructor con los componentes definidos en el record, nos referimos
 * a estos valores: String name, int employeeNumber. Ahora, es posible anular ese
 * constructor por defecto con nuestra propia implementación, solo hay que tener en cuenta
 * que los parámetros definidos deben ser del mismo tipo y en el mismo orden que se
 * definió en el componente del Record. Tal como se ve en este ejemplo:
 * <p>
 * Definición de los compnentes en el record:  ...EmployeeRecord2(String name, int employeeNumber)..
 * Sobreescribiendo constructor: ...EmployeeRecord2(String name, int employeeNumber)...
 * <p>
 * Como se observa, los parámetros del constructor sobreescrito son del mismo tipo
 * y en el mismo orden que el de los componentes del Record.
 * <p>
 * ¿Por qué quisiéramos sobreescribir el constructor canónico?
 * Por ejemplo, a veces necesitamos hacer una pequeña validación, por ejemplo que el número
 * del empleado nunca sea negativo, si es así que lance una excepción
 */
public record EmployeeRecord2(String name, int employeeNumber) implements Serializable {

    public static final String DEFAULT_EMPLOYEE_NAME = "Martín";

    // Constructor CANÓNICO
    public EmployeeRecord2(String name, int employeeNumber) {
        // Validando
        if (employeeNumber < 0) {
            throw new IllegalStateException("El número del empleado no puede ser negativo");
        }
        // Estableciendo los valores
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String nameInUpperCase() {
        return this.name.toUpperCase();
    }

    public static void printWhatever() {
        System.out.println("Imprimiendo lo que sea...");
    }

}
