
package registroasistencia;

import org.opencv.core.Core;

public class LoadOpenCV {
    public static void main(String[] args) {
        try {
            System.out.println("🔥 Intentando cargar OpenCV...");

            // Configurar la ruta correctamente
            String opencvPath = "D:/opencv/build/java/x64/opencv_java4110.dll";
            System.load(opencvPath);  

            System.out.println("✅ OpenCV cargado correctamente.");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("❌ Error al cargar OpenCV: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
