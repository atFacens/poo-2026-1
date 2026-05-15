

import arenas.Arena;
import robos.RoboSimples;
import robos.RoboTank;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena(50, 50);

        RoboSimples robo1 = new RoboSimples(arena);
        RoboTank robo2 = new RoboTank(arena);

        System.out.println("Robo Simples: " + robo1);
        System.out.println("Robo Tank: " + robo2);

        robo1.andarSul(10);
        robo2.andarNorte(12);

        System.out.println("Robo Simples: " + robo1);
        System.out.println("Robo Tank: " + robo2);
    }
}
