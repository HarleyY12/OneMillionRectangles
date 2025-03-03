
import java.util.ArrayList;


public class Main
{
    public static void main(String arg[]){
        Rectangle rectangle1 = new Rectangle(20,10,10,15);
        ArrayList<Rectangle>rectangleArrayList = new ArrayList<>();
        for(int i = 0;i<999999;i++){
            Rectangle newRectangle = new Rectangle((int)(Math.random()*50+10),
                    (int)(Math.random()*10+5),(int)(Math.random()*49),
                    (int)(Math.random()*49));
            rectangleArrayList.add(newRectangle);
            System.out.println("Rectangle " + (i+1) + "." +
                    " Length:" +rectangleArrayList.get(i).getLength() +
                    " Width:"+rectangleArrayList.get(i).getWidth() +
                    " X position:" + rectangleArrayList.get(i).getxPos() +
                    " Y position:" + rectangleArrayList.get(i).getyPos());
        }



    }


}


