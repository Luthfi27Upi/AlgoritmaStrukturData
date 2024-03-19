public class Faktorial{

    public int nilai;
    int faktoBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }
    int faktoDC(int n){
        if(n==1){
            return 1;
        }
        else{
            int fakto = n * faktoDC(n-1);
            return fakto;
        }
    }
}