import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            // Process collisions only when current asteroid moves left (< 0)
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (Math.abs(stack.peek()) < Math.abs(a)) {
                    // Top asteroid explodes; continue checking next one
                    stack.pop();
                    continue;
                } else if (Math.abs(stack.peek()) == Math.abs(a)) {
                    // Both asteroids destroy each other
                    stack.pop();
                }
                // In both equal or smaller cases, the new asteroid is destroyed
                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // Convert stack to array (in correct order)
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
