public class Control2 {
    public static void main(String[] args){
        Thread thread = ThreadUtil.createThreadInNewState();
        System.out.println(thread.getState());
    }
}
