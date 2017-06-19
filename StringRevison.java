//1. Longest Palindrome(mode : easy)

Technique        
1. Use HashSet.
2. Use 2 array for lowecase and uppercase.

Time Complexity:
O(n).
Space Complexity:

O(Types of charcters the string have).


//2.Minimum characters to be added at front to make string palindrome
  
  Technique        
1. brute force.(remove the last charcter and check the substring is palindrome and keep on increasing count if it is not
or keep on adding the last charctert in the front of the string)


Time Complexity:
O(n2). in worst case
Space Complexity:
O(n).

  2.efficiently in O(n) time using lps array of KMP algorithm.
  
  Time Complexity:
  O(n). in worst case
  Space Complexity:
  O(n).
