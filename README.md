SISTEMAS EN JAVA DONDE SE REGISTRE LA ASISTENCIA DE LOS ESTUDIANTE DIA Y HORA, LEYENDO UN QR QUE TIENE (NOMBRE COMPLETO Y ID) DE CADA ESTUDIANTE QUE IMPORTE EN EXCEL Y EN PDF 

1. La entrada de datos usaremos cámara web, se puede permitir registro manual 
2. El almacenamiento será en base de datos MySQL y pueden ser accesible por profesores y administradores. 
3. Se guardará en archivo Excel/PDF si se puede agregar filtro de fecha y estudiante. 
4. Con interfaz gráfica también que tenga login de ingreso para identificar profesores y administradores. 

Arquitectura del Proyecto 

✅ Entrada de datos 
• Usaremos una cámara web para leer los códigos QR con zxing. 
• Permitiremos el registro manual en caso de errores de escaneo. 

✅ Base de datos (MySQL) 
• Tabla usuarios: ID, nombre completo, tipo (profesor/administrador/estudiante). 
• Tabla asistencia: ID, fecha, hora, estudianteID. 
• Consultas SQL optimizadas para acceso rápido. 

✅ Exportación a Excel/PDF 
• Usaremos Apache POI para Excel. 
• iTextPDF para generar reportes con filtros de fecha y estudiante. 

✅ Interfaz gráfica (Swing/JavaFX) 
• Pantalla de login para identificar profesores y administradores. 
• Panel de control con opciones para registrar asistencia, visualizar reportes y exportar datos.
