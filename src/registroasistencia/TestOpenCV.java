package registroasistencia;

import org.opencv.core.Core;

public class TestOpenCV {
    public static void main(String[] args) {
        try {
            System.out.println("🔥 Intentando cargar OpenCV...");
            
            System.load("D:/opencv/build/java/x64/opencv_java4110.dll");
            
            System.out.println("✅ OpenCV cargado correctamente.");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("❌ Error al cargar OpenCV: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

