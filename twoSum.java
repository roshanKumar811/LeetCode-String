
public class twoSumString{
    public static String findSum(String X, String Y){

        int x = X.length()-1; 
        int y = Y.length()-1; 
        int i = X.length()-1; 
        int j = Y.length()-1; 
        int carry = 0;
        StringBuilder buil = new StringBuilder(); 
        while(i >=0 || j>=0){
        int sum1 = 0; 
        int sum2 = 0; 
            if(i > -1){
            int ascii = X.charAt(i); 
            sum1 = ascii - 48;
            i--;
            }
            if(j > -1){
            int asciit = Y.charAt(j); 
            sum2 = asciit - 48; 
             j--; 
            }
            int toal = sum1+sum2+carry; 
            buil.append(toal%10); 
            carry = toal/10; 
        }
        if(carry == 1){
            buil.append(1); 
        }
        return buil.reverse().toString();
          
    }


    public static void main(String[] args) {

        String first = "23232"; 
        String second = "2323"; 
        System.out.println(findSum(first, second));
        
    }
    
}
