import java.util.HashMap;
import java.util.Map;

public class Challenge2 {

    private final Map<Integer, Integer> cashRegister;

    public Challenge2() {
        this.cashRegister = new HashMap<>();
        cashRegister.put(25, 0);
        cashRegister.put(50, 0);
        cashRegister.put(100, 0);
    }

    public String changeFromSales(int[] payments){
        for (int payment : payments){
            if (!haveChange(payment))
                return "NO";
        }
        return "YES";
    }

    public boolean haveChange(int payment){
        int expectedChange = payment - 25;
        int availableChange = 0;

        if (payment == 25){
            this.cashRegister.put(payment, (this.cashRegister.get(payment) + 1));
            return true;
        }

        for (int i = payment - 25; i >= 25; i -= 25){
            while (this.cashRegister.get(i) != null && this.cashRegister.get(i) != 0
                    && availableChange != expectedChange && (availableChange + i) <= expectedChange) {
                availableChange += i;
                this.cashRegister.put(i, (this.cashRegister.get(i) - 1));
            }
            if (expectedChange == availableChange){
                this.cashRegister.put(payment, (this.cashRegister.get(payment) + 1));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Challenge2 day1 = new Challenge2();
        System.out.println(day1.changeFromSales(new int[] {25, 25, 50, 50, 25, 25, 25, 100}));
    }
}
