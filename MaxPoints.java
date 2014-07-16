/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

// special case 1: same points (1,1) (1,1) MIN_VALUE
// special case 2: vertical line (1,1) (1,2) MAX_VALUE
// special case 3: horizontal line (1,1) (2,1) Caution! Java Double treats -0.0 and +0.0 differently
public class MaxPoints {
	public int maxPoints(Point[] points) {
		if(points==null||points.length==0) return 0;
		HashMap<Double, Integer> slope = new HashMap<Double, Integer>;
		int max = 1;//the original point itself
		
		for(int i=0; i<points.length; i++){
			slope.clear();
			slope.put((double)Integer.MIN_VALUE, 1);//the original point itself
			
			for(int j=i+1; j<points.length;j++){
				// special case 1: same points
				if(points[i].x==points[j].x&&points[i].y==points[j].y){
					s=
					
				}else if(){
					
				}
				
				//special case 2
			}
		}
	}
	
	public static void main(String[] args){

	}
}