public class Main {
    public static void main(String[] args) {
        int accountBalance = 100; // остаток на счёте, в рублях
        int topUpBalance = 1100; // пополнение баланса, в рублях
        int bonus;

        if (topUpBalance > 1000) {
            bonus = topUpBalance / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = accountBalance + topUpBalance + bonus;
        System.out.println("Бонусные рубли = " + bonus);
        System.out.println("Итоговая сумма на счету клиента = " + totalBalance);

    }
}
