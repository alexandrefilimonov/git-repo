package ConsoleApplication1;

import ConsoleApplication1.Program;

public class Program   
{
    public static void main(String[] args) throws Exception {
        Program.Main(args);
    }

    static void Main(String[] args) throws Exception {
        A a = new A();
        System.out.println(a.getClassName());
        C c = new C();
        System.out.println(c.getClassName());
        C b = new C();
    }

}


