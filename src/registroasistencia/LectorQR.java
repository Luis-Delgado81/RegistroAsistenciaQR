
package registroasistencia;

import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class LectorQR {
    public static void main(String[] args) {
        String filename = "captura.png"; // Imagen capturada con la cámara
        String qrData = decodeQRCode(new File(filename));

        if (qrData != null) {
            System.out.println("✅ Código QR detectado: " + qrData);
        } else {
            System.out.println("❌ No se detectó código QR.");
        }
    }

    private static String decodeQRCode(File qrImage) {
        try {
            BufferedImage bufferedImage = ImageIO.read(qrImage);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(bufferedImage)));

            Result result = new MultiFormatReader().decode(bitmap);
            return result.getText();
        } catch (Exception e) {
            return null;
        }
    }
}
