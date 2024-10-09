package glimmertask7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//思路：
//try {
//	open;
//	check;
//	format;
//	close;
//}catch(openFailed) {
//}catch(checkFailed) {
//}catch(fomatError) {
//}catch(closeFailed) {
//}


//自定义异常类
class FileNotFoundException extends Exception{
	public FileNotFoundException(String message) {
        super(message);
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class ReadFile {
	public static void main(String[] args) throws IOException,FileNotFoundException,EmptyFileException {
		String file = "data.txt";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			if ( line == null ) {
				throw new FileNotFoundException("文件为空\n");
			}
			
//			String line = reader.readLine();
			
			double sum = 0;
			int count = 0;
			while( line != null) {
				try {
					int number = Integer.parseInt(line.trim());//判断line是否能转化为整数型，如果是，将其转化为整数
					sum = sum+number;
					count++;
				}catch(NumberFormatException e) {
					System.err.println("内容格式错误:"+line);
				}
				line = reader.readLine();
			}
			double average = sum/count;
			System.out.println("这些整数的平均值是："+average);
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("文件未找到");
		}finally {
			reader.close();
		}


	}
	
}















