import java.util.*;

public class FindMedianSortedArrays {
	// the complexity is O(log(m+n))
	

	// the complexity is O(m+n)
    // public double findMedianSortedArrays(int A[], int B[]) {
    // 	if(A.length == 0) return findMedianArray(B);
    // 	if(B.length == 0) return findMedianArray(A);
    // 	int[] c = new int[A.length+B.length];
    // 	int i=0, j=0, k=0;
    // 	while(i<A.length&&j<B.length){
    // 		if(A[i]<B[j]){
    // 			c[k] = A[i];
    // 			i++;k++;
    // 		}else{
    // 			c[k] = B[j];
    // 			j++;k++;
    // 		}
    // 	}
    // 	if(i==A.length){
    // 		while(j<B.length){
    // 			c[k] = B[j];
    // 			j++;k++;
    // 		}
    // 	}else{
    // 		while(i<A.length){
    // 			c[k] = A[i];
    // 			i++;k++;
    // 		}
    // 	}

    // 	return findMedianArray(c);
    // }

    // public double findMedianArray(int C[]){
    // 	int len = C.length;
    // 	if(len%2==0){
    // 		return (C[len/2-1]+C[len/2])/2.0;
    // 	}else{
    // 		return C[len/2];
    // 	}
    // }

    // public static void main(String[] args){
    // 	int[] A = {1};
    // 	int[] B = {1};
    // 	double res =  new FindMedianSortedArrays().findMedianSortedArrays(A, B);
    // 	System.out.println(res);
    // }
}