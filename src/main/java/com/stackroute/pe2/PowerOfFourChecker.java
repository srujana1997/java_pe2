package com.stackroute.pe2;
    public class PowerOfFourChecker {
        public boolean isNumberPowerOf4(double number)
        {
            if(number == 0)
                return false;

            while(number != 1)
            {
                if(number % 4 != 0)  //to check whether number is divisible by 4

                    return false;

                number = number/4;

            }
            return true;
        }

}
