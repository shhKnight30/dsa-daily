class dividetwointeger {
    public int divide(int dividend, int divisor) {
        if(divisor==dividend)return 1;
        if(dividend >= Integer.MAX_VALUE && divisor == 1)return  Integer.MAX_VALUE;
        if(divisor==1)return dividend;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isP = (dividend>=0 && divisor>=0);
        long dnd = Math.abs((long)dividend);
        long dvr = Math.abs((long)divisor);
        int ans = 0;
        while(dnd>=dvr){
            int count = 0;
            while(dnd>dvr<<(++count)){
            }
            ans+=1<<count;
            dnd-=dvr*(1<<(count));
        }
        return isP ? ans : -ans ;

    }
}