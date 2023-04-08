package window;

import application.mvc.model.ImageModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class MenuFenetre extends JMenuBar implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String MENU_FICHIER_TITRE = "Fichier";
    private static final String MENU_FICHIER_CHARGER = "Charger";
    private static final String MENU_FICHIER_QUITTER = "Quitter";

    private Image image;
    private ImageModel imageApp;

    public ImageModel getImageApp() {
        return imageApp;
    }

    public void setImageApp(ImageModel imageApp) {
        this.imageApp = imageApp;
    }

    PanneauPrincipal panImage = new PanneauPrincipal();

    public MenuFenetre() {
        ajouterMenuFichier();
    }

    private void ajouterMenuFichier() {
        JMenu menuFichier = new JMenu(MENU_FICHIER_TITRE);
        JMenuItem menuCharger = new JMenuItem(MENU_FICHIER_CHARGER);
        JMenuItem menuQuitter = new JMenuItem(MENU_FICHIER_QUITTER);

        menuCharger.addActionListener((ActionEvent e) -> {
            JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            fileChooser.setDialogTitle("Sélectionnez un fichier de configuration");
            fileChooser.setAcceptAllFileFilterUsed(false);
            // Créer un filtre
            FileNameExtensionFilter filtre = new FileNameExtensionFilter(".jpg", "jpg");
            fileChooser.addChoosableFileFilter(filtre);
            int returnValue = fileChooser.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println(selectedFile.getAbsolutePath());

                try {
                    image = ImageIO.read(selectedFile);
                    imageApp = ImageModel.getInstance();
                    imageApp.setPath(selectedFile.getAbsolutePath());


                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        });

        menuQuitter.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        menuFichier.add(menuCharger);
        menuFichier.add(menuQuitter);

        add(menuFichier);
    }
}
