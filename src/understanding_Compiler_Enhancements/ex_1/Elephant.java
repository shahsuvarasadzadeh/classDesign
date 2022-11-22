package understanding_Compiler_Enhancements.ex_1;

public class Elephant extends Mammal{
    public Elephant(int age) {
        super(age);
    }

   /* exten etdiyimiz classin icinde eger parametrli konstruktor varsa ,
     bu halda biz mütləq child classda ən azı bir konstruktor
    yaratmalıyıq və həmin konstruktor parent konstruktoru super() ilə aşkar şəkildə
    çağırmalıdır. Əks halda kompayl xətası verəcək:*/
}
