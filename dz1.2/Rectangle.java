public class Rectangle {
    private double width;
    private double height;

    //конструктор без параметров
    public Rectungle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    //конструктор с параметрами, принимаюшими знаечения ширины и выосты
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

        public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculateArea(){
        return width*height;
    }

    public double calculatePerimeter(){
        return 2*(width+height);
    }
}
