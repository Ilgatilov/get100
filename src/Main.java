public class Main {
    public static void main(String[] args) {
        int current_account = 100; // Начальная сумма счёта, в рублях
        int replenishment_amount = 1100; // Сумма пополнения счёта, в рублях
        int bonus;

        if (replenishment_amount > 1000){
            bonus = replenishment_amount / 100;
        } else {
            bonus = 0;
        }
        int final_invoice = current_account + replenishment_amount + bonus;
        System.out.println("Бонусные рубли = " + bonus);
        System.out.println("Итоговая сумма на счету клиента = " + final_invoice);

    }
}
