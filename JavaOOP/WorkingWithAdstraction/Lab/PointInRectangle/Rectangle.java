package JavaOOP.WorkingWithAdstraction.Lab.PointInRectangle;


public class Rectangle {
    private Point bottomLeft;
    public Point getBottomLeft() {
        return bottomLeft;
    }
    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    private Point topRight;
    public Point getTopRight() {
        return topRight;
    }
    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    // public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {
    //     this.bottomLeft.setX(bottomLeftX);
    //     this.bottomLeft.setY(bottomLeftY);
    //     this.topRight.setX(topRightX);
    //     this.topRight.setY(topRightY);
    // }

    public Rectangle(Point bottomLeft , Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean isInHorizontal = 
            this.bottomLeft.getX() <= point.getX() &&
            this.topRight.getX() >= point.getX();

        boolean isInVertical = 
            this.bottomLeft.getY() <= point.getY() &&
            this.topRight.getY() >= point.getY();

        boolean isInRectangle = isInHorizontal && isInVertical;

        return isInRectangle;
    }
}
