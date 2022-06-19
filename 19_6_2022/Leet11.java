// https://leetcode.com/problems/container-with-most-water/ 

public int maxArea(int[] height) {
    int n=height.length;
    int i=0;
    int j=n-1;
    
    int max_area=0;
    
    while(i<j){ 
        int height_tower=Math.min(height[i],height[j]);
        int width=j-i;
        
        int curr_area=height_tower*width;
        
        if(max_area<curr_area){
            max_area=curr_area;
        }
        
        if(height[i]<height[j]){
            i++;
        } else {
            j--;
        }
    }
    
    return max_area;
    
}