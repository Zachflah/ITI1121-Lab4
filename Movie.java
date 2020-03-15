//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class Movie extends MediaDocument{

  private int story;
  private int acting;

  public Movie(String name,String owner, int duration, int story, int acting){

    super(name,owner,duration);    //asked the parent class if they can use it's varaibles

    this.story = story;
    this.acting = acting;
  }
  public int getStroyRating(){
    return story;
  }
  public int getActingRating(){
    return acting;
  }
  public int getRating(){      //implementation of the abstract method in the parents class
    int rating;

    rating = ((acting + story)/2);
    return rating;
  }
}
