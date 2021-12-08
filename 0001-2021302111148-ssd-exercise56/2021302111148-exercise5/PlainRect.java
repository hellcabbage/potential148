public class PlainRect extends Rectangle{
    public double startX;
    public double startY;
  
PlainRect(int lengthIn,int heightIn,Double xIn,Double yIn){
    super(lengthIn,heightIn);
    this.startX=xIn;
    this.startY=yIn;
}
PlainRect(){
    super(0,0);
    this.startX=0;
    this.startY=0;
}
public boolean isInside(double x,double y){
return (startX<x&x<(startX+length))&&(startY<y&y<(startY+height));
}
public static void main(String[] args) {
       
   
    PlainRect rect1=new PlainRect(15,10,1.0,1.0);
    System.out.println("length="+rect1.length);
    System.out.println("height="+rect1.height);
    System.out.println("area="+rect1.area());
    System.out.println("perimeter="+rect1.perimeter());
    
    System.out.println((rect1.isInside(15.5,12.2 )?"点（15.5，12.2）在矩形里":"点(15.5,12.2)不在矩形里"));

   }
}
