
public class Test {

    private InnerTest test = new InnerTest(100);

    public InnerTest getTest() {
        return test;
    }

    public void setTest(InnerTest test) {
        this.test = test;
    }

    public void printI(){
        System.out.println(test.getI());
    }

    class InnerTest{
        public int i;

        public InnerTest(int i){
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    public static void main(String[] args) {
        Integer a = new Integer(100);
        Integer b = new Integer(10);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        a = b;
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a == b);
        Test myTest = new Test();
        InnerTest innerTest = myTest.getTest();
        myTest.printI();
        innerTest.setI(200);
        myTest.printI();
    }
}
