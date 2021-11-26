package lesson1;

import lesson1.Competitor;
import lesson1.Course;

public class Team {
    private String teamName;
    private Competitor[] competitors;

    public Team(String teamName){
        this.teamName = teamName;
        this.competitors = new Competitor[4];
        competitors[0] = new Competitor("Ivan", 15, 5);
        competitors[1] = new Competitor("Boris", 18, 6.5);
        competitors[2] = new Competitor("Stepan", 25, 6);
        competitors[3] = new Competitor("Panteleymon", 10, 3);
    }

    public void showTeam(){
        System.out.println("Поприветствуем команду " + teamName + "!!!");
        for (int i = 0; i < competitors.length; i++) {
            System.out.print("Участник №" + (i+1) + " "); competitors[i].showInfo();
        }
    }

    public void doIt(Course course){
        for (int i = 0; i < competitors.length; i++) {
            competitors[i].setRunTime(course.getTrack()/competitors[i].getRunSpeed());
            competitors[i].setSwimTime(course.getPoolLength()/competitors[i].getSwimSpeed());
            competitors[i].setResultTime(competitors[i].getRunTime() + competitors[i].getSwimTime());
        }
    }

    public void showResults(){
        System.out.println("Итоговые результаты:");
        for (int i = 0; i < competitors.length; i++) {
                System.out.println("Участник " + competitors[i].getName() + " пробежал за "
                        + competitors[i].getRunTime() + " с., проплыл за " + competitors[i].getSwimTime()
                        + " с. Всего на дистанцию потратил " + competitors[i].getResultTime() + " с.");
        }
    }
}
