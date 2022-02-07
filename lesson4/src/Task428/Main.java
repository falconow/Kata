package Task428;

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
        int i = 0;
        RobotConnection connection = null;
        try {
            connection = robotConnectionManager.getConnection();
            connection.moveRobotTo(toX, toY);
            i = 0;
        } catch (RobotConnectionException e) {

        } finally {
            connection.close();
        }

    }
}
