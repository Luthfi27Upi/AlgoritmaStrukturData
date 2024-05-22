package FormulaOne;

public class Driver {
    String id;
    String name;
    String team;
    String nationality;
    int points;

    public Driver(String id, String name, String team, String nationality, int points) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.nationality = nationality;
        this.points = points;
    }
    public String toString() {
        return String.format("%-5s %-20s %-25s %-15s %-5d", id, name, team, nationality, points);
    }
}