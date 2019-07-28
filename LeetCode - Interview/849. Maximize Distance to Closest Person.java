class Solution {
    public int maxDistToClosest(int[] seats) {
        // index of One and the nearest 1
        //[(-1,0), (0,4), (4,6), (6,7)]
        //[           0+ 4-0/2; 4 + 6-4/2 ]
        
        Map<Integer, Integer> myMap = new TreeMap<>();
        myMap.put(-1, seats.length);
        int Max = 0;
        int indexBefore = -1;
        for ( int i = 0; i < seats.length; i++) {
            if(seats[i] == 1) {
                myMap.replace(indexBefore, i);
                myMap.put(i, seats.length);
                indexBefore = i;
            }
        }
                
        for (Map.Entry<Integer, Integer> e1 : myMap.entrySet()) {
            
            if (e1.getKey() == -1) { 
                Max = e1.getValue();
            }    

            if ( (e1.getValue() - e1.getKey()) / 2 >= Max ) {
                Max = (e1.getValue() - e1.getKey()) / 2;
            }
            
            if (e1.getValue() == seats.length) {
                if(seats.length - 1 -e1.getKey() > Max) { 
                    Max = seats.length - 1 -e1.getKey();
                }
            }            
        }
        return Max;
    }
}