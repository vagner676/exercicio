import java.util.Arrays;

class Main {
  public static void main(String[] args) {
 int [] vetor = {5,4,9,7,6};
    invert(vetor);
    System.out.println(Arrays.toString(vetor));
    }

  public static void invert(int[] v) {
    for(int i =0; i< v.length/ 2; i++){
      int aux = v[i];
      v[i]= v[v.length -1 -i];
      v[v.length -1 - i] = aux;
    }
  }