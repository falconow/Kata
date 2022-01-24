package Task3;

public class Main {
    public static void main(String[] args) {

    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        //Проверяем направление по X
        if (toX > startX) {
            //Крутим робота
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            //Перемещаемся в точку
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else {
            //Крутим робота
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            //Перемещаемся в точку
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }

        //Проверяем направление по Y
        if (toY > startY) {
            //Крутим робота
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            //Перемещаемся в точку
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        } else {
            //Крутим робота
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            //Перемещаемся в точку
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
