package image;

public class ImageDisplay implements IDisplayable {

	private String filepath;

	public ImageDisplay(String filepath) {
		super();
		this.filepath = filepath;
		loadConfig();
	}

	private void loadConfig() {
		// Super Heavy Task
		System.out.println("pre-intializing task");
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying following image " + filepath);

	}

}
