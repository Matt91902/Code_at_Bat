package com.company;

public class conditionals {
    public static void main(String[] args) {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));
        System.out.println();
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos(-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos(-1, -1, false));
        System.out.println(negPos(-4, -5, true));
        System.out.println(negPos(-4, 5, true));
        System.out.println(negPos(4, 5, true));
        System.out.println(negPos(4, -5, true));
        System.out.println();
        System.out.println(pickUpPhone (false, false, true));
        System.out.println(pickUpPhone (true, true, true));
        System.out.println(pickUpPhone (true, true, false));
        System.out.println(pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false));
        System.out.println(pickUpPhone (false, false, false));
        System.out.println();
        setAlarm(1, false);
        setAlarm(5, false);
        setAlarm (0, false);
        setAlarm (2, true);
        setAlarm (4, true);
        setAlarm (6, true);
        System.out.println();
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame (23, 19, 12));
        System.out.println(onesDigitSame (23, 19, 3));
        System.out.println(onesDigitSame (423, 13, 3));
        System.out.println(onesDigitSame (23, 29, 25));
        System.out.println();
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }

    public static boolean chimpTrouble(boolean a, boolean b) {
        return a == b;
    }

    public static boolean negPos(int a, int b, boolean negative) {
        if (!negative)
        {
            return ((a > 0 && b < 0) || (a < 0 && b > 0));
        }
        else
        {
            return (a < 0 && b < 0);
        }
    }

    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if (!isAsleep)
        {
            return (isMom || !isMorning);
        }
        else return false;
    }

    public static void setAlarm(int dayOfWeek, boolean vacation)
    {
        if (!vacation && dayOfWeek>0 && dayOfWeek<6)
        {
            System.out.println("7:00");
        }
        else if (vacation && dayOfWeek>0 && dayOfWeek<6)
        {
            System.out.println("10:00");
        }
        else if (!vacation && (dayOfWeek == 0 || dayOfWeek == 6))
        {
            System.out.println("10:00");
        }
        else
        {
             System.out.println("off");
        }
    }

    public static boolean onesDigitSame(int a, int b, int c)
    {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static int blackjack(int a, int b)
    {
       if (a <= 21 && a > b)
       {
           return a;
       }
       else if (b <= 21 & a < b)
       {
           return b;
       }
       else if (a-21>0 && b-21<0)
       {
           return b;
       }
       else if (a-21<0 && b-21>0)
       {
           return a;
       }
       else if (a==b && a<=21)
       {
           return a;
       }
       else return 0;
    }
}