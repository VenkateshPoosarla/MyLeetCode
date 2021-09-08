/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int temp=0;
        int count=4;
         char []ch=new char[4];
    
        while(temp<n && count==4)
        {
            count=read4(ch); 
            // temp+=count;
            for(int i=0;i<count;i++){
                if (temp == n)
                    return temp;
                buf[temp++]=ch[i];
            }
            // if(temp-n<4 && temp-n>0){
            //     break;
            // }
            
        }
        return temp;
    }
}