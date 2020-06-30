//字符流示例
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//使用 FileReader 和 FileWriter 复制文件：
public class TestFilewriterCopy {
    public static void main(String[] args)throws IOException {
        //创建输入流对象
        FileReader fr=new FileReader("D:\\a.txt");

        //创建输出流对象
        FileWriter fw=new FileWriter("D:\\b.txt");
        //读写数据
        int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }
        //释放资源
        fw.close();
        fr.close();
    }
}
