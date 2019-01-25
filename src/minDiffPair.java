public class Solution {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        
        int min = Integer.MAX_VALUE;

for(int i = 0; i < arr.length-1; i++){
    for(int j = i+1; j < arr.length; j++){
       if(Math.abs((arr[i]-arr[j]))< min)
            min = Math.abs((arr[i]-arr[j]));    
    }

    }
       return min;
    
    }
    }