import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;


public class CvTest {
	public static void main(String args[]){
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat im = Imgcodecs.imread("test.jpg");			// 入力画像の取得
		Imgproc.cvtColor(im, gray, Imgproc.COLOR_RGB2GRAY); 	// 画像のグレースケール変換
		// カラー画像の画素にアクセスして画素値(R,G,B)を取得
		double[] data = new double[3]; 
		data = im.get(100, 200);                            	// (100,200)の画素値を取得
		// グレースケール画像の画素にアクセスして画素値を取得
		Mat gray = new Mat();
		double[] data2 = new double[1]; 
		data2 = gray.get(100, 200);                         	// (100,200)の画素値を取得
		//取得した画素値をコンソールに表示
		System.out.println("Blue：" + data[0]);
		System.out.println("Green：" + data[1]);
		System.out.println("Red：" + data[2]);
		System.out.println("Gray：" + data2[0]);
	}
}
