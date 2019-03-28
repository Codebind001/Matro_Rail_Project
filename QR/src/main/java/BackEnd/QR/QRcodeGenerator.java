package BackEnd.QR;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;


public class QRcodeGenerator {
	
	private String QRCODE_PATH="X:\\Java Code\\";
	
	public String writeQRCode(Infomation info) throws WriterException, IOException {
		
		String qrcode=QRCODE_PATH+info.getUser_name()+"-QRCODE.png";
		
		QRCodeWriter writer=new QRCodeWriter();
		BitMatrix bitMatrix=writer.encode(
				info.getUser_name()+ "\n" +info.getUser_id()+ "\n" +info.getUser_source()+
				"\n" +info.getUser_destination()+ "\n" +info.getT_price(), BarcodeFormat.QR_CODE, 350, 350);
		
		Path path = FileSystems.getDefault().getPath(qrcode);
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
		return "QRCODE is generated successfully...";
	}
	
    public static void main( String[] args ) throws Exception, IOException{
    	
    	QRcodeGenerator cdgenerator = new QRcodeGenerator();
    	System.out.println(cdgenerator.writeQRCode(new Infomation("Joy", "56ty66", "Framegate", "Mirpur 11", "15 Taka")));
        
    }
}
