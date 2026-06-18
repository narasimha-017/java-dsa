class Solution {

public int[] plusOne(int[] arrs) {
    ArrayList<Integer>arr=new ArrayList<>();
    int n=arrs.length-1;
    int carry=1;
    while(n>=0 || carry>0){
        int digit;
        int sum;
        if(n<0 && carry>0){
             arr.add(0,carry);
              break; 
        }
        sum=arrs[n]+carry;
        if(sum>=10){
            
             carry=sum/10;
            digit=sum%10;

        }
        else
        {
            digit=sum%10;
            carry=0;
        }
        arr.add(0,digit);
        n--;
    }

      int[] ans = new int[arr.size()];

for(int i = 0; i < arr.size(); i++) {
    ans[i] = arr.get(i);
}

return ans;
    }
}
