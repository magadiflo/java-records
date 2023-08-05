# Java Records

Tutorial tomado de los siguientes canales de youtube:

- [Youtube - Salvador Pérez](https://www.youtube.com/watch?v=j-bPnCqFh2o)
- [Youtube - Coding with John](https://www.youtube.com/watch?v=gJ9DYC-jswo)
- [JavaTechOnline - Record In Java With Examples](https://javatechonline.com/record-in-java-with-examples/?fbclid=IwAR0jI5adERsHqUCaGANqcrRYg_yxHh9fvkq9_p_RaoWhpj5LqgOCxz7j-aE)

---

## Records en Java

Los records fueron liberados para su uso oficial en la versión 16 del jdk

## ¿Qué son los Records de Java?

Los records llegaron para hacernos la vida más fácil en la generación de clases
**inmutables**, clases que no pueden ser extendidas y que, por concepto, no pueden
modificarse sus atributos una vez creado el objeto; y es que para generar una
clase inmutable se necesita mucho código, y eso es lo que nos va a ahorrar los **records**
---

## ¿Dónde usar un record en Java?

En general, podemos usar records en cualquier situación en la que necesite declarar contenedores de datos simples con
propiedades inmutables y métodos generados automáticamente. Por ejemplo:

- **Data Transfer Objects (DTOs):** Podemos usar Records para declarar objetos simples de transferencia de datos que
  contienen datos. Esto es útil cuando se transfieren datos entre diferentes capas de una aplicación, como entre la capa
  de servicio y la capa de base de datos.


- **Configuration objects:** los registros se pueden usar para declarar objetos de configuración que contienen un
  conjunto de propiedades de configuración para una aplicación o un módulo. Estos objetos suelen tener propiedades
  inmutables, lo que los hace seguros para subprocesos y fáciles de razonar.


- **Value Objects:** los registros se pueden usar para declarar objetos de valor que contienen un conjunto de valores
  que representan un concepto particular o un modelo de dominio.


- **API Responses:** al crear API REST, es común devolver datos en forma de JSON o XML. En tales casos, es posible que
  desee definir una estructura de datos simple que represente la respuesta de la API. Los registros son ideales para
  esto porque le permiten definir una estructura de datos liviana e inmutable que se puede serializar fácilmente en JSON
  o XML.


- **Test Data:** al escribir pruebas unitarias, a menudo es necesario crear datos de prueba que representen un escenario
  específico. En tales casos, es posible que desee definir una estructura de datos simple que represente los datos de
  prueba. Los registros pueden ser perfectos para esto porque nos permiten definir una estructura de datos liviana e
  inmutable con un código repetitivo mínimo.


- **Tuple-like objects:** los registros se pueden usar para declarar objetos tipo tupla que contienen un número fijo de
  valores relacionados. Esto puede ser útil cuando se devuelven múltiples valores de un método o cuando se trabaja con
  colecciones de valores relacionados.

## ¿Qué es un Record en Java?

Un Record en Java es una clase destinada a almacenar datos. Es similar a una clase Java tradicional, pero además es
más ligera y tiene algunas características únicas. **Los registros son inmutables de forma predeterminada, lo que
significa que su estado no se puede cambiar una vez que se crean.** Esto los hace ideales para almacenar datos que no
deben modificarse (datos inmutables), como ajustes de configuración o valores devueltos de una consulta de base de
datos.

Los records en Java facilita el trabajo con datos al reducir la cantidad de código repetitivo que los desarrolladores
usan para escribir una y otra vez.

## Clases de Record genéricos

En Java, también es posible definir clases de registro genéricas. Una clase de registro genérica es una clase de
registro que tiene uno o más parámetros de tipo. Aquí hay un ejemplo:

````java
public record Pair<T, U>(T first, U second) {
}
````

En este ejemplo, Pair es una clase de registro genérica que toma dos parámetros de tipo T y U. Podemos crear una
instancia de este registro de la siguiente manera:

````java
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hola", 2023);
        System.out.println("pair = " + pair);
    }
}
````

## Clase anidada dentro de un Record

También es posible definir clases e interfaces anidadas dentro de un registro. Esto puede ser útil para agrupar clases e
interfaces relacionadas, y puede ayudar a mejorar la organización y la capacidad de mantenimiento de una base de código.

Este es un ejemplo de un registro que contiene una clase anidada:

````java
public record Person(String name, int age, Contact contact) {
    public static class Contact {
        private final String email;
        private final String phone;

        public Contact(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Contact{");
            sb.append("email='").append(email).append('\'');
            sb.append(", phone='").append(phone).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
````

En este ejemplo, Persona es un registro que contiene un Contacto de clase anidado. El contacto es una clase anidada
estática que contiene dos campos finales privados, correo electrónico y teléfono. También tiene un constructor que
acepta correo electrónico y teléfono, y dos métodos de captación getEmail() y getPhone().

Podemos crear una instancia de Persona de la siguiente manera:

````java
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Romy", 65, new Person.Contact("romy@gmail.com", "943858588"));
        System.out.println("person = " + person);
    }
}
````

Lo mismo puede ocurrir con interfaces, es decir también hay interfaces anidados dentro de los Records.