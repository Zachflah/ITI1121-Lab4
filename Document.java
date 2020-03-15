//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class Document{

  protected Integer id = 99;
  protected String name;
  protected String owner;

  public Document(String name,String owner){
    this.name = name;
    this.owner = owner;
    id++;
  }
  public int getIndexNumber(){      //gets the index number
    return id;
  }
  public String getName(){         //gets the document name
    return name;
  }
  public void rename(String n){     //allows someome to be able to change the document name
    name = n;
  }
  public String getOwner(){        //gets the name of owner of the document
    return owner;
  }
  public void changeOwner(String o){        //allows someone to be able to change the name of the owner of the document
    owner = o;
  }
  public boolean equals(Document other){    //method to compare 2 objects
    boolean something = true;

    if(other == null){             //make sure that the object we are comparing to isn't null
      something = false;
    }
    if(this.getClass() != other.getClass()){     //makes sure the object are of the same class
      something = false;
    }
    if(!this.name.equalsIgnoreCase(other.name) || other.name == null){     //compares if the documents have the same name ignoring uppercase
      something = false;
    }
    if(!this.owner.equalsIgnoreCase(other.owner) || other.owner == null){    //comapre if both documents have the same owner ignoring uppercase
      something = false;
    }
    if(!this.id.equals(other.id) || other.id == null){       //compare if both documents have the same id
      something = false;
    }
    return something;            //if something return true, then both documents are the same otherwise they are different
  }
  public String toString(){
    StringBuffer str = new StringBuffer();
    str.append(" id: ");
    str.append(id);
    str.append(" , name: ");
    str.append(name);
    str.append(" , owner: ");
    str.append(owner);
    return str.toString();
  }
}
