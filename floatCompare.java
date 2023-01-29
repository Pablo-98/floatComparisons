public class floatCompare {
    public static void main (String[] args){
        double x = 0.7;
        double y = 2.5;

        /* floating point nums should not be compared using ==
        ex: avoid using x == y.
        some floating point nums cannot be exactly represented in the limited available memory
        */

        x = x - 0.4;
        x = x - 0.3;
        // x is expected to be 0  
        //  System.out.println(x); // outputs -5.551115123125783E-17

      //  System.out.println(Math.abs(x)); // outputs 5.5511 hmm

        // need to ask about this. because the absolute value of ^^ should not be less than 0.001
          if (Math.abs(x - 0.0) < 0.001) {
            System.out.println("is 0");
            
        } else {
            System.out.println("not 0");
        } 
         
        
    }
}