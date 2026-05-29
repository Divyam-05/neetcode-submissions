class Solution {
    public boolean isPalindrome(String s) {
        
char[] Char = s.toCharArray();

int l = 0;
int r = Char.length-1;

while(  l < r){

while(l<r  && !Character.isLetterOrDigit(Char[l])){


    l++;
}

while( l<r  && !Character.isLetterOrDigit(Char[r])){


    r--;
}

if(Char[l]== Char[r]){

    l++;
    r--;
}

else if (Character.toLowerCase(Char[l]) == Character.toLowerCase(Char[r])){

      l++;
    r--;

}

else {
    return false;

}
}

return true;



    }
}
