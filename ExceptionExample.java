Import java.io.FileInputStream;
Import java.io.FileOutputStream;
Import java.io.FileNotFoundeException;
class Exception
{
  void readFile() throws FileNotFoundexception
  {
    FileInputStream fis= new FileInputStream("dev/JavaPractice/Addition.java");
  }
  void saveFile()  throws FileNotFoundexception
  {
      FileOutputStream fos= new FileOutputStream("dev/JavaPractice/Multiply.java");
  }
}

class Test
{
  public static void main(String args[])
  {
    ExceptionExample ee=new ExceptionExample();

      try
      {
        e.readFile();
      }
      catch(FileNotFoundexception e)
      {
        e.printStackTrace();
      }
      Syste.out.println("Hello");

  }
}
