package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 1, res = 1;
        if (power < 0) System.out.println("too much power");
        if (power == 0) System.out.println("1");
        while (i <= power + 1){
            System.out.println(res);
            res *= 2;
            ++i;
        }
    }
}
