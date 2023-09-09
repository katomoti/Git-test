import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("D:\\Downloads\\RiceShower");

        System.out.println(HowBig(file));
    }

    public static long HowBig(File file){
        long sum = 0;//文件夹大小
        File[] files = file.listFiles();//获取当前文件夹下的所有内容
        if (files != null){
            for (File f1: files){//遍历当前文件夹下的内容
                //判断是否为文件
                if (f1.isFile()){
                    //是文件
                    sum += f1.length();
                }else {
                    //是文件夹
                    sum += HowBig(f1);

                }
            }
        }
        return sum;
        //修改远程文件测试
    }
}
