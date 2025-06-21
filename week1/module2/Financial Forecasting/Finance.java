public class Finance {
    public static void main(String args[]){
        double curr=1000;
        double rate=0.5;
        int futureSpan=5;
        double futureVal=forecast(curr,rate,futureSpan);
        System.out.println("future value after "+futureSpan+"years is "+futureVal);
    }
    public static double forecast(double curr, double rate, int remYears){
        if(remYears==0){
            return curr;
        }
        return forecast(curr*(1+rate),rate,remYears-1);
    }
}
