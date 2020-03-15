//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01


import java.util.*;

public class Test{

  public static void main(String [] args){

    int sum = 0;
    MediaDocument s = new Movie("The S","FOX",25, 8, 9);
    MediaDocument f = new Movie("The F","FOX",50, 3, 5);
    MediaDocument g = new Movie("The G","FOX",75, 9, 7);
    MediaDocument t = new Movie("The T","FOX",35, 9, 9);
    MediaDocument y = new Audio("The Y", "Spot",3, 6);
    MediaDocument x = new Audio("The X", "Spot",2, 4);
    MediaDocument z = new Audio("The Z", "Spot",3, 9);
    MediaDocument w = new Audio("The W", "Spot",4, 7);

    ArrayList<MediaDocument> doc = new ArrayList<MediaDocument>();

    doc.add(s);
    doc.add(f);
    doc.add(g);
    doc.add(t);
    doc.add(y);
    doc.add(x);
    doc.add(z);
    doc.add(w);

    for(int i = 0; i < doc.size(); i++){
      sum = sum + (doc.get(i).getRating());
    }
    System.out.println(sum);

  }
}
