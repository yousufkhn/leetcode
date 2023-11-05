class Solution {

    // my solution 2 test cases failing because of time excceding
    // public int getWinner(int[] arr, int k) {
    // int max = Arrays.stream(arr)
    // .max()
    // .orElse(Integer.MIN_VALUE);
    // int wc=0;
    // int winner=0;
    // if (arr.length < k){
    // return max;
    // }
    // while (wc!=k){
    // if (arr[0]>arr[1]){
    // if(arr[0]==winner){
    // wc++;
    // }
    // else{
    // wc=1;
    // winner=arr[0];
    // }
    // int elementAtOne = arr[1];
    // for (int i = 1;i<arr.length-1;i++){
    // arr[i]=arr[i+1];
    // }
    // arr[arr.length-1]=elementAtOne;
    // }
    // else if(arr[1]>arr[0]){
    // wc=1;
    // winner=arr[1];
    // int elementAtZero = arr[0];
    // for (int i = 0;i<arr.length-1;i++){
    // arr[i]=arr[i+1];
    // }
    // arr[arr.length-1]=elementAtZero;
    // }
    // }
    // return winner;
    // }
    public int getWinner(int[] arr, int k) {
        if (k == 1) {
            return Math.max(arr[0], arr[1]);
        }
        if (k >= arr.length) {
            return Arrays.stream(arr).max().getAsInt();
        }

        int current_winner = arr[0];
        int consecutive_wins = 0;

        for (int i = 1; i < arr.length; i++) {
            if (current_winner > arr[i]) {
                consecutive_wins++;
            } else {
                current_winner = arr[i];
                consecutive_wins = 1;
            }

            if (consecutive_wins == k) {
                return current_winner;
            }
        }

        return current_winner;
    }

}