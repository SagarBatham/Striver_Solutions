// Problem Link: https://takeuforward.org/arrays/count-inversions/
// Count pairs (i, j) where i < j and nums[i] > nums[j].
// Example: nums = [5, 3, 2, 1, 4] -> 7 inversions
public class CountInversions {
    public static void main(String[] args) {
        // TODO: Add your solution.
    }

    public static long numberOfInversions(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public long mergeSort(int[] nums,int low,int high){
        if(low>=high){
            return 0;
        }
        long count=0;
        int mid=low+(high-low)/2;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=merge(nums,low,mid,high);

        return count;
    }

    public long merge(int[] nums,int low,int mid,int high){
        int p1=low;
        int p2=mid+1;
        int k=0;
        long count=0;
        int[] temp=new int[high-low+1];
        while(p1<=mid && p2<=high){
            if(nums[p1]>nums[p2]){
                count+=mid-p1+1;
                temp[k++]=nums[p2++];
            }else{
                temp[k++]=nums[p1++];
            }
        }

        while(p1<=mid){
            temp[k++]=nums[p1++];
        }

        while(p2<=high){
            temp[k++]=nums[p2++];
        }

        for(int i=0;i<temp.length;i++){
            nums[low+i]=temp[i];
        }

        return count;
    }
    
}
