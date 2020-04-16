package week01.aufgabe5.src;

public class ImageProcessing {

	static int[][] invert(int[][] pixels) {
		// implement image inversion (negate all pixels)
		System.out.println("invert");
		//System.out.println(Arrays.toString(pixels[0]));
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[0].length; j++) {
				pixels[i][j] *= -1;
			}
		}
		//System.out.println(Arrays.toString(pixels[0]));
		return pixels;
	}


	static int[][] rotate(int[][] pixels) {
		// implement image rotation (90 degrees to the right)
		System.out.println("rotate");
		int[][] result = new int[pixels[0].length][pixels.length];
		for (int i = 0; i < result.length ; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = pixels[j][i];
			}
			//System.out.println(Arrays.toString(result[i]));
		}
		return result;
	}

	
	static int[][] mirror(int[][] pixels) {
		// implement image mirroring (horizontal, left <-> right)
		System.out.println("mirror");
		int[][] result = new int[pixels.length][pixels[0].length];
		for (int i = 0; i < pixels.length ; i++) {
			for (int j = 0; j < pixels[0].length; j++) {
				result[i][j] = pixels[i][pixels[0].length -1 - j];
			}
		}
		return result;
	}
	
	static int[][] gray(int[][] pixels) {
		// optional task (advanced)
		System.out.println("gray");
		return pixels;
	}
}
