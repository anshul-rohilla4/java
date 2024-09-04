import  java.util.*;
public class areaOfIntersectionCircle {
    public static void main(String[] args){
        System.out.println(areaOfIntersection(5,1,3,5,3,4));


    }
    static double areaOfIntersection(int x0,int y0,int r0,int x1,int y1,int r1){
        double PI=3.14;
        double d=Math.sqrt(((x1-x0)*(x1-x0))+((y1-y0)*(y1-y0)));//distance between the centers
        if(d>r0+r1)//circle are far away from each other ,ie. no intersection
        {
            return 0;
        }
        if((d<(r0-r1)) &&(r0>r1)){
            return PI*r1*r1;// Smaller circle is completely inside the larger one
        }
        if((d<=r1-r0) && r1>=r0){
            return PI*r0*r0;// Larger circle is completely inside the smaller one
        }
        if(d==r1+r0)
        {
            return 0;//both circle just touches the edge of each other without any overlapping
        }
        double aplha=Math.acos(((r0*r0)+(d*d)-(r1*r1))/(2*r0*d))*2;
        double beta=Math.acos(((r1*r1)+(d*d)-(r0*r0))/(2*r1*d))*2;

        double aLeftSector=(aplha*r0*r0)/2;
        double aLeftTri=0.5*r0*r0*Math.sin(aplha);

        double aRightHalfCircle=aLeftSector-aLeftTri;
        // aRightHalfCircle=(((r0*r0)/2)*(aplha-Math.sin(aplha))); simplify the formula

        double aLeftHalfCircle=(((r1*r1)/2)*(beta-Math.sin(beta)));


        return aRightHalfCircle+aLeftHalfCircle;

    }
}
