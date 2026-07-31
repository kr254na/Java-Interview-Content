package DSA.Stack;

import java.util.Arrays;

class Asteroid {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = 0;

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (top > 0 && stack[top - 1] > 0 && asteroid < 0) {
                if (stack[top - 1] < -asteroid) {
                    top--;
                }
                else if (stack[top - 1] == -asteroid) {
                    top--;
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack[top++] = asteroid;
            }
        }

        return Arrays.copyOf(stack, top);
    }
}