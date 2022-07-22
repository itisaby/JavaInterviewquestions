package aby.Recursion;

public class PatternQuestions {
    public static void main(String[] args) {
        reversetriangle(5);
        printtri(5,0);
        printtri2(5, 0);
    }
    static void reversetriangle(int n){
        if(n==0){
            return;
        }
        cols(n);
        System.out.println();
        reversetriangle(n-1);
    }
    static void cols(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        cols(n-1);
    }
    static void printtri(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            printtri(r, c+1);
        }else{
            System.out.println();
            printtri(r-1, 0);
        }
    }
    static void printtri2(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            printtri2(r, c+1);
            System.out.print("*");

        }else{
            printtri2(r-1, 0);
            System.out.println();
        }
    }
}
