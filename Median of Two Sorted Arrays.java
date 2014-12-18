// generalize question to be: find the kth number in two sorted array
// A.lenght = m   B.length = n

public class FindMedianSortedArrays{
    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length;
        int n = B.length;
        if((m+n)%2==0){
            return (getKthNumber(A, 0, m-1, B, 0, n-1, (m+n)/2)+getKthNumber(A, 0, m-1, B, 0, n-1, (m+n)/2+1))/2.0;
        }else{
            return getKthNumber(A, 0, m-1, B, 0, n-1, (m+n)/2+1)*1.0;
        }
    }

    // ar: right index in A | al: left index in A | br: right index in B | bl: left index in B
    // k: fint kth number in A and B
    // A[ar] A[ar+1] ... A[(ar+al)/2] ... A[al]       section 1      section 2
    // B[br] B[br+1] ... B[(br+bl)/2] ... B[bl]       section 3      section 4  
    // compare A[(ar+al)/2] and B[(br+bl)/2]
    // compare k and (al-ar+1)/2 + (bl-br+1)/2
    int getKthNumber(int A[], int ar, int al, int B[], int br, int bl, int k){
        if(ar>al) return B[k-1];
        if(br>al) return A[k-1];
        if(k<=1) return Math.min(A[ar], B[br]);
        if(((al-ar+1)/2+(bl-br+1)/2)>=k){
            if(A[(al+ar)/2]<B[(bl+br)/2]){
                // omit section 4
                return getKthNumber(A, ar, al, B, br, (bl+br)/2, k);
            }else{
                // omit section 2
                return getKthNumber(A, ar, (al+ar)/2, B, br, bl, k);
            }
        }else{
            if(A[(al+ar)/2]<B[(bl+br)/2]){
                // omit section 1
                return getKthNumber(A, (al+ar)/2, al, B, br, bl, k-(al-ar)/2);
            }else{
                // omit section 3
                return getKthNumber(A, ar, al, B, (bl+br)/2, bl, k-(bl-br)/2);
            }
        }
    }

    public static void main(String[] args){
        FindMedianSortedArrays sol = new FindMedianSortedArrays();
        int A[] = {1,2,3,4,5};
        int B[] = {0,0,4,6};
        double res1 = sol.findMedianSortedArrays(A, B);
        System.out.println(res1);
    }
}