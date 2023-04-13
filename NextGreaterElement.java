class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>() ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i : nums2){
            while(!stack.isEmpty() && i > stack.peek())
                map.put(stack.pop() , i) ;
            stack.push(i) ;
        }
        for(int i = 0 ; i < nums1.length ; i++)
            nums1[i] = map.getOrDefault(nums1[i] , -1) ;
        
        return nums1 ;
    }
}