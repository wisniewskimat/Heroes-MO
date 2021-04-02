package pl.sdk;

import java.util.Objects;

public class Segment {

    private Point startPoint;
    private Point endPoint;


    public Segment(Point aStartPoint, Point aEndPoint) {

        startPoint = aStartPoint;
        endPoint = aEndPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point aStartPoint) {
        startPoint = aStartPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point aEndPoint) {
        endPoint = aEndPoint;
    }

    void draw() {
        // drawing implementation
    }

    @Override
        public String toString() {
            return "Segment{" +
                    "startPoint=" + startPoint +
                    ", endPoint=" + endPoint +
                    '}';
        }


        @Override
        public boolean equals(Object aO) {
            return calculateLength(this) == calculateLength((Segment) aO);
        }

        private double calculateLength(Segment aSegment) {
            int diffX = aSegment.startPoint.getX() - aSegment.endPoint.getX();
            int diffY = aSegment.startPoint.getY() - aSegment.endPoint.getY();
            return Math.sqrt(diffX * diffX + diffY * diffY);
        }

        @Override
        public int hashCode() {
            return Objects.hash(startPoint, endPoint);
        }



}
