class Solution {
    public double angleClock(int hour, int minutes) {
        double hourHand = (hour %12 ) * 30 + minutes/2.0;
        double minHand = minutes*6;
        double angle = Math.abs(hourHand - minHand);
        return Math.min(angle, 360-angle);
    }
}