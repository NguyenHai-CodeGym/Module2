public class TriangleClassifier {
    public static String TriangleClassifier(int sideA, int sideB, int sideC) {
        if((sideA + sideB < sideC) || (sideA + sideC < sideB) || (sideB + sideC < sideA)){
            return "Đây không phải là Tam Giác";
        }
        else if (sideA == sideB && sideB == sideC){
            return "Đây Là Tam Giác Đều";
        }
        else if (sideA == sideB || sideB == sideC || sideC == sideA){
            return "Đây Là Tam Giác Cân";
        } else {
            return "Đây là Tam Giác Thường";
        }
    }
}
