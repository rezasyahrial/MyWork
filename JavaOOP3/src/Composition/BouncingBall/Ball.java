package Composition.BouncingBall;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = speed * (float) Math.sin((Math.toRadians(direction)));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public int getSpeed(){
        return (int) Math.sqrt(xDelta*xDelta + yDelta*yDelta);
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -xDelta;
    }

    public void reflectVertical(){
        yDelta = -yDelta;
    }

    public int getDirection(){
        return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));
    }

    public String toString() {
        return "Ball at ("+ (int) x +", "+ (int) y +") of velocity ("+ getSpeed() +", "+ getDirection() +")";
    }

}
