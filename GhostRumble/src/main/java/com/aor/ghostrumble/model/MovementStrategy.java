package com.aor.ghostrumble.model;

public abstract class MovementStrategy {
    protected int deltaX;
    protected int deltaY;

    public MovementStrategy() {
        deltaX = 0;
        deltaY = 0;
    }

    public abstract void update(Enemy enemy);

    public Position move(Enemy enemy) {

        //--
        //so para teste
        enemy.setPosition(enemy.moveRight());
        //--

        //deve estar aqui
        return enemy.moveCustom(deltaX, deltaY);
    }
}