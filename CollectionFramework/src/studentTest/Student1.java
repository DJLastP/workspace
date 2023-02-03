package studentTest;

public class Student1 {
    private String name;
    private int korScore;
    private int engScore;
    private int totalScore;
    private double avgScore;

    public Student1(String name, int korScore, int engScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.totalScore = korScore + engScore;
        this.avgScore = totalScore / 2;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", totalScore=" + totalScore +
                '}';
    }
}


