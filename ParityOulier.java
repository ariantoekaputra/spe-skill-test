public class ParityOulier {
    static int find(int[] integers) {
        int even = 0;
        int odd = 0;
        int i = 0;
        int numEven = 0;
        while ((even == 0 || odd == 0) && i < integers.length) {
            if (integers[i] % 2 == 0) {
                even = i;
                numEven++;
            } else if(integers[i] % 2 == 1){
                odd = i;
            }else{
                numEven = -1;
            }
            i++;
        }
        if(numEven > 1){
            return integers[odd];
        }else if(numEven == 0){
            return integers[even];
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] intArray = {11, 13, 15, 19, 9, 13, -21};
        if(find(intArray) == 0){
            System.out.println("Should return:"+find(intArray)+"(the only odd number)");
        }else if(find(intArray) > 0){
            System.out.println("Should return:"+find(intArray)+"(the only even number)");
        }else{
            System.out.println("Should return:"+false+"(all odd integer, no outlier)");
        }
        
        
    }
}
