public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "lesi",12,96,new String[]{"walking","playing","sleeping"});
        Human father = new Human("Roza","Memmedova",2001);
        Human mother = new Human("Seymur","Memmedov", 2000);
        Human child = new Human("Aslan","Memmedov", 2025, 90, pet, mother, father, null);
        System.out.println(child);
        child.greetPet();
        child.describePet();
        pet.eat();
        pet.respond();
        pet.foul();
        pet.foul();
    }
}