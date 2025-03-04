
import java.util.ArrayList;


public class Main
{
    public static void main(String arg[]){
        int numberOfTotalRectangles = 50;
        Rectangle rectangle1 = new Rectangle(20,10,10,15);
        ArrayList<Rectangle>rectangleArrayList = new ArrayList<>();
        for(int i = 0;i<numberOfTotalRectangles;i++){
            Rectangle newRectangle = new Rectangle((int)(Math.random()*41+10),
                    (int)(Math.random()*6+5),(int)(Math.random()*49+1),
                    (int)(Math.random()*49+1));
            rectangleArrayList.add(newRectangle);
            System.out.println("Rectangle " + (i+1) + "." +
                    " Length:" +rectangleArrayList.get(i).getLength() +
                    " Width:"+rectangleArrayList.get(i).getWidth() +
                    " X position:" + rectangleArrayList.get(i).getxPos() +
                    " Y position:" + rectangleArrayList.get(i).getyPos());
        }
        int touchingRectangles = 0;
        for(Rectangle rectangle : rectangleArrayList){
            boolean xOverlap = rectangle1.xPos < rectangle.xPos + rectangle.length
                    &&rectangle.xPos<rectangle1.xPos+rectangle1.length;
            boolean yOverlap = rectangle1.yPos < rectangle.yPos + rectangle.width
                    &&rectangle.yPos<rectangle1.yPos+rectangle1.width;
            if (xOverlap && yOverlap) {
                touchingRectangles = touchingRectangles + 1;
            }
        }
        double percentage = (double)touchingRectangles/numberOfTotalRectangles*100;
        System.out.printf("%.1f%%\n", percentage);
    }


}


