 public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        
        for(int i = 0; i < ar.size(); i++){
            sum += ar.get(i);
        }    
        
        return sum;
    }

}
