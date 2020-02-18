public class Droid {
  //instances
  int batteryLevel;
  String name;
  //constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  //prints out the droid's introduction sentence
  public String toString(){
    return "Hello, I’m the droid " + name + ".";
  }
  //prints out what a certain droid is doing
  public void performTask(String task){
    System.out.println(name + " is now " + task + ".");
    batteryLevel = batteryLevel - 10;
  }
  public void energy(){
    int battery = batteryLevel;
    System.out.println(name +"'s battery level is now at " + batteryLevel + ".");
  }
  //the main method
  public static void main(String [] args){
    Droid Marissa = new Droid("Marissa");
    Droid Amanda = new Droid("Amanda");
  //all of Marissa's code
    System.out.println(Marissa);
    Marissa.performTask("dancing");
    Marissa.energy();
    Marissa.performTask("studying");
    Marissa.energy();
  //space
    System.out.println("");
  //all of Amanda's code
    System.out.println(Amanda);
    Amanda.performTask("playing basketball");
    Amanda.energy();
  }
}
