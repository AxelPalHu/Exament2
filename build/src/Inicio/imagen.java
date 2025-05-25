package Inicio;
import Inicio.imagen;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class imagen {
    public static ImageIcon hacerImagenOpaca(String ruta, float opacidad) {
        try {
            BufferedImage original = ImageIO.read(new File(ruta));

            BufferedImage transparente = new BufferedImage(
                original.getWidth(),
                original.getHeight(),
                BufferedImage.TYPE_INT_ARGB
            );

            Graphics2D g2d = transparente.createGraphics();
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidad));
            g2d.drawImage(original, 0, 0, null);
            g2d.dispose();

            return new ImageIcon(transparente);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            return null;
        }
    }
}