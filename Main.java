class Main {
    public String longestPalindrome(String s) {
        //String is one letter = palindrome
        if (s.length() <= 1){
            return s;
        }
        // "b"
        int max_len=1;  //Max length of the Substring which will palindrome
        int n = s.length();  // 5   Keep track of Total char in String = n;
        int st = 0 , end =0; //two more counters to use in s.substring(st,end)

        //Odd length  = babad
        for (int i =0 ; i<n-1 ; i++){  //i=1
            int l = i , r =i; // L = 1 , r = 1 ,,, a
            while(l>=0 && r<n){ 
                if(s.charAt(l) == s.charAt(r)){  // b = b
                    l-- ; r++; // L = -1 , r = 3 
                }else{
                    break;
                }
            } 
            int len = r-l-1; //  ,,,3 -(-1)  -1 = 3    
            if(len > max_len){  //3 > 1
                max_len = len; //3
                st = l+1; //-1 + 1 =0
                end = r-1; //3 - 1 =2
            }
        }

        //Even Length
        for (int i =0 ; i<n-1 ; i++){  //i=1
            int l = i , r =i+1 ; // L = 1 , r = 1 ,,, a
            while(l>=0 && r<n){ 
                if(s.charAt(l) == s.charAt(r)){  // b = b
                    l-- ; r++; // L = -1 , r = 3 
                }else{
                    break;
                }
            } 
            int len = r-l-1; //  ,,,3 -(-1)  -1 = 3    
            if(len > max_len){  //3 > 1
                max_len = len; //3
                st = l+1; //-1 + 1 =0
                end = r-1; //3 - 1 =2
            }
        }
        
        return s.substring(st, end+1);
    }
}