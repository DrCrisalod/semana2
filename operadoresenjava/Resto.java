class Resto{
    public static void main (String[] args){
        int dividendo = 15;
        int divisor = 2;
        int resto = dividendo % divisor;
        System.out.println("Resto: " + resto);
 
        int expresion = 3 + dividendo % divisor;
        System.out.println("Expresion: " + expresion);
    }
}