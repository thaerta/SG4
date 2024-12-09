import java.util.Random;




public class Dice {

    int results[] = new int [6];

    public Dice (){

        for (int i = 0 ; i < results.length;i++){
            results[i] = 0 ;
        }
    }


    public void throw1000Times(){
        Random rand = new Random();
        int myThrow = 0 ;
        for (int i = 0;i <1000;i++) {
            myThrow = rand.nextInt(6) + 1;
            results[myThrow - 1] += 1;
        }
    }

    public int maxResult(){
        int num = 0;
        int face = 0;
        for (int i = 0; i < results.length;i++ ){
            if (results[i]>num){
                num=results[i];
                face= i+1;
            }
        }
        return face;

    }

    public void showResults (){
        for (int i = 0 ; i < results.length;i++){
            System.out.println(results[i]);
        }

    }

    public int[] douplicatesMaxResult(){
        int count = 0;
        int maxRecurrencies = results[maxResult()];
        for (int i = 0; i<results.length;i++){
            if (maxRecurrencies == results[i]){
                count = count +1;
            }
        }
        int douplicates[]=new int[count];
        count=0;
        for (int i = 0; i<results.length;i++){
            if (maxRecurrencies == results[i]){
            douplicates[count]=i + 1;
            count = count +1;

            }
        }
        return douplicates;

    }

}
