class SeatManager {
    // 0 for unreserved
    // 1 for reserved
    // ArrayList<Integer> seats;
    // int index ;
    // public SeatManager(int n) {
    // seats = new ArrayList<>(Collections.nCopies(n, 0));
    // }

    // public int reserve() {
    // index = seats.indexOf(0);
    // seats.set(index,1);

    // return index+1;
    // }

    // public void unreserve(int seatNumber) {
    // seats.set(seatNumber-1,0);
    // }

    // using hashmap
    // HashMap<Integer,Integer> seats ;
    // public SeatManager(int n) {
    // seats = new HashMap<>();
    // for (int i = 0; i < n; i++) {
    // seats.put(i+1,0);
    // }
    // }

    // public int reserve() {
    // int i=1;
    // while (true){
    // if(seats.get(i)==0){
    // seats.put(i,1);
    // return i;
    // }
    // i++;
    // }
    // }

    // public void unreserve(int seatNumber) {
    // seats.put(seatNumber,0);
    // }

    // using treeset
    // TreeSet<Integer> seats;
    // public SeatManager(int n) {
    // seats = new TreeSet<>();
    // for (int i = 1;i<=n;i++){
    // seats.add(i);
    // }

    // }

    // public int reserve() {
    // return seats.pollFirst();
    // }

    // public void unreserve(int seatNumber) {
    // seats.add(seatNumber);
    // }

    PriorityQueue<Integer> seats;

    public SeatManager(int n) {
        seats = new PriorityQueue<Integer>();
        for (int i = 1; i <= n; i++) {
            seats.add(i);
        }
    }

    public int reserve() {
        return seats.poll();
    }

    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */