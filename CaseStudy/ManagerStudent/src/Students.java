public class Students {
    private int id;
    private String name;
    private String date;
    private String gender;
    private double score1 = -1;
    private double score2 = -1;
    private double score3 = -1;
    private double score4 = -1;
    private double mediumScore;

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore() {
        int count = 0;
        double total = 0;
        if(this.getScore1() > -1){
            total += this.getScore1();
            count += 1;
        }
        if(this.getScore2() > -1){
            total += this.getScore2();
            count += 1;
        }
        if(this.getScore3() > -1){
            total += this.getScore3() *2;
            count += 2;
        }
        if(this.getScore4() > -1){
            total += this.getScore4() * 3;
            count += 3;
        }
        this.mediumScore = total / count;
    }

    public Students(int id, String name, String date, String gender) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
    }
    public Students(){}

    public Students(double score1, double score2, double score3, double score4, double mediumScore) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.mediumScore = mediumScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getScore4() {
        return score4;
    }

    public void setScore4(double score4) {
        this.score4 = score4;
    }


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", score4=" + score4 +
                ", mediumScore=" + mediumScore +
                '}';
    }
}
