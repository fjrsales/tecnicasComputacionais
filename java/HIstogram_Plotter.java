public class Histogram_Plotter implements PlugInFilter {
	
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
		double[] histogram = new double[256];
		double[] values = new double[256];
		for (int i = 0; i < pixels.length; i++) {
			histogram[0xff & pixels[i]]++;
		}
		
		for (int i = 0; i < histogram.length; i++) {
			System.out.println(i +": "+histogram[i]);
			values[i] = i;
		}
		
		Plot plot = new Plot("Histogram","Value","Counts");
		plot.add("Histogram", values, histogram);
		plot.show();	
	}
}
