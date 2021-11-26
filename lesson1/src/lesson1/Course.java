package lesson1;

public class Course {
    private double track;
    private double poolLength;

    public Course(double track, double poolLength) {
        this.track = track;
        this.poolLength = poolLength;
    }

    public double getTrack() {
        return track;
    }

    public double getPoolLength() {
        return poolLength;
    }
}
