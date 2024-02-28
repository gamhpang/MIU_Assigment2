import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        String[] input1 = {"horse","dog","cat","horse","dog"};
        System.out.println(Arrays.toString(removeDuplicate(input1)));
    }

    static public String[] removeDuplicate(String[] input){
        String[]  temp = new String[input.length];
        int pointer = 0;
        boolean first = true;
        for(String s:input){
            if(first){
                temp[pointer]=s;
                pointer++;
                first=false;
            }
            else {
                if (!checkArr(temp,s)){
                    temp[pointer]=s;
                    pointer++;
                }
            }

        }

        String[] result = new String[pointer];
        for (int i=0;i<result.length;i++){
            result[i]=temp[i];
        }

        return result;
    }

    static public boolean checkArr(String[] temp,String s){
        for(String i:temp){
            if(i==null){
                return false;
            }
            if(i.equals(s)){
                return true;
            }
        }
        return false;
    }

}
