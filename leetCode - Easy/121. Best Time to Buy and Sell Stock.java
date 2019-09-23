class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length < 1) return 0;
        
        List<Pair> listPairs = new ArrayList<Pair>();
        listPairs.add(new Pair(prices[prices.length - 1], prices[prices.length - 1], prices.length - 1, prices.length - 1));

        int imax = 0;
        int imin = 0;
        int indexList = 0;
        int result = 0;
        
        for (int i = prices.length - 2 ; i >= 0; i--) {
            if (prices[i] > listPairs.get(indexList).Max) {
                if ( i > listPairs.get(indexList).iMin)
                {
                    listPairs.add(new Pair(prices[i], listPairs.get(indexList).Min, i,                                       listPairs.get(indexList).iMin));
                indexList++; }
                else {
                    {listPairs.add(new Pair(prices[i], prices[i], i, listPairs.get(indexList).iMin));
                indexList++; }
                    
                }
            }
            if (prices[i] < listPairs.get(indexList).Min) {
                if (i < listPairs.get(indexList).iMax) {
                    listPairs.add(new Pair(listPairs.get(indexList).Max, prices[i],                                           listPairs.get(indexList).iMax, i));  
                    indexList++;
                } else {
                    listPairs.add(new Pair(prices[i], prices[i],                                           listPairs.get(indexList).iMax, i));  
                    indexList++;
                } 
            }
        }

        result = listPairs.get(0).result;
        listPairs.get(0).result = 0;
        return result;
    }
}

class Pair{
    int Min; 
    int Max;
    
    int iMin;
    int iMax;
    
    static int result = 0;
    
    static void result(int Max, int Min, int iMax, int iMin) {
        if (iMin <= iMax && Min != Max && result < Max - Min) {
            result = Max - Min;
        }        
    }
    
    Pair(int max, int min, int imax, int imin) {
        Min = min;
        Max = max;
        iMin = imin;
        iMax = imax;
        result(max, min, imax, imin);
    }
}

