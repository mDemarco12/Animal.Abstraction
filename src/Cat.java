public class Cat extends Animal{

    private int numLegs;

    public void drink(){
        System.out.println("I love drinking milk");
    }
    public void speak(){
        System.out.println("I will now meow; meow....");
    }

    @Override
    public void walk() {

    }

    public void eat(){
        System.out.println("Cat eats food");
    }


}
