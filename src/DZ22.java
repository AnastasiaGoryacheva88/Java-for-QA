public class DZ22 {
    public static void main(String[] args) {
        int customersStartAccount = 100;
        int depositAmount = 11000;
        int startBonus;
        if (depositAmount>=1000)
        {startBonus=depositAmount/100;}
        else {startBonus=0;}
        int balance = customersStartAccount+depositAmount+startBonus;
        System.out.println("Ваш баланс:"+balance+"руб.Ваш бонус:"+startBonus+"руб.");
    }}

