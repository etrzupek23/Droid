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
  //creates a new instance
   Droid cody = new Droid("Cody");
   Droid zach = new Droid("Zach");
   System.out.println(cody);
   cody.performTask("dancing");
   cody.energy();
   cody.performTask("studying");
   cody.energy();
   System.out.println("\n" + zach);
   zach.performTask("playing basketball");
   zach.energy();
  }
}
