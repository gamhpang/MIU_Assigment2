public class Prog6 {
    static int min(int[] arrayOfInts){
        int n = Integer.MAX_VALUE;
        for(int a:arrayOfInts){
            if(n>a){
                n = a;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] test = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println(min(test));
    }

}
