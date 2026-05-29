class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character,Integer> Map = new HashMap<>();
       if (t.length() != s.length()){
return false;
       }
for(char c : s.toCharArray()){
if(Map.containsKey(c)){
Map.put(c, Map.get(c) + 1);;
}
else{
    Map.put(c,1);
}
}
for(char c : t.toCharArray()){
    if (Map.containsKey(c)){
        if(Map.get(c) == 0){
            return false;
        }
       else{Map.put(c, Map.get(c) - 1);}
    }
    else{
        return false;
    }
   
}
 return true;



}


    }
    
    

