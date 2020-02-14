
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	public class CopyCharacters {
	    public static void main(String[] args) throws IOException {
	        FileReader in = null;
	        FileWriter out = null;
	        try {
	            in = new FileReader("testFile.txt");
	            out = new FileWriter("C:\\Users\\Rahb\\Documents\\testFile01.txt");
	            int c;
	            while ((c = in.read()) != -1) {
	                out.write(c);
	               }
	        } finally {
	            if (in != null) {
	                in.close();
	            }
	            if (out != null) {
	                out.close();
	            }
	        }
	        System.out.println("Copied the Chars from the File ! ! !");
	    }
	}
	



