package robos;

import arenas.Arena;

public abstract class Robo {
    int posX, posY;
    Arena arena;

    public Robo(Arena arena) {
        this.arena = arena;
    }

    public Robo(Arena arena, int posX, int posY) {
        this.arena = arena;
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    @Override
    public String toString() {
        return "[" + posX + ", " + posY + "]";
    }

    public abstract void andarNorte(int deslocamento);
    public abstract void andarSul(int deslocamento);
    public abstract void andarLeste(int deslocamento);
    public abstract void andarOeste(int deslocamento);

}
