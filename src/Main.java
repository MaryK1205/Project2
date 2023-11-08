public class Main {
    public static void main(String[] args) {
        int current_amount = 100;
        int addition_amount = 1100;
        int new_amount;
        int new_bonus;
        if (addition_amount>1000) {
            new_bonus=Math.round(addition_amount/100);
            new_amount=current_amount+addition_amount+new_bonus;
            System.out.println(new_amount);
        }
        else {
            new_amount=current_amount+addition_amount;
            System.out.println(new_amount);
        }



    }
}