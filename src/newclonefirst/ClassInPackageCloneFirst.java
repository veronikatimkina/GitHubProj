package newclonefirst;

public class ClassInPackageCloneFirst {
    public static Integer sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.printf(sum(1, 2).toString());
    }
}
