class Solution {
    public boolean solution(int x) {
        String stringX = Integer.toString(x);
        int sum = 0;
        
        for(int i = 0 ; i < stringX.length(); i++) {
            sum += Integer.parseInt(String.valueOf(stringX.charAt(i)));
        }
        
        if(x % sum == 0) {
            return true;
        }
    
        return false;
    }
}