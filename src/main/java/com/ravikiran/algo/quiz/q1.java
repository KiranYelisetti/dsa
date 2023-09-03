
/* 
A - make money 
 Kefa decided to make some money doing business on the Internet for exactly n days. He knows that on the i-th day (1 ≤ i ≤ n) he makes ai money. Kefa loves progress, that's why he wants to know the length of the maximum non-decreasing subsegment in sequence ai. Let us remind you that the subsegment of the sequence is its continuous fragment. A subsegment of numbers is called non-decreasing if all numbers in it follow in the non-decreasing order.

Help Kefa cope with this task!

The first line contains integer n (1 ≤ n ≤ 105).

The second line contains n integers a1,  a2,  ...,  an (1 ≤ ai ≤ 109).
Print a single integer — the length of the maximum non-decreasing subsegment of sequence a.



*/
public class q1 {
    public static void main(String[] args) {
       int[] arr = {2,2,1,3,4,1};
       int maxLength = 1;
       int currentLength = 1;
      for(int i=1;i<arr.length;i++){
          if(arr[i]>=arr[i-1]){
              currentLength++;
          }else{
              currentLength = 1;
          }
          if(currentLength>maxLength){
              maxLength = currentLength;
          }
      }
      System.out.println("Length " + maxLength);
    }
}