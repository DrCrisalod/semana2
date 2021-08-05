class OperadoresIncrDecr{
    public static void main (String[] args){
        int a = 10;
        int b = 10;
        System.out.println("a++: " + a++); //1º Evalua con a y luego la incrementa.
        System.out.println("++b: " + ++b); //1º Incrementa y luego evalua con el nuevo valor.
 
        System.out.println(a); //Comprobamos que el valor se ha incrementado.
        System.out.println(b); //Comprobamos que el valor se ha incrementado.
    }
}