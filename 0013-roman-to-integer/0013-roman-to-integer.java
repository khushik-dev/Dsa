class Solution {
    public int romanToInt(String s) {
        int total=0;
        for(int i=0; i<s.length(); i++){
            int curr=0;
            int nxt=0;

            switch(s.charAt(i)){
                case 'I': curr=1; break;
                case 'V': curr=5; break;
                case 'X': curr=10; break;
                case 'L': curr=50; break;
                case 'C': curr=100; break;
                case 'D': curr=500; break;
                case 'M': curr=1000; break;
            }

            if(i+1<s.length()){
                switch(s.charAt(i+1)){
                    case 'I': nxt=1; break;
                    case 'V': nxt=5; break;
                    case 'X': nxt=10; break;
                    case 'L': nxt=50; break;
                    case 'C': nxt=100; break;
                    case 'D': nxt=500; break;
                    case 'M': nxt=1000; break;
                }
            }

            if(curr<nxt){
                total -= curr;
            }
            else{
                total += curr;
            }
        }

        return total;
    }
}