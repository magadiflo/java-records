package record01;

import java.util.Objects;

public final class BankAccountImmutable {

    private String name;
    private int accountNumber;

    private long money;

    public BankAccountImmutable() {
    }

    public BankAccountImmutable(String name, int accountNumber, long money) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccountImmutable that = (BankAccountImmutable) o;
        return accountNumber == that.accountNumber && money == that.money && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountNumber, money);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("record01.BankAccountImmutable{");
        sb.append("name='").append(name).append('\'');
        sb.append(", accountNumber=").append(accountNumber);
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }
}
