//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class Audio extends MediaDocument{

  private int rating;

  public Audio(String name, String owner, int duration, int rating){

    super(name,owner, duration);     //asked the parent class if they can use it's varaibles

    this.rating = rating;
  }
  public int getRating(){         //implementation of the abstract method in the parents class
    return rating;
  }

}
