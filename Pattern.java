public class Pattern {
    public static void main(String args[]){
        int n = 5;
        //upper half 
        for(int i = 1; i <= n; i++){
            //left
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //space
            int space = 2 * (n - i);
            for(int j =1; j <= space; j++){
                System.out.print("  ");
            }
            //right
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower
        for(int i = n; i >= 1; i--){
            //left
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //space
            int space = 2 * (n - i);
            for(int j =1; j <= space; j++){
                System.out.print("  ");
            }
            //right
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 