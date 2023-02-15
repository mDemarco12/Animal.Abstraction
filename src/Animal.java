public abstract class Animal {

    private int numEyes;
    private double age;

    public Animal(){
        numEyes = 0;
        age = 0.0;
    }

    public Animal(int numEyes, double age){
        this.numEyes = numEyes;
        this.age = age;

    }

    public int getNumEyes() {
        return numEyes;
    }

    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }

    public abstract void eat();
    public abstract void speak();//{
       // System.out.println("Meow meow");
    //}

    public abstract void walk();//{
       // System.out.println("Walking...");
   // }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public String toString(){

        return "Animal has " + numEyes + " eyes and age is " + age;
    }


    public static void main(String[] args) {




    }
}