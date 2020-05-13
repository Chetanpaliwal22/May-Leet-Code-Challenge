class Solution {
    public String removeKdigits(String num, int k) {
        int l=k;
        int len = num.length();
        
        Stack<Character> stk = new Stack<>();
        
        if(k == len) return "0";
        
        int low = 0;
        int high = len;
        
        while(low<high){
            while(k>0 && !stk.isEmpty() && stk.peek() > num.charAt(low)){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(low));
            low++;
        }
        
        while(k>0){
            stk.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stk.isEmpty()){
            sb.append(String.valueOf(stk.pop()));
        }
        
        sb = sb.reverse();
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
