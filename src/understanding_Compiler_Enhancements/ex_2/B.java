package understanding_Compiler_Enhancements.ex_2;

public class B extends A {
    int j;

    public B(int x, int y) {
        super(x);
        this.j = y;
    }

    B(int y) { super(y*2); j = y; }
    // B(int z) { this(z, z); }
    //B(int y) { j = y; j = y*2; } - Does not compile
    //B(int y) { j = y; } -Does not compile
    //B() { }  -Does not compile


}
