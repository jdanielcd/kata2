package kata2;

public class Kata2 {

    public static void main(String[] args) {
        int[] vector = {1,2,4,3,3,5,8,6,3,3,2};
        int[] frecuency = {0,0,0,0,0,0,0,0,0,0};
        int aux;
        
        
        for(int i=0; i<vector.length; i++){
           aux = frecuency[vector[i]];
           aux++;
           frecuency[vector[i]] = aux;
        }
        
        for(int j=0; j<frecuency.length; j++){
            System.out.println(j+":"+frecuency[j]);
        }
        aux = 0;
        for(int k=0; k<frecuency.length; k++){
            if(aux < frecuency[k]){
               aux = k;
            }
        }
        System.out.println("El valor más frecuente es: " + aux);
        
        
        
        
    }
}
