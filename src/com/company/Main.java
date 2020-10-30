package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos(-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos(-1, -1, false));
        System.out.println(negPos(-4, -5, true));
        System.out.println(negPos(-4, 5, true));
        System.out.println(negPos(4, 5, true));
        System.out.println(negPos(4, -5, true));
    }

    public static boolean chimpTrouble(boolean a, boolean b) {
        return a == b;
    }

    public static boolean negPos(int a, int b, boolean negative) {
        if (!negative)
        {
            return ((a > 0 && b < 0) || (a < 0 && b > 0));
        }
        else if (negative)
        {
            return (a < 0 && b < 0);
        }
        else{
            return false;
        }
    }
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if (isAsleep = true)
        {
            return false;
        }
        else if (isAsleep = false)
        {
            return (isMom || !isMorning);
        }
        else
        {
            return false;
        }
    }
}