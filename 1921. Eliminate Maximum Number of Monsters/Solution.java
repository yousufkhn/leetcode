class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        // this is my initial solution using priority queue to sort the monsters
        // automatically
        // PriorityQueue<Integer> timeRemaining = new PriorityQueue<>();
        // int currTime = 0;
        // int monstersEliminated=0;
        // for (int i = 0;i<dist.length;i++){
        // int time=0;
        // if(dist[i]%speed[i]!=0){
        // time = (dist[i]/speed[i])+1;
        // }
        // else{
        // time = dist[i]/speed[i];
        // }
        // timeRemaining.offer(time);
        // }
        // while(timeRemaining.peek() != null && currTime<timeRemaining.peek()){
        // timeRemaining.poll();
        // monstersEliminated++;
        // currTime++;
        // }

        // this method updates the time remaining to reach the city into the dist arr
        // only
        // saving the space, then using Arrays.sort() method to sort the array
        // this solution has better time and space complexity than the sol above...
        int n = dist.length;
        for (int i = 0; i < n; i++) {
            dist[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }
        Arrays.sort(dist);

        int i = 0;
        for (int j = 0; j < n; j++) {
            if (i >= dist[j]) {
                return i;
            }
            i++;
        }
        return n;

    }
}