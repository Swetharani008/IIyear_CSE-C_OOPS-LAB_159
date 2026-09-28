// EX.NO:6 DEMONSTRATE THE IMMUTABLE NATURE OF WRAPPER CLASSES (INTEGER AND DOUBLE)

class EX_NO_6
{
    public static void main(String args[])
    {
        // Integer Wrapper
        Integer i = Integer.valueOf(100);

        System.out.println("Before Modification");
        System.out.println("Integer Value : " + i);
        System.out.println("Hash Code     : " + System.identityHashCode(i));

        // Modification
        i = i + 50;

        System.out.println("\nAfter Modification");
        System.out.println("Integer Value : " + i);
        System.out.println("Hash Code     : " + System.identityHashCode(i));

        // Double Wrapper
        Double d = Double.valueOf(25.5);

        System.out.println("\nBefore Modification");
        System.out.println("Double Value  : " + d);
        System.out.println("Hash Code     : " + System.identityHashCode(d));

        // Modification
        d = d * 2;

        System.out.println("\nAfter Modification");
        System.out.println("Double Value  : " + d);
        System.out.println("Hash Code     : " + System.identityHashCode(d));
    }
}

OUTPUT:

Before Modification
Integer Value : 100
Hash Code     : 1510467688

After Modification
Integer Value : 150
Hash Code     : 1995265320

Before Modification
Double Value  : 25.5
Hash Code     : 746292446

After Modification
Double Value  : 51.0
Hash Code     : 1072591677
