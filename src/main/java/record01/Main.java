package record01;

/**
 * En este package record01 vemos
 * 1° Una clase típica que es final, tienes sus atributos, getters, etc.. (BankAccountImmutable)
 * 2° Un record que es lo mismo que la clase típica descrita anteriormente
 *
 * ¿Diferencia?
 * Podemos ver que un record, no tiene tanto código
 */

public class Main {
    public static void main(String[] args) {
        BankAccountRecord bankAccountRecord = new BankAccountRecord("Martín", 123456, 3_500);
        System.out.println(bankAccountRecord);
        System.out.println(bankAccountRecord.name());
        System.out.println(bankAccountRecord.accountNumber());
        System.out.println(bankAccountRecord.money());
    }
}
