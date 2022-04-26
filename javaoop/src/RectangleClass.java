

public class RectangleClass {
    private float length, widht;

    public RectangleClass(){
        length = 1.0f;
        widht = 1.0f;
    }

    public RectangleClass(float length, float widht){
        this.length = length;
        this.widht = widht;
    }

    public float getLength() {
        return length;
    }

    public float getWidht() {
        return widht;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidht(float widht) {
        this.widht = widht;
    }

    public float getArea(){
        return length*widht;
    }

    public float getPerimeter(){
        return 2*(length+widht);
    }

    public String toString(){
        return "Rectangle[length=" + length + ",width=" + widht + "]";
    }
}
