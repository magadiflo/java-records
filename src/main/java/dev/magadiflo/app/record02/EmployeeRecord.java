package dev.magadiflo.app.record02;

/**
 * Esta única línea de código es equivalente a
 * todo lo que hicimos en la clase Employee.
 * <p>
 * Java genera por nosotros campos privados y finales
 * de forma predeterminada para todos los parámetros definidos
 * en el record, en nuestro caso definimos dos parámetros:
 * (String name, int employeeNumber)
 * tal y como nosotros lo definimos manualmente en
 * la clase EmployeeClass:
 * private final String name;
 * private final int employeeNumber;
 * Esto, con la finalidad de que luego que se cree el record
 * esos campos no puedan ser modificados.
 * <p>
 * También se crean métodos públicos para cada parámetro definido,
 * similares a los métodos Getters definidos en la clase EmployeeClass,
 * con una pequeña diferencia, los métodos públicos del Record no
 * tienen el get en el nombre de su método, solo tienen el nombre
 * de ese campo
 * <p>
 * También generará por nosotros un cierto tipo de constructor, que
 * tendrá como parámetros los componentes definidos en nuestro
 * record. En nuestro ejemplo, los componentes que definimos
 * en el record fueron: name y employeeNumber, por lo tanto,
 * creará un constructor con dichos componentes y luego los
 * asignará a los atributos privados finales que genere. Esto es
 * similar al constructor con parámetros que creamos en la
 * clase EmployeeClass.
 * <p>
 * Al constructor que se crea automáticamente con los componentes
 * definidos en nuestro Record, se le llama constructor CANÓNICO,
 * aunque nosotros no creamos ningún constructor explícitamente.
 * <p>
 * También generará automáticamente la implementación
 * de los métodos toString(), equals() y hashCode()
 * <p>
 * Se considerarán dos objetos de la clase Record como iguales,
 * si todos sus componentes son iguales entre sí. Esta funcionalidad es
 * gracias a que el Record implementa automáticamente el método equals().
 * <p>
 * No genera los métodos Setters, una característica principal de un
 * Record y una de las razones principales para usar un record es que
 * son INMUTABLES de forma predeterminada. Eso significa, que un
 * objeto Record no se puede cambiar una vez que se haya creado.
 * <p>
 * El propósito de un Record es solo mantener y transportar datos.
 */

public record EmployeeRecord(String name, int employeeNumber) {
}
