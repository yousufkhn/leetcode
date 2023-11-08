class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(fx==sx && fy==sy ){
            if(t==1){
                return false;
            }
            else{
                return true;
            }    
        }
        return Math.max(Math.abs(sx-fx),Math.abs(sy-fy)) <= t;
    }
}