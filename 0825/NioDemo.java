public class NioDemo {
	public static void main(String[] args) {
		NonBuffer.start();
		try{
			SmallBuffer.copy("C:/temp/demo.zip", 
				                    "C:/temp/smallbuffer.zip");
		}catch(java.io.IOException ex){}
		SmallBuffer.end();
		long difference = SmallBuffer.during();
		System.out.println("���翡 �ɸ� �ð��� " + difference + " ms");
	}
}
