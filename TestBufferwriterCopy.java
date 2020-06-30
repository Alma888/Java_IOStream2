//缓冲字符流示例
import java.io.*;

public class TestBufferwriterCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader=new BufferedReader(new FileReader("D:\\a.txt"));

        BufferedWriter bWriter=new BufferedWriter(new FileWriter("D:\\b.txt"));
        String content=" ";
        //readLine一行一行的读取
        while ((content=bReader.readLine())!=null){
            //\r\n换行
            bWriter.write(content+"\r\n");
        }
        // * 关闭流的顺序：
        //  * 当A依赖B的时候先关闭A，再关闭B
        //  * 带缓冲的流最后关闭的时候会执行一次flush

        bReader.close();
        bWriter.close();
    }
}
