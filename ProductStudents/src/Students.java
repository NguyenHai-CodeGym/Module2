import java.io.Serializable;

public class Students implements Serializable {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double score1;
    private double score2;
    private double score3;
    private double score4;
    public boolean check1 = true;
    public boolean check2 = true;
    public boolean check3 = true;
    public boolean check4 = true;
    private double mediumScoure;



    public double getMediumScoure() {
        return mediumScoure;
    }

    public void setMediumScoure() {
        this.mediumScoure = (this.score1 + this.score2 + this.score3 *2 + this.score4 *3)/7;
    }

    public boolean isCheck1() {
        return check1;
    }

    public boolean isCheck2() {
        return check2;
    }

    public boolean isCheck3() {
        return check3;
    }

    public boolean isCheck4() {
        return check4;
    }

    public void setCheck1(boolean check1) {
        this.check1 = check1;
    }

    public void setCheck2(boolean check2) {
        this.check2 = check2;
    }

    public void setCheck3(boolean check3) {
        this.check3 = check3;
    }

    public void setCheck4(boolean check4) {
        this.check4 = check4;
    }

    public Students(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Students(double score1, double score2, double score3, double score4,double mediumScoure) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.mediumScoure = mediumScoure;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", score4=" + score4 +
                ", mediumScoure=" + mediumScoure +
                '}';
    }
}
