public class Main {
    public static void main(String[] args) {
        int currentAmount = 100;
        int additionAmount = 1100;
        int newAmount;
        int newBonus;
        if (additionAmount>1000) {
            newBonus=Math.round(additionAmount/100);
            newAmount=currentAmount+additionAmount+newBonus;
            System.out.println(newAmount);
        }
        else {
            newAmount=currentAmount+additionAmount;
            System.out.println(newAmount);
        }



    }
}