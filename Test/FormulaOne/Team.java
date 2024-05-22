package FormulaOne;

public class Team {
    String id;
    String name;
    String driver1;
    String driver2;
    int points;

    public Team(String id, String name, String driver1, String driver2, int points) {
        this.id = id;
        this.name = name;
        this.driver1 = driver1;
        this.driver2 = driver2;
        this.points = points;
    }
    public String toString() {
        return String.format("%-10s %-25s %-20s %-20s %-5d", id, name, driver1, driver2, points);
    }
}