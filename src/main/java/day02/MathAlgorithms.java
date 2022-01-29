package day02;

public class MathAlgorithms {

    public int findLnko(int first, int second){
        int lnko = 1;
        for (int i = 2; i <= first && i <= second; i++){
            if (first % i == 0 && second % i == 0){
                lnko = i;
            }
        }
        return lnko;
    }

    public int findLnkoWithWhile(int first, int second){
        while (first != second){
            if(first > second){
                first -= second;
            }else{
                second -= first;
            }
        }
        return first;
    }
}
