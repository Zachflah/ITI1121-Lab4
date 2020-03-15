//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public abstract class MediaDocument extends Document{

  protected int duration;

  public MediaDocument(String name,String owner, int duration){

    super(name,owner);         //asked the parent class if they can use it's varaibles

    this.duration = duration;
    
  }
  public abstract int getRating();      //method which must be implemented in the child class
}
