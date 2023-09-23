package com.company;

//q 1 )
//class cylinder{
//    int r;
//    float h;
//    public void setdata(int a,float b){
//        r=a;
//        h=b;
//    }
//    public void getdata(){
//        System.out.println("radius= "+r);
//        System.out.println("height= "+h);
//    }
//}

//q 2)
//class cylinder{
//    float r,h,s,v;
//    public double surfacearea(float a,float b){
//        r=a;
//        h=b;
//        s=(2*3.141f*r*h)+(2*3.141f*r*r);
//        System.out.println("surfaceArea= "+s);
//        return s;
//    }
//    public double volume(float p,float q){
//        r=p;
//        h=q;
//        v=3.141f*r*r*h;
//        System.out.println("volume= "+v);
//        return v;
//    }
//}
 //q 3)
//class cylinder{
//    float h;
//    float r;
//    public cylinder(float a,float b){
//        h=a;
//        r=b;
//       System.out.println("height= "+h);
//       System.out.println("radius= "+r);
//    }
//
//}
    //q 4)
class rectang{
    float len;
    int bre;
   public rectang(float a){
       len=a;

   }
   public rectang(int b){
       bre=b;
   }
   public void getlen(){
       System.out.println("length= "+len);

   }
   public void getbre(){
       System.out.println("breath= "+bre);
   }

}
public class Harry_44practiceset {
    public static void main(String[] args) {
        //q1))
//        cylinder cyl=new cylinder();
//        cyl.setdata(2,13.5f);
//        cyl.getdata();
        //q2)

//        cylinder cyl1=new cylinder();
//        cyl1.surfacearea(4.5f,5.6f);
//        cyl1.volume(7.8f,4.5f);
        //q 3)
       // cylinder cyl3=new cylinder(6.7f,4.5f);

        //q 4)
        rectang rec=new rectang(4.5f);
        rec.getlen();
        rectang rec2=new rectang(3);
        rec2.getbre();
    }
}
