public class Demo3 {
    public static void main(String[] args) {
        System.out.println("1.除法计算开始");
        try{
            System.out.println("2.除法计算:"+(10/1));
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("##################################");
        }
        System.out.println("3.除法计算结束");
    }
}
