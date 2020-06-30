//字节流示例
import java.io.*;

//文件复制的示例程序(不需要关心流的内容是什么格式)
//使用单纯的InputStream 和 OutputStream
public class TestFileStreamCopy {
    public static void main(String[] args) throws IOException {
        //生成输入文件的输入流对象，字节流
        InputStream in=new FileInputStream("d:/test/a.txt");
        //生成输出文件的输出流对象，字节流
        OutputStream out=new FileOutputStream("d:/test/b.txt");
        byte[] buff=new byte[256];
        int len=0;
        //循环读取到 buff中，如果文件到底，则读取数据的长度为-1
        while ((len=in.read(buff))!=-1){
            out.write(buff);
        }
        in.close();
        out.close();
    }
}
