public class MaxAndSum {
    public static void main(String[] args){
        double M = Double.MIN_VALUE, S = 0, n;
        for(String e : args){
            try{ n = Double.parseDouble(e);}
            catch(NumberFormatException ex){
                n = 0;
            }
            S += n;
            if(M < n) M = n;
        }
        System.out.println(M + " " + S);
    }
}
