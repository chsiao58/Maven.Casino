public abstract class Player {
    public Person getPerson() {
        return person;
    }

    protected Person person;

    public Player(Person p) {
        person = p;
    }

    public Player() {

    }
}
