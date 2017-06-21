1. Search in Rotated Sorted Array.
2. Binary search - finding first or last occurrence of a number.
  
  result = -1
  while(low <= high){
    int mid =(low + high)/2;
    if(arr[mid] == target){
        result = mid;
        high = mid -1;//fidning thefirst occurence
        low = mid + 1; //finding the last occurence
    }
  }

3. Count occurrences of a number in a sorted array with duplicates using Binary Search

  Technique : as mentionedinr above problem find the first and last occurence of that no. in array.
  time complexity : O(log(n))
  space complexity: O(1)
    
4. How many times is a sorted array rotated?
    
    Technique : using linear search
    time complexity : O(n)
    space complexity: O(1)
      
      
     Technique : using Binary search
    time complexity : O(log(n))
    space complexity: O(1)
      
      
 
 
