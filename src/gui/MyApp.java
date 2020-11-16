package gui;


public class MyApp {

	/*
	 * u argumentu args nalaze se vrednosti unete u delu Run->Run
	 * configurations->Arguments->Program arguments U slučaju potrebe za većim
	 * brojem ulaznih parametara, unose se odvojeni sa "parametar1" "parametar2"
	 */
	public static void main(String[] args) {

		// provera da li uopste postoji uneta vrednost ulaznog argumenta
		if (args.length != 0) {

			int param = 0;
			String arg0 = args[0];
			try {
				param = Integer.parseInt(arg0);
			} catch (Exception e) {
				System.out.println("Neispravna vrednost ulaznog parametra");
				System.exit(0);
			}
		} else {

			Frame frame = new Frame();
			frame.setVisible(true);

		}

	}

}
