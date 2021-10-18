/*

The new "Avengers" movie has just been released!
There are a lot of people at the cinema box office standing in a huge line.
Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to every person and give change if he initially has no money
and sells the tickets strictly in the order people queue?

Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment.
Otherwise return NO.

Examples:
Line.Tickets(new int[] {25, 25, 50}) // => YES
Line.Tickets(new int[] {25, 100}) // => NO. Vasya will not have enough money to give change to 100 dollars
Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO.Vasya will not have the right bills to give 75 dollars of change
(you can't make two bills of 25 from one of 50)

 */

public class CodeChallenge {

    public static String ticketSalesChange(int[]arr){
        int twentyFiveBill = 0;
        int fiftyBill = 0;
        int hundredBill = 0;

        if (arr[0] != 25){
            return "No";
        }
        for(int i = 0; i < arr.length; i++){
            switch (arr[i]){
                case 25:
                    twentyFiveBill ++;
                    break;
                case 50:
                    if (twentyFiveBill > 0){
                        twentyFiveBill--;
                        fiftyBill++;
                    }else{return "No";}
                    break;
                case 100:
                    if (twentyFiveBill > 0 || fiftyBill > 0){
                        if (twentyFiveBill >= 3){
                            twentyFiveBill -= 3;
                            hundredBill++;
                        }
                        else
                        if (fiftyBill >= 1 && twentyFiveBill >= 1){
                            fiftyBill--;
                            twentyFiveBill--;
                            hundredBill++;
                        }
                        else {
                            return "No";
                        }
                    }
                    break;
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        System.out.println(ticketSalesChange(new int[] {25, 25, 50, 50,25, 100}));
    }
}
