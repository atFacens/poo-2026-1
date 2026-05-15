package robos;

import arenas.Arena;

public class RoboTank extends Robo {

    public RoboTank(Arena arena) {
        super(arena);
    }

    @Override
    public void andarNorte(int deslocamento) {
        if(posY < deslocamento) {
            return;
        }
        System.out.println("Andando devagar com o Robo Tank");
        posY -= deslocamento;
    }

    @Override
    public void andarSul(int deslocamento) {
        if(posY + deslocamento > arena.getMaxY()) {
            return;
        }
        System.out.println("Andando devagar com o Robo Tank");
        posY += deslocamento;
    }

    @Override
    public void andarLeste(int deslocamento) {
        
    }

    @Override
    public void andarOeste(int deslocamento) {
        
    }
    
}
