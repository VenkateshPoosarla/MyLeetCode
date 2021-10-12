/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,r=n;
        while(l<=r){
            int mid=(r-l)/2+l;
            int out=guess(mid);
            if(out==0) return mid;
            else if(out<0) r=mid-1;
            else if(out>0) l=mid+1;
        }
        return -1;
    }
}