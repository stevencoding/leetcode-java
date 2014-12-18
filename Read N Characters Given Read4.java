public class Solution extends Read4{
    public int read(char[] buf, int n){
        char[] buffer = new char[4];
        int readBytes = 0;
        boolean eof = false;
        while (!eof&&readBytes<n){
            int sz = read4(buffer);
            if(sz<4) eof=true;
            int bytes = Math.min(n-readbytes, sz);
            System.arraycopy(buffer, 0, buf, readBytes, bytes);
            readBytes += bytes;
        }
        return readBytes;
    }
}
