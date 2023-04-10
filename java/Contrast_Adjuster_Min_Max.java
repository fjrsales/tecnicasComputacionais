package tecnicas_2022_2;

import ij.ImagePlus;
import ij.gui.Plot;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

public class Contrast_Adjuster_Min_Max implements PlugInFilter {
	
	public int width;
	public int height;
	
	public int setup(String arg, ImagePlus imp) {
		// TODO Auto-generated method stub
		this.width = imp.getWidth();
		this.height = imp.getHeight();
		return DOES_8G;
	}

	public void run(ImageProcessor ip) {
		// TODO Auto-generated method stub
		byte[] pixels = (byte[]) ip.getPixels();
		
		// Encontrar min e max --> como fazer isso?
		
		// Varrer a imagem para reprocessar as intensidades
		
			// new_value = Funcao linear --> como montar essa equacao?
		
		// Criar uma nova imagem associando para cada (x,y) a nova intensidade
		
				
		Plot plot = new Plot("Histogram","Value","Counts");
		plot.add("Histogram", values, histogram);
		plot.show();
		
		
	}

}
