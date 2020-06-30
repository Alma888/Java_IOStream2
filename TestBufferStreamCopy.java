//缓冲字节流示例
import java.io.*;

//使用 BufferedInputStream 和 BufferedOutputStream实现文件拷贝
public class TestBufferStreamCopy {
    public static void main(String[] args)throws IOException {
        File file=new File("demo.txt");
        if(!file.isFile()){
            return;
        }
        BufferedInputStream bfis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bfos=new BufferedOutputStream(new
                FileOutputStream("src\\"+file.getName()));//copy到src目录下
        byte[] buff=new byte[1024];
        int temp=0; //边读边写
        while ((temp=bfis.read(buff))!=-1){//读
            bfos.write(buff);           //写
        }
        bfos.flush();
        bfis.close();
        bfos.close();
        System.out.println("copy成功！");
    }
}
