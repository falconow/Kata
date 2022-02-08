package Task428;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        moveRobot(new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                return new RobotConnection() {
                    @Override
                    public void moveRobotTo(int x, int y) {

                    }

                    @Override
                    public void close() {

                    }
                };
            }
        },5,5);

    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection connection = null;
        for (int i = 0;i < 3; i++) {
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw  new RobotConnectionException("Error connect!");
                }
            } finally {
                try {
                    connection.close();
                } catch (Exception ignored) {}
            }
        }
    }

    public static void moveRobot2(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0;i < 3; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw e;
                }
            }
        }
    }
}
