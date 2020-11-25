public class StopWatch {
    private long startime;
    private long endtime;

    public StopWatch() {
    }

    public long getStartime() {
        return startime;
    }

    public long getEndtime() {
        return endtime;
    }
    public void star(){
        startime = System.currentTimeMillis();
//        hàm trả về thời gian thực
    }

    public void stop(){
         endtime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return  endtime - startime;
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.star();
        int arr[] = new int[100000];
        for(int i=0; i<100000;i++){
            arr[i] = (int) Math.floor(Math.random() * 100000);
        }
        int max = 0;
        for(int i=max;i< arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
//        for (int i =0; i<1000000;i++){
//            System.out.println(i);
//        }
        time.stop();
        System.out.println("Số lớn nhất trong mảng là: " + " " + max);
        System.out.println("Ton thoi gian la: "+time.getElapsedTime() + " " + "milisecond's");
    }
}
