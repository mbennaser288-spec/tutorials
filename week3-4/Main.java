public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Amin", "P100");
        Person p2 = new Student("Ben Naser", "202409010643");
        Person p3 = new Lecturer("Dr Ahmad", "L100");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}

