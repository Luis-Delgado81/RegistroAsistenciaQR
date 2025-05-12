package registroasistencia;

import org.opencv.core.Core;

public class pruebaOpenCV {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("¡OpenCV cargò exitosamente..!");
    }
}

