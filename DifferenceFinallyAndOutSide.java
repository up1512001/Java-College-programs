class DifferenceFinallyAndOutSide {
    public static void main(String[] args) throws Exception {
        try{
            boolean flag = true;
            if(flag){
                throw new Exception("Difference");
            }
        }finally {
            System.out.println("This will Executed");
        }
        System.out.println("This will not Executed");
    }
}