package ict301.solid.isp;

public class MainISP {
    public static void main(String[] args) {
        HumanWorkerRefactored human = new HumanWorkerRefactored();
        human.work();
        human.eat();

        RobotWorkerRefactored robot = new RobotWorkerRefactored();
        robot.work();
       
    }
}
