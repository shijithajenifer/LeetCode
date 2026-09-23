class Solution {
    public boolean validMountainArray(int[] arr) {
        int size=arr.length;
        int climb=0;
        while(climb+1<size && arr[climb]<arr[climb+1])
        {
            climb++;
        }
        if((climb==size-1) ||(climb==0)){
            return false;
        }  
        while(climb+1<size && arr[climb]>arr[climb+1])
        {
            climb++;
        }
        return (climb==size-1);
    }
}