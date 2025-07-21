package OverLoading;

import java.util.Arrays;

public class Operation {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,3,4,4,5,6,7,7,7,8,9};
        boolean[] uniqueArray = new boolean[array.length];
        String uniqueElements = "";

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i!=j && array[i] == array[j]){
                    uniqueArray[i] = true;
                }
            }
        }

        for (int i = 0;i<uniqueArray.length;i++){
            if(!uniqueArray[i]){
                uniqueElements = uniqueElements + array[i] + " ";
            }
        }
        String[] splitArray = uniqueElements.split(" ");
        System.out.println(Arrays.toString(splitArray));
    }
}
