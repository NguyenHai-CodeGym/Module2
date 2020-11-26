public class Point3D extends Point2D {
    private float z;

    public Point3D(){}

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.SetXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point 3D: "
                + super.toString()
                +" "
                +"z="
                + z;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
    }
}
