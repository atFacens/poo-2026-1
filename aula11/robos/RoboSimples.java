package robos;

import arenas.Arena;

public class RoboSimples extends Robo {

    public RoboSimples(Arena arena) {
        super(arena);
    }

    @Override
    public void andarNorte(int deslocamento) {
        if(posY < deslocamento) {
            return;
        }
        System.out.println("Andando com o Robo Simples");
        posY -= deslocamento;
    }

    @Override
    public void andarSul(int deslocamento) {
        if(posY + deslocamento > arena.getMaxY()) {
            return;
        }
        System.out.println("Andando com o Robo Simples");
        posY += deslocamento;
    }

    @Override
    public void andarLeste(int deslocamento) {
        
    }

    @Override
    public void andarOeste(int deslocamento) {
        
    }
    
}
