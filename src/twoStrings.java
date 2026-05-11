public static String twoStrings(String s1, String s2) {
        
        Set<Character> set = new HashSet<>();
        
        for(char c:s1.toCharArray()){
            set.add(c);
        }    
        for(char c:s2.toCharArray()){
            if(set.contains(c)){
                return "YES";
            }
        }
        return "NO";
    }

}
