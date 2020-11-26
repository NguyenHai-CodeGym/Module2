public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getX(), getY()};
    }

    @Override
    public String toString() {
        return "MoveablePoint" +
                super.toString()
                +", "
                + "xSpeed: "
                + xSpeed
                + "ySpeed: "
                + ySpeed;

    }

    public MoveablePoint move(){
         setX(getX() +  xSpeed);
         setY(getY() +  ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint.move());

    }
}
