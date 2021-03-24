public class LargestPrime {

    public static int getLargestPrime (int number){
        if (number < 0){
            return -1;
        }
        int divider = 2;
        while( number > 0){
            if(number % divider != 0){
                divider++;
            }else{
                number = number / divider;
                if(number == 1){
                    return divider;
                }
            }
        }
        return -1;
    }
}
//    public static int getLargestPrime (int number) {
//        if (number<2) return -1;
//
//        for (int i=number/2; i>1; i--) {
//            if(number%i==0) number=i;
//        }
//        return number;
//    }