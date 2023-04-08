
public class HealthStation {

    private int weighings;

    public int weigh(Person person) {
        weighings = weighings + 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        currentWeight = currentWeight + 1;

        person.setWeight(currentWeight);
    }

    public int weighings() {
        return weighings;
    }
}
