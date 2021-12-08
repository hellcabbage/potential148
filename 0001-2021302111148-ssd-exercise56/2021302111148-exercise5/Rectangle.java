public class Rectangle {
   public int length;
    public int height;
    Rectangle(int lengthIn,int heightIn){
        this.length=lengthIn;
        this.height=heightIn;
    }
    Rectangle(){
        this.length=10;
        this.height=10;
    }
    public int area(){
           int area=length*height;
           return area;
    }
    public int perimeter(){
        int perimeter=2*(length+height);
        return perimeter;
    }
    public int getLength(){
        return this.length;
    }
    public int getHeight(){
        return this.height;
    }
   
}
