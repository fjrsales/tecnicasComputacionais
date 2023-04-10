package tecnicas_2022_2;

import ij.ImagePlus;
import ij.io.OpenDialog;
import ij.io.Opener;
import ij.plugin.PlugIn;

public class Hello_World implements PlugIn {

	public void run(String arg0) {
		// TODO Auto-generated method stub
		OpenDialog op = new OpenDialog("Selecione a imagem a ser aberta:");
		String path = op.getPath();
		Opener opener = new Opener();
		ImagePlus imp = opener.openImage(path);
		imp.show();
		imp.getProcessor().invert();
	}

}
