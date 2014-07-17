import java.util.*;
 

class Point {
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}

// step 1: select a base point (0,0)
// step 2: calculate slope between base point and all the other points
		// special case 1: point same as base point (0,0)
		// special case 2: vertical line (0,1) slope = MAX_VALUE
		// special case 3: -0.0 and +0.0 slope shall be same
// step 3: update max point number = (base point) + (point same as base point) + (points with same slope)

public class MaxPoints {
	public int maxPoints(Point[] points) {
		if(points==null||points.length==0) return 0;
		HashMap<Double, Integer> hash = new HashMap<Double, Integer>();
		int max = 0;
		double s;
		
		for(int i=0; i<points.length; i++){
			hash.clear();
			int dup = 0; 
			
			for(int j=i+1; j<points.length;j++){
				if(points[i].x==points[j].x&&points[i].y==points[j].y){
					// special case 1
					dup++;
				}else{
					// special case 2 // normal cases // special case 3
					s = (points[i].x==points[j].x) ? (double)Integer.MAX_VALUE:0.0+((double)(points[j].y-points[i].y)/(double)(points[j].x - points[i].x));

					// update hashmap
					if(hash.containsKey(s)){
						hash.put(s, hash.get(s)+1);
					}else{
						hash.put(s, 1);
					}	
				}
			}

			// update max // base point itself excluded
			if(hash.isEmpty()){
				if(dup>max) max = dup;
			}else{
				for(int cnt:hash.values()){
					if((cnt+dup)>max) max = cnt + dup;
				}
			}
		}
		return max+1;
	}
	
	public static void main(String[] args){
		MaxPoints sol = new MaxPoints();
		Point p1 = new Point(2,3);
		Point p2 = new Point(3,3);
		Point p3 = new Point(-5,3);
		Point[] points = {p1, p2, p3};
		int res1 = sol.maxPoints(points);
		System.out.println(res1);
	}
}
