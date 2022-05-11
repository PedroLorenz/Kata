public class FBBEvaluator {
    public static String eval(int entrada){
        if (entrada%3==0){return "Fizz";}
        if (entrada%5==0){return "Buzz";}
        if (entrada%7==0){return "Bazz";}
        return String.valueOf(entrada);
    }
}
