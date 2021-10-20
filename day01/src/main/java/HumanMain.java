public class HumanMain {

    public static void main(String[] args) {
        Human human = new Human("Béla", 34);

        Human humanother = new Human("Géza", 56);

        System.out.println(human.intruduction());
        System.out.println(human.getName());
        System.out.println(human.getAge());

        System.out.println(humanother.intruduction());
        System.out.println(humanother.getName());
        System.out.println(humanother.getAge());


    }
}
