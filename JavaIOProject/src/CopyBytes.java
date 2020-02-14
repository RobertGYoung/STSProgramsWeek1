
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class CopyBytes {
	    public static void main(String[] args) throws IOException {
	        FileInputStream in = null;
	        FileOutputStream out = null;
	        try {
	            in = new FileInputStream("Sunset.jpg");
	            out = new FileOutputStream("SunsetByte.jpg");
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
	        System.out.println("Copied the Bytes from the File ! ! !");
	    }
	}
	
