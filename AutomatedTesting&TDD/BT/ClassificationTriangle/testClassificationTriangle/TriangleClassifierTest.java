import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void triangleClassifier() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;

        String expected = "Đây không phải là Tam Giác";
        String result  = TriangleClassifier.TriangleClassifier(sideA,sideB,sideC);
        assertEquals(result,expected);
    }
}