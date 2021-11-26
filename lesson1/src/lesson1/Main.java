package lesson1;

import lesson1.Course;

public class Main {

    public static void main(String[] args) {

        Course course = new Course(250, 75);
        Team team = new Team("Лошары");
        team.showTeam();
        team.doIt(course);
        team.showResults();
    }
}
