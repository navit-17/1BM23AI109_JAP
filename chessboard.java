public class chessboard {
    public static void main(String[] args){
        boolean flag = true;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(flag){
                    System.out.print(" w ");
                    flag = false;
                }
                else{
                    System.out.print(" b ");
                    flag = true;
                }
            }
            System.out.println();
        }
    }
}
