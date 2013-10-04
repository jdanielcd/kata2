package kata2;

public class Kata2 {

    public static void main(String[] args) {
        int[] vector = {1,2,4,3,3,5,8,6,3,3,2};
        int[] frecuency = {0,0,0,0,0,0,0,0,0,0};
        int aux;
        
        
        for (int value : vector) {
            aux = frecuency[value];
            frecuency[value]++;
        }
               
        aux = 0;
        for (int i = 0; i < frecuency.length; i++) {
            if(aux < frecuency[i])
                aux = i;
        }
        System.out.println("El valor más frecuente es: "+aux);
        
    }
}
