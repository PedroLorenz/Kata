public class FBBEvaluator {
    public static String eval(int entrada){
        String deVuelta ="";
        if(entrada%3==0 || entrada%5==0 || entrada%7==0){
            if (entrada%3==0){deVuelta= "Fizz";}
            if (entrada%5==0){deVuelta+="Buzz";}
            if (entrada%7==0){deVuelta+= "Bazz";}
            return deVuelta;
    }
        
        return String.valueOf(entrada);
    }
}
